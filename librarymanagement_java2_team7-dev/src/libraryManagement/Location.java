package libraryManagement;

public class Location {
	private int rack;
	private String locationIdent;

	public Location(int rack, String locationIdent) {
		this.rack = rack;
		this.locationIdent = locationIdent;
	}

	public int getRack() {
		return rack;
	}

	public String getLocationIdent() {
		return locationIdent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((locationIdent == null) ? 0 : locationIdent.hashCode());
		result = prime * result + rack;
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
		Location other = (Location) obj;
		if (locationIdent == null) {
			if (other.locationIdent != null)
				return false;
		} else if (!locationIdent.equals(other.locationIdent))
			return false;
		if (rack != other.rack)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Location -> rack : " + rack + ", locationIdent : " + locationIdent;
	}

}
