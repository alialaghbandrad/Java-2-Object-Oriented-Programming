package comparator;

import java.util.Comparator;

public class DateCompartor implements Comparator<User> {

	@Override
	public int compare(User p1, User p2) {
		return Long.valueOf(p2.getBirthdate().getTime()).compareTo(p1.getBirthdate().getTime());
    }
}

