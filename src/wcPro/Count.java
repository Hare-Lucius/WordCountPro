package wcpro;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
/**
 *  
 * @author LUCIUS
 * ���ܣ�ͳ�ƴ�Ƶ����Ƶ�ʽ������У�����ͬƵ���ʰ���ĸ˳������
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
				}// ��Ƶͳ�ƣ�ѭ��֮�������һ�ζ����ж�
				
				sort(fqc,0,record);//��Ƶ���򣨿�������
				
				/*int m = 0,n = 0;
				while (m <= record && n <= record){
					 while (fqc[m] == fqc[n]){
						 n++;
				     }
					 Arrays.sort(slist, m, n);
					 m = n;
				}// ͬƵ��������	 */
			}
		}
		catch (FileNotFoundException e){
			 System.out.println("File Doesn't Exist��");
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
		
	}// ��ͳ�Ƶõ��ĵ��ʽ��бȶԲ�¼��
	
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
            // �Ӻ���ǰ�Ƚ�
            while(end > start && a[end] <= key)  // ���û�бȹؼ�ֵС�ģ��Ƚ���һ����ֱ���бȹؼ�ֵС�Ľ���λ�ã�Ȼ���ִ�ǰ����Ƚ�
                end--;
            if(a[end] >= key){
            	swap(start, end);
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            // ��ǰ����Ƚ�
            while(end > start && a[start] >= key){
               start++;
            }
            if(a[start] <= key){
            	swap(start, end);
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        // ��ʱ��һ��ѭ���ȽϽ������ؼ�ֵ��λ���Ѿ�ȷ���ˡ���ߵ�ֵ���ȹؼ�ֵС���ұߵ�ֵ���ȹؼ�ֵ�󣬵������ߵ�˳���п����ǲ�һ���ģ���������ĵݹ����
        }
        // �ݹ�
        if(start > low) sort(a, low, start-1);// ������С���һ������λ�õ��ؼ�ֵ����-1
        if(end < high) sort(a, end+1, high);// �ұ����С��ӹؼ�ֵ����+1�����һ��
    }// ���������ʵ��
}