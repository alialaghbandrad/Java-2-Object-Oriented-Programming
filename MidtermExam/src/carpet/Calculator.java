package carpet;

class Carpet {
	private double cost;

	public Carpet(double cost) {

		if (cost < 0) {
			this.cost = 0;
		} else {
			this.cost = cost;
		}
	}

	public double getCost() {
		return cost;
	}
}

class Floor {
	private double width;
	private double length;

	// constructor
	public Floor(double width, double length) {
		if (width < 0) {
			this.width = 0;
		} else {
			this.width = width;
		}
		if (length < 0) {
			this.length = 0;
		} else {
			this.length = length;
		}

	}

	public double getArea() {
		return width * length;
	}

}

public class Calculator {
	private Floor floor;
	private Carpet carpet;

	// constructor
	public Calculator(Floor floor, Carpet carpet) {
		this.floor = floor;
		this.carpet = carpet;
	}

	// method

	public double getTotalCost() {
		return floor.getArea() * carpet.getCost();
	};

}
