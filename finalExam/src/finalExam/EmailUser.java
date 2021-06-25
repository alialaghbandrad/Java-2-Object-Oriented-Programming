package finalExam;

public class EmailUser extends User {
	private String emailAddress;


	public EmailUser(String firstName, String lastName, Address address, String emailAddress) {
		super(firstName, lastName, address);
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		
		return super.toString()+ " EmailUser [emailAddress=" + emailAddress + "]";
	}
		
	
}
