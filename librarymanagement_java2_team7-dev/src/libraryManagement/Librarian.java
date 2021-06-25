package libraryManagement;

public class Librarian extends Account {

	public Librarian(int id, Address address, ContactInfo contactInfo, AccountStatus status, String password,
			MemberCard memberCard, boolean isLogged) {
		super(id, address, contactInfo, status, password, memberCard, isLogged);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "Librarian -> ID : " + getId() + "\n" + getAddress() + "\n"
				+ getContactInfo() + ", status : " + getStatus() + "\n" + getMemberCard()
				+ ", isLogged : " + isLogged();
	}



	public boolean addBookItem(BookItem bookItem) {
		return true;
	}

	public boolean addMember(Member member) {
		return true;
	}

	public boolean blockMember(int memberId) {
		return true;
	}

	public boolean unblockMember(int memberId) {
		return true;
	}

	public boolean updateProfile(Member member) {
		return true;
	}

}
