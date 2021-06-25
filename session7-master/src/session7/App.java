package session7;

class Human{
	
}

class Thing{
	
}

//Java does not let you to have multiple inheritance
//class Person extends Human, Thing {
//
//	
//}
interface IGeneralRegister{
	void genralRegister();
}
interface IRegister extends IGeneralRegister{
	//if we have a final variable in a class, you need to initialize them
	final static int myval1 = 0;
	final String YYYYY = "ffff"; //making a string capitalize is a standard => constant
	
	static int myval2 = 1;
	int myval3 = 2;
	void x1();
	public void x2();
	public abstract void x3();
}

//classes only implement an interface
//interfaces can extend another interface and they cannot extend a class
//interface cannot implement another interface
class Register implements IRegister{

	//this methos was in the ancestor interface
	@Override
	public void genralRegister() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void x1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void x2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void x3() {
		// TODO Auto-generated method stub
		
	}
	
}




public class App {
	public static void main(String[] toto) {
		
	}
}
