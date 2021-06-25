package answer;

public abstract class Marks{
	final double MARK_OF_EACH_SUBJECT = 100;
	abstract double getPercentage();
}

class A extends Marks{
	private double mark1, mark2, mark3;
	A(double subject1, double subject2, double subject3){
		mark1 = subject1;
		mark2 = subject2;
		mark3 = subject3;
	}
	double getPercentage() {
		return (mark1+mark2+mark3)/(3*MARK_OF_EACH_SUBJECT);
	}
}

class B extends Marks{
	private double mark1, mark2, mark3, mark4;
	B(double subject1, double subject2, double subject3, double subject4){
		mark1 = subject1;
		mark2 = subject2;
		mark3 = subject3;
		mark4 = subject4;
	}
	double getPercentage() {
		return (mark1+mark2+mark3+mark4)/(4*MARK_OF_EACH_SUBJECT);
	}
}
