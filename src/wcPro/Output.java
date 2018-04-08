package wcPro;

import java.io.*;
public class Output 
{
	private String[] name;
	private int[] num;
	private int length=0;
	private int record;
	public Output(String[] name,int[] num,int record)
	{
		this.record=record+1;
		this.name=name;
		this.num=num;
	}
	public void out() throws IOException{
        if(record>100) record=100;
        else if(record==0) 
        	{
        	System.out.println("没有统计到单词"); 
        	//return 0;
        	}
       // if(name.length!=num.length) 
        //	{
        //	System.out.println("单词数量统计错误"); 
        	//return 1;
        //	}
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("output.txt")),true)); 
		for(int i=0;i<record;i++)
		{
			if(num[i]<0) 
			{
		        System.setOut(new PrintStream(new BufferedOutputStream(  
		                new FileOutputStream(FileDescriptor.out)),true));  
		        System.out.println("单词数量统计错误");
		        //return 1;
			}
			System.out.println(name[i]+" "+num[i]);
		}
		//return 2;
	}

}
