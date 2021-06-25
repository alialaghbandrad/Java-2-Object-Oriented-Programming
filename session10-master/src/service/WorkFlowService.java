package service;

import java.util.Arrays;
import java.util.Collections;

public class WorkFlowService {
	
	public int myMethod() {
		
		//it has a loop		
		//it can have database connection
		//you can modify the data
		//you can save to a file
		
		//in your mind you do some testing and you do them
		
		
		return 30; 
	}
	
	
	public double myMethod2(int a, int b) {
		return a * b + 10;
	}
	
	public String[] myMethod3(String str) {
		String[] emptyArr = {};

		if(str != null && !str.isEmpty()) {
			return str.split(",");
		}
	
		return emptyArr;
	}
	
	public Integer myMethod4(int a, int b) {
		if (b != 0) {
			return a/b;
		}
		return null;
	}
	
	
	
	
}
