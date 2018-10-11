import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionExampleTest {
	ExceptionExample example;
	
	@Before
	public void setUp() throws Exception {
        example = new ExceptionExample();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = NullPointerException.class) 
	public void constructorShouldThrowNullPointerException() { //JUnit 4   
		example.Example(null); 
	} 
	
	@Test
	public void testExample() { //JUnit 3   
		   try {
			      example.Example(null);
		          fail("Expected a NullPointerException to be thrown");
		   } catch (NullPointerException aNullPointerException) {
		          assertEquals("HaHa", example.Example("HaHa"));
		   }
	} 
	
	@Rule 
	public ExpectedException thrown = ExpectedException.none();

    @Test
    public void throwsNothing() {
        // no exception expected, none thrown: passes.
    }
    
	@Test 
	public void test () {
	   thrown.expect(NullPointerException.class);
	   thrown.expectMessage("Error"); 
	   example.Example(null); 
	}
}
