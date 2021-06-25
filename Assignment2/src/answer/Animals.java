package answer;

class Cats extends Animals{
	public void sound() {
		System.out.println("Meow");
	}
}

class Dog extends Animals {
	public void sound() {
		System.out.println("Woof");
	}
}

abstract class Animals {

	abstract void sound();

}