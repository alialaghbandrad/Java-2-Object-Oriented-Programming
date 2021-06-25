package examples;

import java.util.Locale;

final class Animal{
	
	public final String toLowerCase(Locale locale) {
        return new String();
    }
}

//final class cannot be extended
//class Dog extends Animal{
//	
//	
//}

public class App {
	
	public static void main(String[] args) {
		Person person = new Person("Joe", 18, new Address("Main street", 23));
		System.out.println(person.toString());
		System.out.println("----------------");
		
		//when you don't use .toString() it means that you are calling it implicitely
		System.out.println(person);

	}
}
