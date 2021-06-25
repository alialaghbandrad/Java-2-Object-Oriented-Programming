package task;

import task.Machine;

public class Car extends Machine {

	void test() {
		start();
	}

	//overriding => means creating the same method (the same name, the same output, the same input)
	@Override
	public void start() {
		System.out.println("Car Started");
	}

	public void showInfo() {
		System.out.println("car name is " + name);
	}

}