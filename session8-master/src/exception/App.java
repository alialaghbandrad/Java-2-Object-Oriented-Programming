package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String str = null;

		// runtime exception or unchecked exception
		// NullpointerException
		// System.out.println(str.length());

		// arithmeticexception

		int a = 10;
		int b = 0;

		try {
			int i = a / b;
		}
		// runtime exception
		catch (ArithmeticException exc) {
			System.out.println(exc.getMessage());
//			System.out.println("an exception happened");
		}
		
		System.out.println("the exception passed");
		
		// checked exception => they are checked at compile time
		// IO read / write to a file
//		File myObj = new File("filename.txt");
//		try {
//			Scanner myReader = new Scanner(myObj);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		

		try {
			String s = "abc";
			int x = Integer.parseInt(s);
		}
		catch(NumberFormatException exc) {
			//logging system
			System.out.println("the exception happened because the number format" + exc.getMessage());
		}
		
		
		//Indexoutofboundexception
		try {
			int arr[] = new int [5];
			int c = arr[9];
		}
		catch(IndexOutOfBoundsException exc) {
			System.err.println("index out of bound" + exc.getMessage());
		}
		
		
		
	}

}
