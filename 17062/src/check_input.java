import java.io.File;


public class check_input {

	 public static String checkInput(String[] args){
		 String inputFile = null;
		 if(args.length==0)
		 {
			 System.out.println("��������������ļ�������");
			 return "a";
		 }
		 if(args.length>1)
		 {
			 
			 System.out.println("�ó���һ��ֻ�ܷ���һ���ļ�����ע�������������");
			 return "b";
		 }
		 else
		 {
			 inputFile = args[0];
			 if(!inputFile.endsWith(".txt"))
			 {
				 System.out.println("�ó���ֻ��ɨ��txt�ļ�����");
				 return "c";
			 }
			 else{
				 File txtFile=new File(inputFile);
				 if(!txtFile.exists())
				 {
					 System.out.println("�ļ������ڣ���");
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
