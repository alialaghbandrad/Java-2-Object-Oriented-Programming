package libraryManagement;

import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MemberCard {
	private String cardNumber;
	private LocalDate issuedAt;
	private boolean isActive;

	public MemberCard(String cardNumber, LocalDate issuedAt, boolean isActive) {
		this.cardNumber = cardNumber;
		this.issuedAt = issuedAt;
		this.isActive = isActive;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public LocalDate getIssuedAt() {
		return issuedAt;
	}

	public boolean isActive() {
		return isActive;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
		result = prime * result + (isActive ? 1231 : 1237);
		result = prime * result + ((issuedAt == null) ? 0 : issuedAt.hashCode());
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
		MemberCard other = (MemberCard) obj;
		if (cardNumber == null) {
			if (other.cardNumber != null)
				return false;
		} else if (!cardNumber.equals(other.cardNumber))
			return false;
		if (isActive != other.isActive)
			return false;
		if (issuedAt == null) {
			if (other.issuedAt != null)
				return false;
		} else if (!issuedAt.equals(other.issuedAt))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MemberCard -> cardNumber : " + cardNumber + ", issued Date : " + issuedAt + ", status : " + isActive;
	}

}
