package userdefinedexception;

import bankexception.CIBCException;
import bankexception.RBCExcption;

class Test{
	void method() throws UserDefinedException {
		//it has some code
		throw new UserDefinedException("an error happened");
	}
	
	void methodUser() {
		try {
			method();
		} catch (UserDefinedException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	void sendInfoToRBC() throws RBCExcption {
		
		try {
			//imaginary runtime exception
			int x = 10/0;
		}
		catch(Exception exc) {
			throw new RBCExcption(exc.getMessage());
		}
	}
	
	void sendInfoToCIBC() throws CIBCException {
		try {
			//some code here
		}catch(Exception exc) {
			throw new CIBCException(exc.getMessage());
		}
	}
	
	boolean checkClarity() throws CIBCException {
		//we check if duplicate happens
		throw new CIBCException(" there shouldn't be duplicate");
		
	}
}

public class App {
	
	
	public static void main(String[] args){
		Test t = new Test();
		t.methodUser();
		
	
//		try {
//			t.sendInfoToRBC();
//			t.sendInfoToCIBC();
//		} catch (RBCExcption e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (CIBCException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		
		try {
			t.sendInfoToRBC();
			t.sendInfoToCIBC();
		} catch (RBCExcption | CIBCException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
}
