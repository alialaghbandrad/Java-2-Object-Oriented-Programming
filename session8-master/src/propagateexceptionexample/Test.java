package propagateexceptionexample;

import java.io.IOException;
import java.sql.SQLException;

public class Test {
	
	//adding throws forces the user of this method
	//to provided either 'surronding try/catch' or 'throws' in the method
	public void testMethod() throws IOException {
		//this method does not throw exception
		//I only added the explanation
		
	}
	
	public void usertestMethod(){
		try {
			testMethod();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void method1() throws IOException{
		throw new IOException("Java is interesting");
	}
	
	void method2() throws IOException {
		method1();
	}
	
	void method3() {
		try {
			method2();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
			
		}
	}
	
	void connectToDB() throws SQLException  {
		throw new SQLException("error in connection");
	}
	
	void showData() {
		try {
			connectToDB();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
