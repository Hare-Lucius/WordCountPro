package wcpro;
import java.io.*;
/**
 * 
 * @author xuhao
 * 功能：将前一百个词频及对应单词按指定格式输出至文本文档
 *
 */
public class Output{ 
	private String[] name = {};
	private int[] num = {};
	private int record = 0;
	public Output(String[] name,int[] num, int record){
		this.record = record+1;
		this.name = name;
		this.num = num;
	}
	public void out() throws IOException{
        if (record > 100) 
        	{
        	record = 100;
        	}
        else if (record == 0) {
        	System.out.println("没有统计到单词"); 
        	}
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("output.txt")),true)); 
		for (int i = 0;i < record;i++){
		    if (num[i] < 0) {
		        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));  
		        System.out.println("单词数量统计错误");
			}
			System.out.println(name[i] + " " + num[i]);
		}
        System.setOut(new PrintStream(new BufferedOutputStream(  
                new FileOutputStream(FileDescriptor.out)),true));  
	}
}
