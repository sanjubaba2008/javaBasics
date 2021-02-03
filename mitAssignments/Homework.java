package mitAssignments;

public class Homework {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	

	public static void main(String[] args) {
		
		try {
		
	   throw  new MyCustomizedException("my own exception handler");
		}
		catch(MyCustomizedException e) {
			System.out.println("Exception got caught");
		}
	
	}// end of main
}// end of Homework
