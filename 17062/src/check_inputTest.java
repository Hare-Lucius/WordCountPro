import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class check_inputTest extends TestCase {
	private check_input check_input;
    
	String[] testStr1 = {};
	String[] testStr2 = {"dontExist.txt"};
	String[] testStr3 = {"D:\\MyEclipse-WorkSpace\\try.txt","D:\\MyEclipse-WorkSpace\\try1.txt"};
	String[] testStr4 = {"dontEndWiitn.c"};
	String[] testStr5 = {"D:\\MyEclipse-WorkSpace\\try.txt"};
	String[] testStr6 = {"D:\\MyEclipse-WorkSpace\\try.java"};
	String[] testStr7 = {"D:\\MyEclipse-WorkSpace\\try.java","D:\\MyEclipse-WorkSpace\\try2.java"};
	String[] testStr8 = {"D:\\MyEclipse-WorkSpace\\try.Txt"};
	String[] testStr9 = {"D:\\MyEclipse-WorkSpace\\try.TXt"};
	String[] testStr10 = {"D:\\MyEclipse-WorkSpace\\try.TXT"};
	String[] testStr11 = {"D:\\MyEclipse-WorkSpace\\try.tXT"};
	String[] testStr12 = {"D:\\MyEclipse-WorkSpace\\try.txT"};
	String[] testStr13 = {"D:\\MyEclipse-WorkSpace\\try.tXt"};
	String[] testStr14 = {"D:\\MyEclipse-WorkSpace\\try.txT"};
	String[] testStr15 = {"D:\\MyEclipse-WorkSpace\\try.txt.txt"};
	String[] testStr16 = {"D"};
	String[] testStr17 = {"",""};
	String[] testStr18 = {"   "};
	String[] testStr19 = {"D:\\MyEclipse-WorkSpace\\try.txt   "};
	String[] testStr20 = {"     D:\\MyEclipse-WorkSpace\\try.txt"};
	

	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		check_input = new check_input();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testCheckInput1() {
		assertEquals(check_input.checkInput(testStr1),"a");
		
	}
	
	@Test
	public void testCheckInput2() {
		assertEquals(check_input.checkInput(testStr2),"d");

	}
	
	@Test
	public void testCheckInput3() {
		assertEquals(check_input.checkInput(testStr3),"b");
	}
	
	@Test
	public void testCheckInput4() {
		assertEquals(check_input.checkInput(testStr4),"c");
	}
	
	@Test
	public void testCheckInput5() {
		assertEquals(check_input.checkInput(testStr5),"D:\\MyEclipse-WorkSpace\\try.txt");
	}
	
	@Test
	public void testCheckInput6() {
		assertEquals(check_input.checkInput(testStr6),"c");
	}
  
	@Test
	public void testCheckInput7() {
		assertEquals(check_input.checkInput(testStr7),"b");
	}
	
	@Test
	public void testCheckInput8() {
		assertEquals(check_input.checkInput(testStr8),"c");
	}
	
	@Test
	public void testCheckInput9() {
		assertEquals(check_input.checkInput(testStr9),"c");
	}
	
	@Test
	public void testCheckInput10() {
		assertEquals(check_input.checkInput(testStr10),"c");
	}
	
	@Test
	public void testCheckInput11() {
		assertEquals(check_input.checkInput(testStr11),"c");
	}

	@Test
	public void testCheckInput12() {
		assertEquals(check_input.checkInput(testStr12),"c");
	}
   
	@Test
	public void testCheckInput13() {
		assertEquals(check_input.checkInput(testStr13),"c");
	}

	@Test
	public void testCheckInput14() {
		assertEquals(check_input.checkInput(testStr14),"c");
	}

    
	@Test
	public void testCheckInput15() {
		assertEquals(check_input.checkInput(testStr15),"d");
	}
	
	@Test
	public void testCheckInput16() {
		assertEquals(check_input.checkInput(testStr16),"c");
	}
	
	@Test
	public void testCheckInput17() {
		assertEquals(check_input.checkInput(testStr17),"b");
	}
	
	@Test
	public void testCheckInput18() {
		assertEquals(check_input.checkInput(testStr18),"c");
	}
	
	@Test
	public void testCheckInput19() {
		assertEquals(check_input.checkInput(testStr19),"c");
	}
	
	@Test
	public void testCheckInput20() {
		assertEquals(check_input.checkInput(testStr20),"d");
	}
}
