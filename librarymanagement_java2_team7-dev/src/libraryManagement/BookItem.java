package libraryManagement;

import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BookItem extends Book {
	private String barcode;
	private LocalDate creationDate;
	private double priceIfOverdue;
	private BookStatus status;
	private BookFormat format;
	private Location location;

	

	public BookItem(String isbn, String title, String subject, Author author, String publisher, String barcode,
			LocalDate creationDate, double priceIfOverdue, BookStatus status, BookFormat format, Location location) {
		super(isbn, title, subject, author, publisher);
		this.barcode = barcode;
		this.creationDate = creationDate;
		this.priceIfOverdue = priceIfOverdue;
		this.status = status;
		this.format = format;
		this.location = location;
	}

	public String getBarcode() {
		return barcode;
	}
	
	public LocalDate getCreationDate() {
		return creationDate;
	}

	public double getPriceIfOverdue() {
		return priceIfOverdue;
	}

	public BookStatus getStatus() {
		return status;
	}

	public BookFormat getFormat() {
		return format;
	}

	public Location getLocation() {
		return location;
	}

	public void setStatus(BookStatus status) {
		this.status = status;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((barcode == null) ? 0 : barcode.hashCode());
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((format == null) ? 0 : format.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		long temp;
		temp = Double.doubleToLongBits(priceIfOverdue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		BookItem other = (BookItem) obj;
		if (barcode == null) {
			if (other.barcode != null)
				return false;
		} else if (!barcode.equals(other.barcode))
			return false;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (format != other.format)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (Double.doubleToLongBits(priceIfOverdue) != Double.doubleToLongBits(other.priceIfOverdue))
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	// ******* this method is responsible for checkout book********//
	public boolean checkout(int memberId) {

		if (status == BookStatus.LOANED) {
			System.out.println("Sorry, the book already borrowed");
			return false;
		} else if (!BookLending.lendBook(barcode, memberId)) {
			return false;
		}
		this.updateBookStatus(BookStatus.LOANED);
		return true;
	}

	// ******* this method is responsible for reserve book********//
	public boolean reserveBookItem(int memberId) {

		if (status == BookStatus.LOANED) {
			System.out.println("Sorry, the book already borrowed");
			return false;
		} else if (!BookReservation.reserveBook(barcode, memberId)) {
			return false;
		}
		this.updateBookStatus(BookStatus.RESERVED);
		return true;
	}

	// ******* this method is responsible for update status book********//

	public void updateBookStatus(BookStatus bookStatus) {
		this.status = bookStatus;
	}

	@Override
	public String toString() {
		return "BookItem  -> barcode : " + barcode  + ", ISBN : " + getIsbn()
		+ ", title : " + getTitle() + ", subject : " + getSubject() + "\n" + getAuthor()
		+ ", publisher : " + getPublisher() + "\ncreation Date : " + creationDate + ", price if overdue : " + priceIfOverdue
				+ ", status : " + status + ", format : " + format + "\n" + location;
	}

//	@Override
//	public String toString() {
//		return "BookItem barcode : " + barcode + ", priceIfOverdue : " + priceIfOverdue + ", status : " + status
//				+ ", format : " + format + ", location : " + location;
//	}
	

}