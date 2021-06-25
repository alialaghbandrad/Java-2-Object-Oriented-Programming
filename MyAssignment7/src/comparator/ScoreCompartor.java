package comparator;

import java.util.Comparator;

public class ScoreCompartor implements Comparator<User> {

	@Override
	public int compare(User s1, User s2) {
		if (s1.getId() == s2.getId()) {
			return 0;
		}
		else if (s1.getId() > s2.getId()) {
			return 1;
		}
		else {
			return -1;
		}
	}

}