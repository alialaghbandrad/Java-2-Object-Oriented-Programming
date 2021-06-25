package interfaceexample;

public interface IPlay {
	
	int counter =60;
	
	void play();//methods in interface don't have implementation since they are abstract
	
	//before Java 8 there was no implementation for the interface
	//but after that with 'default' you can have methods with body
	
	default void myMethod() {
		System.out.println("I can play everything");
	}
	
	public static int getCountOfPlay() {
		return counter;
	}
}
