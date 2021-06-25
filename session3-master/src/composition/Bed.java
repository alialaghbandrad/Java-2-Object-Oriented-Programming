package composition;

public class Bed {
	
	private String style;
	private int pillows;
	
	public void makeBed() {
		System.out.println("Bed -> making");
	}
	

	public Bed(String style, int pillows) {
		this.style = style;
		this.pillows = pillows;
	}

	public String getStyle() {
		return style;
	}

	public int getPillows() {
		return pillows;
	}
	
	
}
