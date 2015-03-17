package main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class tests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public final void testReturnTrue() {
		
		assertTrue("True: ", methods.ReturnTrue() );
		
		assertEquals("False: ", false , methods.ReturnTrue());
		
	}
	
	private void assertEquals(String string, boolean b, boolean returnTrue) {
		// TODO Auto-generated method stub
		
	}

	private void assertTrue(String string, boolean returnTrue) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public final void testAddTwoNumbers(){
		assertEquals("True: ", 5, methods.AddTwoNumbers(2, 3));
		assertEquals("True: ", 1, methods.AddTwoNumbers(1, 0));
		assertEquals("False: ", 3, methods.AddTwoNumbers(1, 4));
		assertEquals("False: ", 0, methods.AddTwoNumbers(15, 5));
	}

	private void assertEquals(String string, int i, int addTwoNumbers) {
		// TODO Auto-generated method stub
		
	}

}
