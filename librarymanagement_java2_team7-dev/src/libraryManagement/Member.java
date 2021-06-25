package libraryManagement;

import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Member extends Account {
	private ArrayList<BookItem> borrowedBooks = new ArrayList<BookItem>();
	private ArrayList<BookItem> reservedBooks = new ArrayList<BookItem>();
	private double penalty;
	private int totalBooksCheckedout;
	private int totalBooksReserved;

	public Member(int id, Address address, ContactInfo contactInfo, AccountStatus status, String password,
			MemberCard memberCard, boolean isLogged) {
		super(id, address, contactInfo, status, password, memberCard, isLogged);
		this.penalty = penalty;
		this.totalBooksCheckedout = totalBooksCheckedout;
		this.totalBooksReserved = totalBooksReserved;
	}

	public ArrayList<BookItem> getBorrowedBooks() {
		return borrowedBooks;
	}

	public ArrayList<BookItem> getReservedBooks() {
		return reservedBooks;
	}

	public double getPenalty() {
		return penalty;
	}

	public int getTotalBooksCheckedout() {
		return totalBooksCheckedout;
	}

	public int getTotalBooksReserved() {
		return totalBooksReserved;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((borrowedBooks == null) ? 0 : borrowedBooks.hashCode());
		long temp;
		temp = Double.doubleToLongBits(penalty);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((reservedBooks == null) ? 0 : reservedBooks.hashCode());
		result = prime * result + totalBooksCheckedout;
		result = prime * result + totalBooksReserved;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (borrowedBooks == null) {
			if (other.borrowedBooks != null)
				return false;
		} else if (!borrowedBooks.equals(other.borrowedBooks))
			return false;
		if (Double.doubleToLongBits(penalty) != Double.doubleToLongBits(other.penalty))
			return false;
		if (reservedBooks == null) {
			if (other.reservedBooks != null)
				return false;
		} else if (!reservedBooks.equals(other.reservedBooks))
			return false;
		if (totalBooksCheckedout != other.totalBooksCheckedout)
			return false;
		if (totalBooksReserved != other.totalBooksReserved)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Member -> " + "ID : " + getId() + "\n" + getContactInfo() + "\n" + getAddress()
				+ "\ntotal borrowed books : " + totalBooksCheckedout + ", total reserved books : " + totalBooksReserved
				+ " status : " + getStatus() + "\n" + getMemberCard() + ", logged in :" + isLogged() + " penalty="
				+ penalty;
	}

	// ************* This method is responsible for borrowing a book**************//

	public boolean checkoutBookItem(BookItem bookItem) {
		// Check condition if total books more then 3 return false
		if (this.getTotalBooksCheckedout() >= Constants.MAX_BOOKS_ALLOWED_PER_USER) {
			System.out.printf("The user %s with id %d checked-out maximum number of books\n",
					this.getContactInfo().getName(), this.getId());
			return false;
		}

		// Get the record from BookReseravtion based on book bar code
		BookReservation bookReservation = BookReservation.getReservationDetails(bookItem.getBarcode());

		// Check if the book already reserved by another member
		if (bookReservation != null && bookReservation.getMemberId() != this.getId()) {
			System.out.printf("The book %s with barcode %s already reserved by another member with id %d\n",
					bookItem.getTitle(), bookItem.getBarcode(), bookReservation.getMemberId());
			return false;
		} else if (bookReservation != null) {
			// The member has reserved this book before. Now remove this record from
			// Borrowed list, member borrowed list and member borrowed counters
			BookReservation.updateBookReservationListDel(bookItem.getBarcode());
			this.updateBooksReservationsDel(bookItem);
		}

		// Check if BookItem checkout() method return false the book is not borrowed
		// else borrowed
		if (!bookItem.checkout(this.getId())) {
			return false;
		}

		this.updateBooksCheckedoutAdd(bookItem);
		return true;
	}

	// ************* This method is responsible for reservation a
	// book***************//

	public boolean reserveBookItem(BookItem bookItem) {
		// Check condition if total books more then 3 return false
		if (this.getTotalBooksReserved() >= Constants.MAX_BOOKS_ALLOWED_PER_USER) {
			System.out.printf("The user %s with id %d reserved maximum number of books\n",
					this.getContactInfo().getName(), this.getId());
			return false;
		}

		// Get the record from BookReseravtion based on the book bar code
		BookReservation bookReservation = BookReservation.getReservationDetails(bookItem.getBarcode());

		// Check if the book already reserved by another member
		if (bookReservation != null && bookReservation.getMemberId() != this.getId()) {
			System.out.printf("The book %s with barcode %s already reserved by another member with id %d\n",
					bookItem.getTitle(), bookItem.getBarcode(), bookReservation.getMemberId());
			return false;
		} else if (bookReservation != null) {

			// Check if the book reserved the same member
			System.out.printf("The book %s with barcode %s already reserved by the same member with id %d\n",
					bookItem.getTitle(), bookItem.getBarcode(), bookReservation.getMemberId());
			return false;
		}

		// Check if BookItem Loned already
		// else borrowed
		if (!bookItem.reserveBookItem(this.getId())) {
			return false;
		}

		this.updateBooksReservationsAdd(bookItem);
		return true;
	}

	// ************* This method is responsible for cancel
	// reservation***************//

	public boolean cancelReservation(BookItem bookItem) {

		// Get the record from BookReseravtion based on the book bar code
		BookReservation bookReservation = BookReservation.getReservationDetails(bookItem.getBarcode());

		// Check if the book already reserved by another member
		if (bookReservation != null && bookReservation.getMemberId() != this.getId()) {
			System.out.printf("The book %s with barcode %s already reserved by another member with id %d\n",
					bookItem.getTitle(), bookItem.getBarcode(), bookReservation.getMemberId());
			return false;
		}
		if (bookReservation != null) {
			// The member has reserved this book before. Now remove this record from
			// Reserved list, member reserved list and member reservation counters, update
			// status for the book
			BookReservation.updateBookReservationListDel(bookItem.getBarcode());
			bookItem.updateBookStatus(BookStatus.AVAILABLE);
			updateBooksReservationsDel(bookItem);

		}

		return true;
	}

	// ************* This method is responsible for return book back to the
	// library***************//

	public boolean returnBook(BookItem bookItem) {

		// Get the record from BookLending based on book bar code
		LocalDate returnDate = LocalDate.now();
		BookLending bookLending = BookLending.getLengingDetails(bookItem.getBarcode());

		// Check if the book already borrowed by another member
		if (bookLending != null && bookLending.getMemberId() != this.getId()) {
			System.out.printf("The book %s with barcode %s already borrowed by another member with id %d\n",
					bookItem.getTitle(), bookItem.getBarcode(), bookLending.getMemberId());
			return false;
		} else if (bookLending != null) {
			// The member has borrowed this book. Now remove this record from
			// Borrowed list, member borrowed list and member borrowed counters

			bookLending.updateReturnDate(returnDate);
			updatePenalty(bookLending.calcPenalty(bookItem));
			BookLending.updateBookLendingListDel(bookItem.getBarcode());
			bookItem.updateBookStatus(BookStatus.AVAILABLE);
			updateBooksCheckedoutDel(bookItem);

		}

		return true;
	}
	// ********* This Method return all borrowed books***********//
	
	public boolean returnBookAll() {
		
		if (!getBorrowedBooks().isEmpty()) { 
			ArrayList<BookItem> borrowedBooksCopy = new ArrayList<BookItem>(getBorrowedBooks());
			for(BookItem bookItem : borrowedBooksCopy) {
				if (!returnBook(bookItem)) {
					System.out.printf("Warning : The book with barcode %s is not returned\n", bookItem.getBarcode());
				}
			}
		} else {
			System.out.printf("Warning : The member %s doesn't have borrowed books\n", getContactInfo().getName());
		}
		return true;
	}
	
	// ********* This Method cancel all reserved books***********//
	
		public boolean cancelReservationAll() {
			
			if (!getReservedBooks().isEmpty()) { 
				ArrayList<BookItem> reservedBooksCopy = new ArrayList<BookItem>(getReservedBooks());
				for(BookItem bookItem : reservedBooksCopy) {
					if (!cancelReservation(bookItem)) {
						System.out.printf("Warning : The reservatio book with barcode %s cancelled\n", bookItem.getBarcode());
					}
				}
			} else {
				System.out.printf("Warning : The member %s doesn't have reserved books\n", getContactInfo().getName());
			}
			return true;
		}

	// ********* This Method ADD CHECKEDOUT books list and counter***********//

	private void updateBooksCheckedoutAdd(BookItem bookItem) {
		this.totalBooksCheckedout++;
		this.borrowedBooks.add(bookItem);
	}

	// ********* This Method REMOVE CHECKEDOUT books list and counter***********//

	private void updateBooksCheckedoutDel(BookItem bookItem) {

		if (this.totalBooksCheckedout != 0) {
			this.totalBooksCheckedout--;
			this.borrowedBooks.remove(bookItem);

		}

	}

	// ********* This Method ADD RESERVED books list and counter***********//

	private void updateBooksReservationsAdd(BookItem bookItem) {
		this.totalBooksReserved++;
		this.reservedBooks.add(bookItem);
	}

	// ********* This Method REMOVE RESERVED books list and counter***********//

	private void updateBooksReservationsDel(BookItem bookItem) {
		if (totalBooksReserved != 0) {
			this.totalBooksReserved--;
			this.reservedBooks.remove(bookItem);
		}

	}

	// ********* This Method display borrowed books list**********************//

	public void displayBorrowedBooks() {
		if (!getBorrowedBooks().isEmpty()) {
			System.out.printf("Member %s with id %d has %d borrowed books: \n", this.getContactInfo().getName(),
					this.getId(), this.getTotalBooksCheckedout());
			borrowedBooks.forEach(bookItem -> System.out.printf(
					"\t Barcode :  %s, ISBN :  %s, Title : %s, Author Name : %s, Status : %s\n", bookItem.getBarcode(),
					bookItem.getIsbn(), bookItem.getTitle(), bookItem.getAuthor().getName(), bookItem.getStatus()));
		} else {
			System.out.printf("Warning : The member %s doesn't have borrowed books\n", getContactInfo().getName());
		}

	}

	// ********* This Method display reserved books list**********************//

	public void displayReservedBooks() {
		if (!getReservedBooks().isEmpty()) {
			System.out.printf("Member %s with id %d has %d reserved books: \n", this.getContactInfo().getName(),
					this.getId(), this.getTotalBooksReserved());
			reservedBooks.forEach(bookItem -> System.out.printf(
					"\t Barcode :  %s, ISBN :  %s, Title : %s, Author Name : %s, Status : %s\n", bookItem.getBarcode(),
					bookItem.getIsbn(), bookItem.getTitle(), bookItem.getAuthor().getName(), bookItem.getStatus()));
		} else {
			System.out.printf("Warning : The member %s doesn't have reserved books\n", getContactInfo().getName());
		}

	}

	// ********* This Method update penalty **********************//

	private void updatePenalty(double penalty) {
		this.penalty = penalty;

	}

	public void payPenalty() {

	}

	public void contributeBook(BookItem bookItem) {

	}

}
