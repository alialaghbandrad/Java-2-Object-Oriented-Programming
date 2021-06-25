package answer;


public abstract class Perimeter {

	abstract double getPerimeter(double length);
	abstract double getArea(double length);

}

class Square extends Perimeter {

	public double getPerimeter(double length) {
		return length * 4;
	}

	public double getArea(double length) {
		return length * length;
	}
}

class Triangle extends Perimeter {

	public double getPerimeter(double length) {
		return length * 3;
	}

	public double getArea(double length) {
		return length * length;

	}
}

class Circle extends Perimeter {

	public double getPerimeter(double length) {
		double radius = length /2;
		return Math.PI * 2 * radius;
	}

	public double getArea(double length) {
		double radius = length / 2;
		return Math.PI * (radius * radius);
	}
}