package computer;

public class Monitor {
	private String model;
	private String manufacturer;
	private double size;
	private Resolution resolution;

	public Monitor(String model, String manufacturer, double size, Resolution resolution) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.resolution = resolution;
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public double getSize() {
		return size;
	}

	public Resolution getResolution() {
		return resolution;
	}
	
	

}
