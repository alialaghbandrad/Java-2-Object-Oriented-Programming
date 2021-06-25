package libraryManagement;

import java.util.ArrayList;

public class Library implements Search{
	
	private ContactInfo contactInfo;
	private Address address;
	private ArrayList<BookItem> bookitem = new ArrayList<BookItem>();
	private ArrayList<Account> accounts = new ArrayList<Account>();

	public Library(ContactInfo contactInfo, Address address) {
		this.contactInfo = contactInfo;
		this.address = address;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public Address getAddress() {
		return address;
	}

	public ArrayList<BookItem> getBookitem() {
		return bookitem;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void addBookItem(BookItem...bookItems) {
		for(BookItem bookItem : bookItems) {
			bookitem.add(bookItem);
		}
	}
	
	public void addAccount(Account...accountsList) {
		for(Account account : accountsList) {
			accounts.add(account);
		}
	}
	
	public void displayMembers() {
		int i = 0;
		for (Account member : accounts) {
			System.out.printf("\t%d. Name : %s, Email : %s, ID : %d\n", ++i, member.getContactInfo().getName(),
					member.getContactInfo().getEmail(), member.getId());
		}

	}
	
	public void displayBooks() {
		int i = 0;
		for (BookItem bookItem : bookitem) {
			System.out.printf("\t%d. Barcode :  %s, ISBN :  %s, Title : %s, Author Name : %s, Status : %s\n", ++i, bookItem.getBarcode(), 
					bookItem.getIsbn(), bookItem.getTitle(), bookItem.getAuthor().getName(),bookItem.getStatus());
		}

	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((bookitem == null) ? 0 : bookitem.hashCode());
		result = prime * result + ((contactInfo == null) ? 0 : contactInfo.hashCode());
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
		Library other = (Library) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bookitem == null) {
			if (other.bookitem != null)
				return false;
		} else if (!bookitem.equals(other.bookitem))
			return false;
		if (contactInfo == null) {
			if (other.contactInfo != null)
				return false;
		} else if (!contactInfo.equals(other.contactInfo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Library " + contactInfo + "\n" + address;
	}

	@Override
	public ArrayList<BookItem> searchByTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<BookItem> searchByAuthor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<BookItem> searchBySubject() {
		// TODO Auto-generated method stub
		return null;
	}

}
