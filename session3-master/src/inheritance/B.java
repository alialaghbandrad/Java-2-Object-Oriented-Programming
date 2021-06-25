package inheritance;

public class B {
		
	int val;
	
	B(){
		System.out.println("Default Constructor of class B is called");
	}
	
	B(int val){
		this.val = val;
		System.out.println("Constructor of class B with parameter is called");
	}
	
	public void myMethod() {
		System.out.println("I am in class B");
	}
	
}
