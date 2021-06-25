package wrapper;

import java.util.ArrayList;

public class App2 {
	
	public static void main(String[] args)
	{
		int a1 = 12; //primitive
		Integer a2 = a1; // autoboxing
		int a3 = a2; //unboxing
		
		//the reason of using wrapper
		//primitive cannot be checked as null
//		if (a1 == null) {
//			
//		}
		
		
		if(getGeneratedId() == null) {
			System.out.println("an error happened");
		}
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	}
	
	//int cannot accept null
	public static Integer getGeneratedId(){
		return null;
	}
}
