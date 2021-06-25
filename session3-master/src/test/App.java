package test;

import java.util.Date;

import aggregation.Author;
import aggregation.Book;
import composition.Bed;
import composition.BedRoom;
import composition.Ceiling;
import composition.Lamp;
import composition.Wall;
import inheritance.A;
import wrapper.WrapperExample;

public class App {

	public static void main(String[] args) {
	
		Author author = new Author("Bill Gates", "Main street", 40);
		Book book1 = new Book("Success", new Date(), 20.00, author);
		
		
		Book book2 = new Book("Success", new Date(), 20.00, 
				new Author("Bill Gates", "Main street", 40));
		
		
		A a = new A();
		
		a.myMethod();
		
		
		//composition example
		
//		Wall wall1 = new Wall("East");
//		Wall wall2 = new Wall("West");
//		Wall wall3 = new Wall("north");
//		Wall wall4 = new Wall("south");
//		
//		Ceiling ceiling = new Ceiling(12, "White");
//		
//		Lamp lamp =new Lamp("classic", false);
//		
//		Bed bed = new Bed("Modern", 4);
//		
//		BedRoom bedroom1 = new BedRoom("mine", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
//		
//		BedRoom bedroom2 = new BedRoom("mine", new Wall("East"), new Wall("West"), wall3, wall4, ceiling, bed, lamp);
//
//		bedroom1.makeBed();
		
		
		
		WrapperExample example = new WrapperExample();
		example.autoboxing();
		
		
		
		
	}

}
