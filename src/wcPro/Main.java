package wcpro;
import java.io.IOException;
/**
 * 
 * @author LUCIUS
 * 功能：主函数，调用各个模块，实现词频统计
 *
 */

public class Main 
{
	public static void main(String[] args) throws IOException
	{
		
		if(args[0].equals("-x"))
		{
			new CountGUI();
		}
		else
		{
			String f=new String();
			f=Input.checkInput(args);
			Count.countFile(f);
			Output op=new Output(Count.slist, Count.fqc, Count.record);
			op.out();
		}
		//Count.countFile(cg.s);
		
		//System.out.println(Count.slist[0]);
	}	
}
