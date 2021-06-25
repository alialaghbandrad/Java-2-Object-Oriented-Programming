package finallyexample;

public class App {
	
	public static void main(String[] args) {
		
		try {
			int x = 12;
			//int b = 12/0;
			
			String str = null;
			//str.length();
			
			String badformatStr = "aaaaa";
			Integer.parseInt(badformatStr);
			//if any exception happens here other than
		}

		catch(ArithmeticException ex) {
			System.err.println("an ArithmeticException exception happend");
		}
		catch(NullPointerException exc) {
			System.err.println("nullpointer exception happend");
		}
		catch(Exception x) {
			System.err.println("exception happend");
		}
		finally {
			System.out.println("I am being called all the time");
		}
		
		
		//what is the difference between finally and final
		//try and finally can be together without catch block
		//try and catch can be together without finally block
	}
}
