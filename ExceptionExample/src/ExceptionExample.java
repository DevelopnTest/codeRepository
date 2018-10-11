
public class ExceptionExample {

	public String Example(String example) { 
		   if (example == null) { 
		      throw new NullPointerException("Error"); 
		   } 
		   System.out.println(example);
		   return example; //do somethings here 
		} 
}
