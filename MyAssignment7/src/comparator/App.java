package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class User {
	private int id;
	private String name;
	private Date birthdate;
	
	public User(int id, String name, Date birthdate) {
		this.name = name;
		this.id = id;
		this.birthdate = birthdate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
    public Date getBirthdate() {
        return birthdate;
    }
 
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + " birthdate=" + birthdate + "]";
	}
}

public class App {

	public static void main(String[] args) throws ParseException {
		
		List<User> userList= new ArrayList<User>();
		userList.add(new User(3, "DAVID", new SimpleDateFormat("dd-MM-yyyy").parse("11-07-2010")));
		userList.add(new User(1, "EMANUEL", new SimpleDateFormat("dd-MM-yyyy").parse("26-10-1990")));
		userList.add(new User(4, "ROSE", new SimpleDateFormat("dd-MM-yyyy").parse("17-01-2000")));
		userList.add(new User(2, "ASHLY", new SimpleDateFormat("dd-MM-yyyy").parse("15-04-1988")));
		userList.add(new User(5, "NANCY", new SimpleDateFormat("dd-MM-yyyy").parse("15-04-1983")));

		System.out.println("List of users:");
		userList.forEach(usr -> System.out.println(usr));
		
		Collections.sort(userList, new ScoreCompartor());
		System.out.println("Sorted by id:");
		userList.forEach(usr -> System.out.println(usr));

		Collections.sort(userList, new NameCompartor());
		System.out.println("Sorted by name:");
		userList.forEach(usr -> System.out.println(usr));
		
		Collections.sort(userList, new DateCompartor());
		System.out.println("Sorted by birthdate:");
		userList.forEach(usr -> System.out.println(usr));
		
		//java 8 comparator
		Comparator<User> cm2 = Comparator.comparing(User::getId);
		Collections.sort(userList, cm2);
		} 
}
