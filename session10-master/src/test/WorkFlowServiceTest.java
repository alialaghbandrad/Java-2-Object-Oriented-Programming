package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import service.WorkFlowService;

class WorkFlowServiceTest {
	
	@Test
	void testMyMethod() {
		WorkFlowService service = new WorkFlowService();
		int returnValue = service.myMethod();
		int expectedResult = 30;
		assert returnValue == expectedResult;
	}
	
	@Test
	void testMyMethod2ByGoodValues() {
		WorkFlowService service = new WorkFlowService();
		double returnValue = service.myMethod2(4, 7);
		double expectedValue = 38;
		assertEquals(expectedValue, returnValue);
	}
	
	@Test
	void testMyMethod2By0Values() {
		WorkFlowService service = new WorkFlowService();
		double returnValue = service.myMethod2(0, 0);
		double expectedValue = 10;
		assertEquals(expectedValue, returnValue);
	}
	
	@Test
	void testMyMethod3() {
		WorkFlowService service = new WorkFlowService();
		//Str is not null
		String[] returnValue = service.myMethod3("a,b,c,d,e");
		String[] expectedValue = new String[] {"a","b","c","d","e"};
		assertArrayEquals(returnValue, expectedValue);
		
		//str is null
		returnValue = service.myMethod3(null);
		String[] emptyArr = {};
		assertArrayEquals(emptyArr, returnValue);
		
		//str is empty
		returnValue = service.myMethod3("");
		assertArrayEquals(emptyArr, returnValue);
		
	}
	
	@Test
	void testMyMethod4() {
		WorkFlowService service = new WorkFlowService();
		Integer returnValue = service.myMethod4(4, 2);
		assertEquals(2, returnValue);
		
		returnValue = service.myMethod4(4, 0);
		assertNull(returnValue);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
