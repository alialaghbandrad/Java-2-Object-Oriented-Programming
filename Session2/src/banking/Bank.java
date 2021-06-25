package banking;

public abstract class Bank {
	private String name;
	private String owner;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	// private and abstract cannot be together
	public abstract int getInterestRate();
}
