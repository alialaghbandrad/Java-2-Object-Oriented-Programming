package casting;

class Animal{
	public void eat() {
		System.out.println("Eating ...");
	}
}

class Dog extends Animal{
	
	public void eat() {
		System.out.println("dog Eating ...");
	}
	
	public void bark() {
		System.out.println("dog Barking ...");
	}
}

class Cat extends Animal{
	public void eat() {
		System.out.println("cat Eating ...");
	}	
	
	public void meow() {
		System.out.println("cat mewing ...");
	}
}

public class App {
	
	public static void main(String[] args) {
		
		//upcasting
		Dog dog = new Dog();
		Animal animal = (Animal)dog;  // since dog is an animal also if I add (Animal)
		
		//upcasting can never throw exception classcast exception
		//Animal catAnimal = new Cat();
		
		
		animal.eat();
		
		
		Animal animal2 = (Animal)new Cat();
		animal2.eat();
		
		//Downcasting
		
		//since animal is a dog
		Dog convertedDog = (Dog)animal;
		convertedDog.bark();
		
		
		//this line throws a runtime exception
		//because animal is a dog and I am converting it to a cat
		if (animal instanceof Cat) {
			Cat convertedCat= (Cat)animal;
			System.out.println("converted");
		}
		else if (animal instanceof Dog) {
			System.out.println("animal is an instance of dog");
		}
		
		
		//Downcasting a parent
		Animal generalAnimal = new Animal();
		if (generalAnimal instanceof Dog) {
			Dog generalDog = (Dog)generalAnimal;
		}
		
		//it throw class cast exception
//		Dog fff = (Dog)new Animal();
		
		
		//testing with a method
		Animal testAnimal1  = new Dog();
		Animal testAnimal2  = new Cat();
		
		checkAnimal(testAnimal1);
		checkAnimal(testAnimal2);
 		
	}
	
	
	public static void checkAnimal(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog)animal;
			dog.bark();
		}
		if (animal instanceof Cat) {
			Cat cat = (Cat)animal;
			cat.meow();
		}
		
	}
		
}
