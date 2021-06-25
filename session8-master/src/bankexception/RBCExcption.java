package bankexception;

public class RBCExcption extends Exception {
	
	public RBCExcption(String str) {
		super("error happened in RBC "+ str);
	}
}