package equal;


class Person extends Object{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
	
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}

public class App {
	public static void main(String[] args) {
		Person person1 = new Person("Joe", 28);
		Person person2 = new Person("Joe", 28);
		
		int x = 12;
		int y = 12;
		
		if (x == y) {
			System.out.println("x is equal y");
		}
		else {
			System.out.println("x is not equal y");
		}
		
		
		//it checks the address of memory of the person
		if (person1 == person2) {
			System.out.println("person1 is equal person2");
		}
		else {
			System.out.println("person1 is not equal person2");
		}
		
		if (person1.equals(person2)) {
			System.out.println("person1 is equal person2");
		}
		else {
			System.out.println("person1 is not equal person2");
		}
		
		
	}
}
