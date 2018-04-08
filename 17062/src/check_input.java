import java.io.File;


public class check_input {

	 public static String checkInput(String[] args){
		 String inputFile = null;
		 if(args.length==0)
		 {
			 System.out.println("请输入待分析的文件名！！");
			 return "a";
		 }
		 if(args.length>1)
		 {
			 
			 System.out.println("该程序一次只能分析一个文件，请注意参数数量！！");
			 return "b";
		 }
		 else
		 {
			 inputFile = args[0];
			 if(!inputFile.endsWith(".txt"))
			 {
				 System.out.println("该程序只能扫描txt文件！！");
				 return "c";
			 }
			 else{
				 File txtFile=new File(inputFile);
				 if(!txtFile.exists())
				 {
					 System.out.println("文件不存在！！");
					 return "d";
				 }
				 else
				 {
					 return inputFile;
				 }
			 }
		 }
		//return inputFile;
		 
	 }
}
