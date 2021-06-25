package builderstring;


class Test
{
	public synchronized void myMethod() {
		
	}
}

public class App3 {
	
	public static void main(String...strings) {
		String x = "ReZa";
		String changed = x.toLowerCase();
		
//		System.out.println("the value of x = " + x + " the value after change " + changed);
		
		String added = x.concat("add me");
		
		
		x.toLowerCase().concat("anything").concat("another");
		
		StringBuilder builder1 = new StringBuilder("this is my string");
		
		//append
		builder1.append(" and this one is added");
		System.out.println(builder1);
		
		//insert
		builder1.insert(1, "   I am added there   ");
		System.out.println(builder1);
		
		//replace 
		StringBuilder builder2 = new StringBuilder("this ABCDEFGHIJKL my second string");
		builder2.replace(1, 3, "SUPER");
		System.out.println(builder2);
		
		//delete
		builder2.delete(5, 10);
		System.out.println(builder2);

		//Stringbuffer
		StringBuffer buffer = new StringBuffer();
		
		//Multithreading => 1 proccess can have different threads
		//Multiprocessing => different process
		
		
		//I want to do an action but I want to it not sequentially
		Thread t = new Thread();
		
		
		//thread-safe or syncronized
		
		StringBuffer myStr = new StringBuffer("My status");

		myStr.append("test");
		
		
		
		
	}
	
}
