import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class OutputTest {
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testOut1() throws IOException {
		String[] name={"1","2","3","4","5","6","7","8","9","10"};				
		int [] num={10,9,8,7,6,5,4,3,2,1};
		Output testOut=new Output(name,num);		
		assertEquals(testOut.out(),2);
	}
	
	@Test
	public void testOut2() throws IOException {
		String[] name = new String[120];				
		int [] num=new int[120];
		for(int i=1;i<=120;i++)
		{
			name[i-1]="i";
			num[i-1]=121-i;			
		}
		Output testOut=new Output(name,num);	
		assertEquals(testOut.out(),2);
	}
	@Test
	public void testOut3() throws IOException {
		String[] name={"1","2","3","4","5","6","7","8","9","10"};				
		int [] num={-1,9,8,7,6,5,4,3,2,1};
		Output testOut=new Output(name,num);	
		assertEquals(testOut.out(),1);
	}
	@Test
	public void testOut4() throws IOException {
		String[] name = new String[120];				
		int [] num=new int[120];
		for(int i=1;i<=120;i++)
		{
			name[i-1]="i";
			num[i-1]=121-i;			
		}
		num[0]=-1;
		Output testOut=new Output(name,num);		
		assertEquals(testOut.out(),1);
	}
	@Test
	public void testOut5() throws IOException {
		String[] name={};				
		int [] num={};
		Output testOut=new Output(name,num);	
		assertEquals(testOut.out(),0);
	}
	@Test
	public void testOut6() throws IOException {
		String[] name={};				
		int [] num={3};
		Output testOut=new Output(name,num);	
		assertEquals(testOut.out(),0);
	}
	@Test
	public void testOut7() throws IOException {
		String[] name={"1","2"};				
		int [] num={1};
		Output testOut=new Output(name,num);	
		assertEquals(testOut.out(),1);
	}
	@Test
	public void testOut8() throws IOException {
		String[] name={"book"};				
		int [] num={1};
		Output testOut=new Output(name,num);	
		assertEquals(testOut.out(),2);
	}
	@Test
	public void testOut9() throws IOException {
		String[] name = new String[100];				
		int [] num=new int[100];
		for(int i=1;i<=100;i++)
		{
			name[i-1]="i";
			num[i-1]=101-i;			
		}
		Output testOut=new Output(name,num);	
		assertEquals(testOut.out(),2);
	}
	@Test
	public void testOut10() throws IOException {
		String[] name = new String[101];				
		int [] num=new int[101];
		for(int i=1;i<=101;i++)
		{
			name[i-1]="i";
			num[i-1]=102-i;			
		}
		Output testOut=new Output(name,num);	
		assertEquals(testOut.out(),2);
	}
	@Test
	public void testOut11() throws IOException {
		String[] name={"book"};				
		int [] num={1};
		Output testOut=new Output(name,num);	
		assertEquals(testOut.out(),2);
	}
	@Test
	public void testOut12() throws IOException {
		String[] name={"book"};				
		int [] num={0};
		Output testOut=new Output(name,num);	
		assertEquals(testOut.out(),1);
	}
	@Test
	public void testOut13() throws IOException {
		String[] name={"book"};				
		int [] num={-1};
		Output testOut=new Output(name,num);	
		assertEquals(testOut.out(),1);
	}
	@Test
	public void testOut14() throws IOException {
		String[] name={};				
		int [] num={1,4};
		Output testOut=new Output(name,num);	
		assertEquals(testOut.out(),0);
	}
	@Test
	public void testOut15() throws IOException {
		String[] name={};				
		int [] num={-1};
		Output testOut=new Output(name,num);	
		assertEquals(testOut.out(),0);
	}
	@Test
	public void testOut16() throws IOException {
		String[] name = new String[80];				
		int [] num=new int[80];
		for(int i=1;i<=80;i++)
		{
			name[i-1]="i";
			num[i-1]=81-i;			
		}
		Output testOut=new Output(name,num);	
		assertEquals(testOut.out(),2);
	}
	@Test
	public void testOut17() throws IOException {
		String[] name = new String[120];				
		int [] num=new int[120];
		for(int i=1;i<=120;i++)
		{
			name[i-1]="i";
			num[i-1]=121-i;			
		}
		num[0]=-1;
		Output testOut=new Output(name,num);	
		assertEquals(testOut.out(),1);
	}
	@Test
	public void testOut18() throws IOException {
		String[] name={"book"};				
		int [] num={-10};
		Output testOut=new Output(name,num);	
		assertEquals(testOut.out(),1);
	}
	@Test
	public void testOut19() throws IOException {
		String[] name={};				
		int [] num={};
		Output testOut=new Output(name,num);	
		assertEquals(testOut.out(),0);
	}
	@Test
	public void testOut20() throws IOException {
		String[] name={"1","2","3"};				
		int [] num={2,1};
		Output testOut=new Output(name,num);	
		assertEquals(testOut.out(),1);
	}
	
}
