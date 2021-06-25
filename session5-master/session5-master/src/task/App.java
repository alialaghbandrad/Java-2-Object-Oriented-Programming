package task;

public class App {
	public static void main(String[] args) {
		//Reference variable
//		Machine machine1 = new Machine();
//		
//		machine1.start();
//		machine1.stop();
//
//		Car car1 = new Car();
//		car1.start();
//		car1.showInfo();
		
		
		///-------------
		
		//car is a machine
		Machine car = new Car();
		
		//it does not work the opposite unless you do cast
//		Car c = new Machine();
		
		//I have access to the methods that are in the machine class and NOT the methods in the Car class
		car.start();
		car.stop();
		
		//this line does not work because the methods that you have access for the object determind
		//by the class that you instantiate
//		car.showInfo();
		
		
		
		checkMachine(car);
		
		Machine plane = new Plane();
		plane.start();
		
		//plane.landing();//it is not accessible and compile time error
		
		Plane myPlane = new Plane();
		myPlane.landing();
		
		
		checkMachine(plane);
	}
	
	public static boolean checkMachine(Machine machine) {
		
		
		//At runtime I can convert(cast) the machine into the real type(car, plane, motorcycle...)
		
		
		return true; //if everything is ok with that machine
	}
	
//	public static boolean checkCar(Car car) {
//		return true; //if everything is ok with that car
//	}
//	
//	public static boolean checkPlane(Plane plane) {
//		return true; //if everything is ok with that palne
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
