package task;

public class Plane extends Machine {
	
	@Override
	protected void start() {
		System.out.println("Plane Started");
	}
	
	protected void landing() {
		System.out.println("Plane landing");

	}
}
