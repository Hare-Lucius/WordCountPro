package wordCountPro;

import static org.junit.Assert.*;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WordCountProTest {
	WordCountPro wcp;
	String[] tests=new String[200];
	@Before
	public void setUp() throws Exception {
		wcp=new WordCountPro();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCountFile1() {
		
		assertEquals(WordCountPro.countFile("input1.txt")[0],"in");
		
		//fail("Not yet implemented");
	}
	@Test
	public void testCountFile2() {
		
		
		assertEquals(WordCountPro.countFile("input2.txt")[0],"in");
		//fail("Not yet implemented");
	}

	@Test
	public void testCountFile3() {
		
		assertEquals(WordCountPro.countFile("input3.txt")[0],"in-out");
		
		//fail("Not yet implemented");
	}
	@Test
	public void testCountFile4() {
		
		assertEquals(WordCountPro.countFile("input4.txt")[0],"in");
		
		//fail("Not yet implemented");
	}
	@Test
	public void testCountFile5() {
		
		assertEquals(WordCountPro.countFile("input5.txt")[0],"in");
		
		//fail("Not yet implemented");
	}
	@Test
	public void testCountFile6() {
		
		assertEquals(WordCountPro.countFile("input6.txt")[0],"in");
		
		//fail("Not yet implemented");
	}
	@Test
	public void testCountFile7() {
		
		assertEquals(WordCountPro.countFile("input7.txt")[0],"in");
		
		//fail("Not yet implemented");
	}
	@Test
	public void testCountFile8() {
		
		assertEquals(WordCountPro.countFile("input8.txt")[0],"in");
		
		//fail("Not yet implemented");
	}
	@Test
	public void testCountFile9() {
		
		assertEquals(WordCountPro.countFile("input9.txt")[0],"");
		
		//fail("Not yet implemented");
	}
	@Test
	public void testCountFile10() {
		
		assertEquals(WordCountPro.countFile("input10.txt")[0],"in");
		
		//fail("Not yet implemented");
	}
	@Test
	public void testCountFile11() {
		
		assertEquals(WordCountPro.countFile("input11.txt")[0],"in");
		
		//fail("Not yet implemented");
	}
	@Test
	public void testCountFile12() {
		
		assertEquals(WordCountPro.countFile("input12.txt")[0],"i");
		
		//fail("Not yet implemented");
	}
	@Test
	public void testCountFile13() {
		
		assertEquals(WordCountPro.countFile("input13.txt")[0],"in");
		
		//fail("Not yet implemented");
	}	
	@Test
	public void testCountFile14() {
		
		assertEquals(WordCountPro.countFile("input14.txt")[0],"in");
		
		//fail("Not yet implemented");
	}	
	@Test
	public void testCountFile15() {
		
		assertEquals(WordCountPro.countFile("input15.txt")[0],"in");
		
		//fail("Not yet implemented");
	}	
	@Test
	public void testCountFile16() {
		
		assertEquals(WordCountPro.countFile("input16.txt")[0],"in-out");
		
		//fail("Not yet implemented");
	}	
	@Test
	public void testCountFile17() {
		
		assertEquals(WordCountPro.countFile("input17.txt")[0],"in");
		
		//fail("Not yet implemented");
	}	
	@Test
	public void testCountFile18() {
		
		assertEquals(WordCountPro.countFile("input18.txt")[0],"in");
		
		//fail("Not yet implemented");
	}	
	@Test
	public void testCountFile19() {
		
		assertEquals(WordCountPro.countFile("input19.txt")[0],"in");
		
		//fail("Not yet implemented");
	}	
	@Test
	public void testCountFile20() {
		
		assertEquals(WordCountPro.countFile("input20.txt")[0],"a");
		
		//fail("Not yet implemented");
	}	
	@Test
	public void testCountFile21() {
		
		assertEquals(WordCountPro.countFile("input21.txt")[0],"in");
		
		//fail("Not yet implemented");
	}	
	@Test
	public void testCountFile22() {
		
		assertEquals(WordCountPro.countFile("input22.txt")[0],"am");
		
		//fail("Not yet implemented");
	}	
	@Test
	public void testCountFile23() {
		
		assertEquals(WordCountPro.countFile("input23.txt")[0],"in");
		
		//fail("Not yet implemented");
	}	
	@Test
	public void testCountFile24() {
		
		assertEquals(WordCountPro.countFile("input24.txt")[0],"out");
		
		//fail("Not yet implemented");
	}	
	@Test
	public void testCountFile25() {
		
		assertEquals(WordCountPro.countFile("input25.txt")[0],"in");
		
		//fail("Not yet implemented");
	}	
	@Test
	public void testCountFile26() {
		WordCountPro.countFile("input26.txt");
		assertEquals(WordCountPro.fqc[1],1);
		
		//fail("Not yet implemented");
	}	
	@Test
	public void testCountFile27() {
		WordCountPro.countFile("input27.txt");
		assertEquals(WordCountPro.fqc[1],1);
		
		//fail("Not yet implemented");
	}	
	@Test
	public void testCountFile28() {
		WordCountPro.countFile("input28.txt");
		assertEquals(WordCountPro.fqc[1],0);
		
		//fail("Not yet implemented");
	}	
	@Test
	public void testCountFile29() {
		WordCountPro.countFile("input29.txt");
		assertEquals(WordCountPro.fqc[1],1);
		
		//fail("Not yet implemented");
	}	
	@Test
	public void testCountFile30() {
		WordCountPro.countFile("input30.txt");
		assertEquals(WordCountPro.fqc[1],1);
		
		//fail("Not yet implemented");
	}	
	@Test
	public void testCountFile31() {
		WordCountPro.countFile("input31.txt");
		assertEquals(WordCountPro.fqc[1],1);
		
		//fail("Not yet implemented");
	}	
	@Test
	public void testCountFile32() {
		WordCountPro.countFile("input32.txt");
		assertEquals(WordCountPro.fqc[1],2);
		
		//fail("Not yet implemented");
	}
	@Test
	public void testCountFile33() {
		WordCountPro.countFile("input33.txt");
		assertEquals(WordCountPro.fqc[1],2);
		
		//fail("Not yet implemented");
	}
	@Test
	public void testCountFile34() {
		WordCountPro.countFile("input34.txt");
		assertEquals(WordCountPro.fqc[1],2);
		
		//fail("Not yet implemented");
	}
	@Test
	public void testCountFile35() {
		WordCountPro.countFile("input35.txt");
		assertEquals(WordCountPro.fqc[1],2);
		
		//fail("Not yet implemented");
	}

	@Test
	public void testCountFile36() {
		int[] a=new int[]{3,5,3,5,5};
		WordCountPro.sort(a,0,4);
		assertEquals(a[2],5);
		
		//fail("Not yet implemented");
	}
	@Test
	public void testCountFile37() {
		int[] a=new int[]{222,111,333,444};
		WordCountPro.sort(a,0,3);
		assertEquals(a[2],333);
		
		//fail("Not yet implemented");
	}
	@Test
	public void testCountFile38() {
		int[] a=new int[]{444,333,222,111};
		WordCountPro.sort(a,0,3);
		assertEquals(a[2],222);
		
		//fail("Not yet implemented");
	}
	@Test
	public void testCountFile39() {
		int[] a=new int[]{123,321,432,111};
		WordCountPro.sort(a,0,3);
		assertEquals(a[2],123);
		
		//fail("Not yet implemented");
	}
	@Test
	public void testCountFile40() {
		int[] a=new int[]{3,3,1,2};
		WordCountPro.sort(a,0,3);
		assertEquals(a[2],2);
		
		//fail("Not yet implemented");
	}
	
}
