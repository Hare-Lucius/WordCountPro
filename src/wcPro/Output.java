package wcpro;
import java.io.*;
/**
 * 
 * @author xuhao
 * ���ܣ���ǰһ�ٸ���Ƶ����Ӧ���ʰ�ָ����ʽ������ı��ĵ�
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
        	System.out.println("û��ͳ�Ƶ�����"); 
        	}
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("output.txt")),true)); 
		for (int i = 0;i < record;i++){
		    if (num[i] < 0) {
		        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));  
		        System.out.println("��������ͳ�ƴ���");
			}
			System.out.println(name[i] + " " + num[i]);
		}
        System.setOut(new PrintStream(new BufferedOutputStream(  
                new FileOutputStream(FileDescriptor.out)),true));  
	}
}