package wcPro;

import java.io.IOException;



public class Main 
{
	public static void main(String[] args) throws IOException
	{
		Input ip=new Input();
		String f=new String();
		f=Input.checkInput(args);
		Count ct=new Count();
		Count.countFile(f);
		Output op=new Output(Count.slist,Count.fqc,Count.record);
		op.out();
		//System.out.println(Count.slist[0]);
	}	
}
