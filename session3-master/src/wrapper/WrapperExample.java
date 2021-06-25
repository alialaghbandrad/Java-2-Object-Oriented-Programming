package wrapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Business Object
class User{
	Integer id;
	
	User(Integer id){
		this.id = id;
	}
}

public class WrapperExample {
	
	
	
	public void autoboxing() {
		
		char ch = 'a';
		
		
		// Collection and Generic needs to have wrapper classes
		
		List<Integer> numbers1 = new ArrayList<Integer>();
		Set<Integer> numbers2 = new HashSet<Integer>();

		numbers1.add(1);
		numbers1.add(3);
		numbers1.add(new Integer(2));
		
		
		
		
		//Collections only accepts wrapper classes
		//		List<int> numbers2 = new ArrayList<int>();


		
		//no compile error happened
		checkCharacter(ch);
		
		//imagine we have a user
		//so I fetched a value from database
		//what is the default value of int???? => 0
		
		//if !savedToDatabase(){
		{
			User user = new User(null);
			
		}
		
		User user = new User(8);
		if (checkUserId(user.id)) {
			System.out.println("success");
		}
		
		
		
		Integer x1 = new Integer(12);
		Integer x2 = new Integer("13");
		
		//autoboxing
		Integer x3 = 14;
		Integer x4 = Integer.parseInt("13");
		
		Integer x5 = 50;
		
		//int cannot be null
		//null => interpreted as a null string
//		Integer x5= new Integer(null);
		
		System.out.println("x1 = " + x1 + " x2 = " + x2 + " x3 = " + x3 + " x4 =" + x4);
		
		
		double y1 = 12;
		Double wy1 = y1;
		Double wy2 = new Double(y1) ;
		Double wy3 = new Double("5555") ;

		System.out.println("y1 = " + wy1 + " y2 = " + wy2 + " y3 = " + wy3 );

		
	}
	
	public void checkCharacter(Character ch) {
		System.out.println("nothing");
	}
	
	public boolean checkUserId(Integer id) {
//		if (id == null) {
//			return false;
//		}
//		return true;
		
		return id != null;
		
		
		
		
		
		
		
		
		
		
	}
}
