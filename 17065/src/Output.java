import java.io.*;
public class Output {
	private String[] name;
	private int[] num;
	private int length=0;
	public Output(String[] name,int[] num)
	{
		this.name=name;
		this.num=num;
	}
	public int out() throws IOException{
        if(name.length>100) length=100;
        else if(name.length==0) 
        	{
        	System.out.println("没有统计到单词"); 
        	return 0;
        	}
        else length=name.length ;
        if(name.length!=num.length) 
        	{
        	System.out.println("单词数量统计错误"); 
        	return 1;
        	}
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("d:/wordcountPro.txt")),true)); 
		for(int i=0;i<length;i++)
		{
			if(num[i]<=0) 
			{
		        System.setOut(new PrintStream(new BufferedOutputStream(  
		                new FileOutputStream(FileDescriptor.out)),true));  
		        System.out.println("单词数量统计错误");
		        return 1;
			}
			System.out.println(name[i]+" "+num[i]);
		}
		return 2;
	}

}
