package userdefinedexception;

public class UserDefinedException extends Exception {

	private static final long serialVersionUID = 1L;
	
	UserDefinedException(){
		
	}
	
	UserDefinedException(String str){
		super("this is happening here " +str);
	}

}
