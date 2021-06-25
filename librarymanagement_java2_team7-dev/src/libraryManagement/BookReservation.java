package libraryManagement;

import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;

public class BookReservation {
	private LocalDate creationDate;
	private LocalDate dueDate;
	private LocalDate cancelReservationDate;
	private String bookItemBarCode;
	private int memberId;

	private static HashMap<String, BookReservation> bookReservationMap = new HashMap<String, BookReservation>();

	public BookReservation(LocalDate creationDate, LocalDate dueDate, LocalDate cancelReservationDate,
			String bookItemBarCode, int memberId) {
		super();
		this.creationDate = creationDate;
		this.dueDate = dueDate;
		this.cancelReservationDate = cancelReservationDate;
		this.bookItemBarCode = bookItemBarCode;
		this.memberId = memberId;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public LocalDate getCancelReservationDate() {
		return cancelReservationDate;
	}

	public String getBookItemBarCode() {
		return bookItemBarCode;
	}

	public int getMemberId() {
		return memberId;
	}

	public static HashMap<String, BookReservation> getBookReservationMap() {
		return bookReservationMap;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookItemBarCode == null) ? 0 : bookItemBarCode.hashCode());
		result = prime * result + ((cancelReservationDate == null) ? 0 : cancelReservationDate.hashCode());
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
		result = prime * result + memberId;
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
		BookReservation other = (BookReservation) obj;
		if (bookItemBarCode == null) {
			if (other.bookItemBarCode != null)
				return false;
		} else if (!bookItemBarCode.equals(other.bookItemBarCode))
			return false;
		if (cancelReservationDate == null) {
			if (other.cancelReservationDate != null)
				return false;
		} else if (!cancelReservationDate.equals(other.cancelReservationDate))
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
		return true;
	}

	@Override
	public String toString() {
		return "BookReservation creationDate : " + creationDate + ", dueDate : " + dueDate
				+ ", cancelReservationDate : " + cancelReservationDate + ", bookItemBarCode : " + bookItemBarCode
				+ ", memberId : " + memberId;
	}

	// ******* this method is responsible for creating record for reserved
	// book********//

	public static boolean reserveBook(String bookItemBarCode, int memberId) {

		LocalDate currentDate = LocalDate.now();
		LocalDate returnDate = currentDate.plusDays(Constants.MAX_LENDING_DAYS);
		BookReservation bookReservation = new BookReservation(currentDate, returnDate, null, bookItemBarCode, memberId);

		updateBookReservationListAdd(bookItemBarCode, bookReservation);

		return true;
	}

	// ******* this method REMOVE record from reservation list********//

	public static boolean updateBookReservationListDel(String bookItemBarCode) {
		bookReservationMap.remove(bookItemBarCode);
		return true;
	}

	// ******* this method ADD record to reservation list********//

	public static boolean updateBookReservationListAdd(String bookItemBarCode, BookReservation bookReservation) {
		bookReservationMap.put(bookItemBarCode, bookReservation);
		return true;
	}

	// ******* this method return record from the list********//

	public static BookReservation getReservationDetails(String bookItemBarCode) {
		return bookReservationMap.get(bookItemBarCode);
	}

}
