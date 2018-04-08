package wcPro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Count
{
	static String[] slist=new String[200];
	static int[] fqc=new int[200];
	static int record;
	
	
	public static void countFile(String file)
	{
		for(int j=0;j<slist.length;j++)
		{
			slist[j]=null;
		}
		for(int j=0;j<fqc.length;j++)
		{
			fqc[j]=0;
		}
		try
		{
			File fi=new File(file);
			Scanner in = new Scanner(fi);
			//String[] sto=new String [100];
		    while (in.hasNextLine()) 
			{
		    	int i=0,start=0,end=0,sf=0;
				String str = in.nextLine();
				while(i<str.length())
	            {
					char b=str.charAt(i);
					if(b>='a'&&b<='z'||b>='A'&&b<='Z'||b=='-')
	            	{
						if(sf==0)
						{
							start=i;
							sf=1;
						}
						i++; 
	            	}
					else
					{
						if(sf==1)
						{
							end=i-1;
							//b=str.charAt(end);
							while(str.charAt(end)=='-')
							{
								end--;
							}
							sf=0;
							list(str.substring(start, end+1).toLowerCase());
							
						}
						i++;
					}
					
					
					    
					//System.out.println(end);
					
	            }
				if(sf==1)
				{
					end=i-1;
					//b=str.charAt(end);
					while(str.charAt(end)=='-')
					{
						end--;
					}
					sf=0;
					list(str.substring(start, end+1).toLowerCase());
				}//词频统计，循环之后需进行一次额外判断
				
				sort(fqc,0,record);//词频排序（快速排序）
				
				
				int m=0,n=0;
				while(m<=record&&n<=record)
				{
					 while(fqc[m]==fqc[n])
						n++;
					 Arrays.sort(slist,m,n);
					 m=n+1;
					 n=m;
				}//同频单词排序
				
				
				
            	 
			}
		    //System.out.println(slist[2]);
		   // System.out.println(fqc[0]);
		}
		catch(FileNotFoundException e) 
		{
			 System.out.println("File Doesn't Exist！");
	    }
		//return slist;
		
	}
	
	public static void list(String s)
	{
		int i,j,index=-1;
		for(j=0;j<slist.length;j++)
		{
			if(slist[j]==null)
			    break;
		}
		for(i=0;i<j;i++)
		{
			if(slist[i].equals(s))
			{
				index=i;
				fqc[i]++;
				record=j-1;
				break;
			}
		}
		if(index==-1)
		{
		    slist[j]=s;
		    fqc[j]=1;
		    record=j;
		}
		
	}//将统计得到的单词进行比对并录入
	
	
	public static int partition(int []array,int lo,int hi)
	{
        int key=array[lo];
        String keys=slist[lo];
        while(lo<hi)
        {
            while(array[hi]<=key&&hi>lo)
            {
                hi--;
            }
            array[lo]=array[hi];
            slist[lo]=slist[hi];
            while(array[lo]>=key&&hi>lo)
            {
                lo++;
            }
            slist[hi]=slist[lo];
        }
        array[hi]=key;
        slist[hi]=keys;
        return hi;
    }
    
    public static void sort(int[] array,int lo ,int hi)
    {
        if(lo>=hi)
        {
            return ;
        }
        int index=partition(array,lo,hi);
        sort(array,lo,index-1);
        sort(array,index+1,hi); 
    }//快速排序的实现
}