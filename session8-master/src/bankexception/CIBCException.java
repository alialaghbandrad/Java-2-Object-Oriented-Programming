package bankexception;

public class CIBCException extends Exception{
	public CIBCException(String str) {
		super("error happened in CIBC "+ str);
	}
}