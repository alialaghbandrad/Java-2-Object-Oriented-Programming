package libraryManagement;

import java.util.ArrayList;

public interface Search {
	public ArrayList<BookItem> searchByTitle();
	public ArrayList<BookItem> searchByAuthor();
	public ArrayList<BookItem> searchBySubject();
}
