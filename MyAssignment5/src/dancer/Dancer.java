package dancer;

public abstract class Dancer {
	public String name;
	public int age;
	public static void dance() {
		System.out.println("dance ");
	}
	
	// Getter
	  public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }
	// Getter
		  public int getAge() {
		    return age;
		  }

	// Setter
		  public void setAge(String newAge) {
		    this.name = newAge;
		  }
}



