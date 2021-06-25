package answer;

class Person {

	String firstName = "";
	String lastName = "";
	int age;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
		if (age < 0 || age > 100) {
			age = 0;
		}
	}

	public boolean isTeen() {
		if (this.age > 12 && this.age < 20) {
			return true;
		}
		return false;
	}

	public String getFullName() {
		if (firstName == null && lastName == null) {
			return "";
		} else if (lastName == "") {
			return firstName;
		} else if (firstName == "") {
			return lastName;
		} else {
			return firstName + " " + lastName;
		}
	}

}

class SimpleCalculator {

	double firstNumber = 0;
	double secondNumber = 0;

	public double getFirstNumber() {
		return firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public double getAdditionalResult() {
		return this.firstNumber + this.secondNumber;
	}

	public double getSubtractionResult() {
		return this.firstNumber - this.secondNumber ;
	}

	public double getMultiplicationResult() {
		return this.firstNumber * this.secondNumber;
	}

	public double getDivisionResult() {
		if (this.secondNumber == 0) {
			return 0;
		} else {
			return this.firstNumber / this.secondNumber;
		}
	}
}

class Wall {

	double width;
	double height;

	public Wall() {

	}

	public Wall(double width, double height) {
		this.width = width;
		this.height = height;

		if (width < 0) {
			this.width = 0;
		}
		if (height < 0) {
			this.height = 0;
		}
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		this.width = width;

		if (width < 0) {
			this.width = 0;
		}
	}

	public void setHeight(double height) {
		this.height = height;

		if (height < 0) {
			this.height = 0;
		}
	}

	public double getArea() {
		return width * height;
	}

}

public class App {
	
	public static void main(String[] args) {
		Wall wallTester = new Wall(5,4);
		System.out.println("area = " + wallTester.getArea());
		wallTester.setHeight(-1.5);
		System.out.println("width = " + wallTester.getWidth());
		System.out.println("height = " + wallTester.getHeight());
		System.out.println("area = " + wallTester.getArea());		
		
		Person personTester = new Person();
		personTester.setFirstName("");
		personTester.setLastName("");
		personTester.setAge(10);
		System.out.println("fullName = " + personTester.getFullName());
		System.out.println("teen = " + personTester.isTeen());
		personTester.setFirstName("John");
		personTester.setAge(18);
		System.out.println("fullName = " + personTester.getFullName());
		System.out.println("teen = " + personTester.isTeen());
		personTester.setLastName("Smith");
		System.out.println("fullName = " + personTester.getFullName());	
		
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);
		System.out.println("add = " + calculator.getAdditionalResult());
		System.out.println("subtract = " + calculator.getSubtractionResult());
		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(0);
		System.out.println("multiply = " + calculator.getMultiplicationResult());
		System.out.println("divide = " + calculator.getDivisionResult());
	}

}
