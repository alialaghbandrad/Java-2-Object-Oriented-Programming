package libraryManagement;

public abstract class Account {
	private int id;
	private Address address;
	private ContactInfo contactInfo;
	private AccountStatus status;
	private String password;
	private MemberCard memberCard;
	private boolean isLogged;

	public Account(int id, Address address, ContactInfo contactInfo, AccountStatus status, String password,
			MemberCard memberCard, boolean isLogged) {
		this.id = id;
		this.address = address;
		this.contactInfo = contactInfo;
		this.status = status;
		this.password = password;
		this.memberCard = memberCard;
		this.isLogged = isLogged;
	}

	public int getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public String getPassword() {
		return password;
	}

	public MemberCard getMemberCard() {
		return memberCard;
	}

	public boolean isLogged() {
		return isLogged;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((contactInfo == null) ? 0 : contactInfo.hashCode());
		result = prime * result + id;
		result = prime * result + (isLogged ? 1231 : 1237);
		result = prime * result + ((memberCard == null) ? 0 : memberCard.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Account other = (Account) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (contactInfo == null) {
			if (other.contactInfo != null)
				return false;
		} else if (!contactInfo.equals(other.contactInfo))
			return false;
		if (id != other.id)
			return false;
		if (isLogged != other.isLogged)
			return false;
		if (memberCard == null) {
			if (other.memberCard != null)
				return false;
		} else if (!memberCard.equals(other.memberCard))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account id : " + id + ", address : " + address + ", contactInfo : " + contactInfo + ", status : " + status
				+ ", memberCard : " + memberCard + ", isLogged : " + isLogged;
	}

	public boolean login(String password) {
		return isLogged;
	}

	public boolean logout() {
		return isLogged;
	}

}
