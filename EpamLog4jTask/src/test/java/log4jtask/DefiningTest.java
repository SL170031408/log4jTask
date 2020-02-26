package log4jtask;

import static org.junit.Assert.*;


import org.junit.Test;




public class DefiningTest {
	 private static final double DELTA = 1e-15;
	    Defining t=new Defining();
	    
	    
	    
		@Test
		public void testSimple() {
			assertEquals(12.0,t.simple(100.0,4.0,3.0),DELTA);
		}
		

		@Test
		public void testCompound() {
			assertEquals(8.0,t.compound(200.0, 4.0, 1.0),DELTA);
		}


}
