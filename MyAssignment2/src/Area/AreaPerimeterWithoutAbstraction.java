package Area;

public class AreaPerimeterWithoutAbstraction {

	public static void main(String[] args) {
		// Create a circle with radius 1
		Circle circle1 = new Circle(1);
		System.out.println("The area of the circle of radius "
		 + circle1.radius + " is " + circle1.getArea());
		
		}
		}
		//Define the circle class with two constructors
		 class Circle {
		 double radius;
		 
		 /** Construct a circle with radius 1 */
		 Circle() {
		 radius = 1;
		 }
		
		 /** Construct a circle with a specified radius */
		 Circle(double newRadius) {
		 radius = newRadius;
		 }
		
		 /** Return the area of this circle */
		 double getArea() {
		 return radius * radius * Math.PI;
		 }
		
		/** Return the perimeter of this circle */
		double getPerimeter() {
		 return 2 * radius * Math.PI;
		 }
		

		}
