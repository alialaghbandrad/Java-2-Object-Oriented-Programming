package finalExam;

import java.util.regex.Pattern;

public class SmsUser extends User {
	private String phoneNumber;


	public SmsUser(String firstName, String lastName, Address address, String phoneNumber) {
		super(firstName, lastName, address);
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) throws IllegalArgumentException{
		if(Pattern.matches("\\d+", phoneNumber)) {
			this.phoneNumber = phoneNumber;
		}else {
			throw new IllegalArgumentException("Phone number needs to have only numbers");
		}
	}

	@Override
	public String toString() {
		return  super.toString()+ " SmsUser [phoneNumber=" + phoneNumber + "]";
	}
	
	

	
	
}
