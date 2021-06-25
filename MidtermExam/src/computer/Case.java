package computer;

public class Case {
	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimension dimension;

	// constructor
	public Case(String model, String manufacturer, String powerSupply, Dimension dimension) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimension = dimension;
	}

	public void pressPowerButton() {
		String message = "power button pressed";
		System.out.println(message);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public Dimension getDimension() {
		return dimension;
	}
	
	
}
