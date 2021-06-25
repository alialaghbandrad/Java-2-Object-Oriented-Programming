package bank;

public class Bank {
	
	public double getInterest() {
		return 0.0;
	}
	
	public String getName() {
		return "";
	}
}


class RBC extends Bank{
	
	@Override
	public double getInterest() {
		return 7.5;
	}
	
	@Override
	public String getName() {
		return "rbc";
	}
	
	
}

class TD extends Bank{
	
	@Override
	public double getInterest() {
		return 5.5;
	}
	
	@Override
	public String getName() {
		return "TD";
	}
}

