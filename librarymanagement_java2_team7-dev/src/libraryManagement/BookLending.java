package libraryManagement;

import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;

public class BookLending {
	private LocalDate creationDate;
	private LocalDate dueDate;
	private LocalDate returnDate;
	private String bookItemBarCode;
	private int memberId;

	private static HashMap<String, BookLending> bookLendingMap = new HashMap<String, BookLending>();

	public BookLending(LocalDate creationDate, LocalDate dueDate, LocalDate returnDate, String bookItemBarCode,
			int memberId) {
		this.creationDate = creationDate;
		this.dueDate = dueDate;
		this.returnDate = returnDate;
		this.bookItemBarCode = bookItemBarCode;
		this.memberId = memberId;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public String getBookItemBarCode() {
		return bookItemBarCode;
	}

	public int getMemberId() {
		return memberId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookItemBarCode == null) ? 0 : bookItemBarCode.hashCode());
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
		result = prime * result + memberId;
		result = prime * result + ((returnDate == null) ? 0 : returnDate.hashCode());
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
		BookLending other = (BookLending) obj;
		if (bookItemBarCode == null) {
			if (other.bookItemBarCode != null)
				return false;
		} else if (!bookItemBarCode.equals(other.bookItemBarCode))
			return false;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (dueDate == null) {
			if (other.dueDate != null)
				return false;
		} else if (!dueDate.equals(other.dueDate))
			return false;
		if (memberId != other.memberId)
			return false;
		if (returnDate == null) {
			if (other.returnDate != null)
				return false;
		} else if (!returnDate.equals(other.returnDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BookLending creationDate : " + creationDate + ", dueDate : " + dueDate + ", returnDate : " + returnDate
				+ ", bookItemBarCode : " + bookItemBarCode + ", memberId : " + memberId;
	}

	public static boolean lendBook(String bookItemBarCode, int memberId) {
		LocalDate currentDate = LocalDate.now();
		LocalDate returnDate = currentDate.plusDays(Constants.MAX_LENDING_DAYS);
		BookLending bookLending = new BookLending(currentDate, returnDate, null, bookItemBarCode, memberId);

		updateBookLendingListAdd(bookItemBarCode, bookLending);

		return true;
	}

	// ******* this method REMOVE record from lending list********//

	public static boolean updateBookLendingListDel(String bookItemBarCode) {
		bookLendingMap.remove(bookItemBarCode);
		return true;
	}

	// ******* this method ADD record to the lending list********//

	public static boolean updateBookLendingListAdd(String bookItemBarCode, BookLending bookLending) {
		bookLendingMap.put(bookItemBarCode, bookLending);
		return true;
	}

	// ******* this method return record from the list********//

	public static BookLending getLengingDetails(String bookItemBarCode) {
		return bookLendingMap.get(bookItemBarCode);
	}

	// ******* this method update return date********//

	public void updateReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	// ******* this method calculate penalty********//

	public double calcPenalty(BookItem bookItem) {
		long days = 0;
		if (returnDate.isAfter(dueDate)) {
			days = ChronoUnit.DAYS.between(dueDate, returnDate);

		}
		return bookItem.getPriceIfOverdue() * days;

	}

}
