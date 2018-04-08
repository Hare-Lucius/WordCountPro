package wcpro;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
/**
 *  
 * @author LUCIUS
 * 功能：统计词频并按频率降序排列，对于同频单词按字母顺序排列
 *
 */
public class Count{
    static String[] slist = new String[100000];
	static int[] fqc = new int[100000];
	static int record;

	public static void countFile(String file){
		for (int j = 0;j < slist.length;j++){
			slist[j] = null;
		}
		for (int j = 0;j < fqc.length;j++){
			fqc[j] = 0;
		}
		try {
			File fi = new File(file);
			Scanner in = new Scanner(fi);
		    while (in.hasNextLine()){
		    	int i = 0,start = 0,end = 0,sf = 0;
				String str = in.nextLine();
				while (i < str.length()){
					char b = str.charAt(i);
					boolean judge = (b >= 'a' && b <= 'z' || b>= 'A' && b <= 'Z' || b == '-');
					if (judge){
						if (sf == 0){
							start = i;
							sf = 1;
						}
						i++;
					}
					else {
						if (sf == 1){
							end = i-1;
							while (str.charAt(end) == '-'){
								end--;
							}
							sf = 0;
							list(str.substring(start, end+1).toLowerCase());	
						}
						i++;
					}
	            }
				if (sf == 1){
					end = i-1;
					while (str.charAt(end) == '-'){
						end--;
					}
					sf = 0;
					list(str.substring(start, end+1).toLowerCase());
				}// 词频统计，循环之后需进行一次额外判断
				
				sort(fqc,0,record);//词频排序（快速排序）
				
				/*int m = 0,n = 0;
				while (m <= record && n <= record){
					 while (fqc[m] == fqc[n]){
						 n++;
				     }
					 Arrays.sort(slist, m, n);
					 m = n;
				}// 同频单词排序	 */
			}
		}
		catch (FileNotFoundException e){
			 System.out.println("File Doesn't Exist！");
	    }
	}
	
	public static void list(String s){
		int i,j,index = -1;
		for (j = 0;j < slist.length;j++){
			if (slist[j] == null){
			    break;
			}
		}
		for (i = 0;i < j;i++){
			if (slist[i].equals(s)){
				index = i;
				fqc[i]++;
				record = j-1;
				break;
			}
		}
		if (index == -1){
		    slist[j] = s;
		    fqc[j] = 1;
		    record = j;
		}
		
	}// 将统计得到的单词进行比对并录入
	
	public static void swap(int a, int b){
		String t;
		t=slist[a];
		slist[a]=slist[b];
		slist[b]=t;
	}
	
	public static void sort(int[] a, int low, int high){
        int start = low;
        int end = high;
        int key = a[low];
        while(end > start){
            // 从后往前比较
            while(end > start && a[end] <= key)  // 如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            if(a[end] >= key){
            	swap(start, end);
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            // 从前往后比较
            while(end > start && a[start] >= key){
               start++;
            }
            if(a[start] <= key){
            	swap(start, end);
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        // 此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        // 递归
        if(start > low) sort(a, low, start-1);// 左边序列。第一个索引位置到关键值索引-1
        if(end < high) sort(a, end+1, high);// 右边序列。从关键值索引+1到最后一个
    }// 快速排序的实现
}