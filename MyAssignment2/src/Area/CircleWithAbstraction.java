package Area;

public class CircleWithAbstraction extends Shape {
	private double radius;
	final double pi = Math.PI;
	
	//Defualt Constructor, calls Shape default constructor
	public void Circle() {
	    //Set default value to radius
	    this.radius = 2;
	}   

	public void Circle(double radius) {
	    this.radius = radius;
	}

	public double getArea() {
	    //Return pi r^2 (area formula)
	    //Use Math.pow method in order to calculate exponent
	    return (pi * Math.pow(radius, 2));
	}

	public double getPerimeter() {
	    //Return 2 pi r (perimeter formula)
	    return (2 * pi * radius);
	}
	public void printInfo() {
		System.out.println("the area of the circle is " + this.getArea() + 
				" the perimeter is " + this.getPerimeter());
	}
	
}
