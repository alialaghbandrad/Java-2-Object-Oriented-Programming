package propagateexceptionexample;

import java.io.IOException;

public class App {

	public static void main(String[] args){
		Test t = new Test();
		t.method3();
		
		
		
		//calling a method in the main that has a throws exception
		//is not a good idea
		//always create a wrapper method like method3 that handles the exception
//		t.method2();
		
		
		
		//unchecked exceptions => nullpointer , arithmetic its better not to catch them 
		//specifically
		//that means, you don't want to show them
		//having an exception class
		//A GOOD developer tries to have NO runtime exception
		//I have to prevent them
		//you can deduce eventually an error can happen in your code 
		//so you prevent
		
		
		//checked exception are being checked during the compile time

	}

}
