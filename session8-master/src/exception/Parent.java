package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parent {
	
	public static void doSomething() throws FileNotFoundException {
			
		try {
//			int a = 10;
//			int b = 0;
//			if( b != 0) {
//				int x = a/b;
//			}
			
			
			
			// IO read / write to a file
			File myObj = new File("filename.txt");
			try {
				Scanner myReader = new Scanner(myObj);
			} catch (FileNotFoundException e) {
//				e.printStackTrace();
				throw new FileNotFoundException("dear user, how are you ???! file is not there");
			}
			
			
		}
		catch(ArithmeticException exc) {
			throw new ArithmeticException(" an error happened");
		}
//		catch(NullPointerException exc) {
//			throw new NullPointerException();
//		}
	}
	
	public static void main(String[] args) {
		try {
			doSomething();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}
}