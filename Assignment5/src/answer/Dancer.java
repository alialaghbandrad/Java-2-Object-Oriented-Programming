package answer;

public class Dancer {
	private String name;
	private int age;

	public Dancer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void dance() {
		System.out.println(toString() + " I dance like everyone else.");
	}

	@Override
    public String toString() {
        return "I'm " + name + ". I'm " + age + " years old.";
    }
}

class ElectricBoogieDancer extends Dancer {
	public ElectricBoogieDancer(String name, int age) {
		super(name, age);
	}

// Override the method of the base class
	@Override
	public void dance() {
		System.out.println(toString() + " I dance the electric boogie!");
	}
}

class Breakdancer extends Dancer {

	public Breakdancer(String name, int age) {
		super(name, age);
	}

// Override the method of the base class
	@Override
	public void dance() {
		System.out.println(toString() + " I breakdance!");
	}
}
