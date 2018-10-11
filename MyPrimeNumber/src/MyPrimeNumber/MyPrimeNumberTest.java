package MyPrimeNumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyPrimeNumberTest {
	MyPrimeNumber num;
	
	@Before
	public void setUp() throws Exception {
		num = new MyPrimeNumber();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsPrime_TC1() {
	  	assertEquals(num.isPrime(1),1); 
	}
	
	@Test
	public void testIsPrime_TC2() {
	  	assertEquals(num.isPrime(2),1); 
	}
	
	@Test
	public void testIsPrime_TC3() {
	  	assertEquals(num.isPrime(4),1); 
	}

}
