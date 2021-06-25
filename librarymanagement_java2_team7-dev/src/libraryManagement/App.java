package libraryManagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {

	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		// Create library object
		ContactInfo libraryContactInfo = new ContactInfo("BAnQ Grande Bibliothèque", "514 873-1100",
				"boutique.banq@banq.qc.ca");
		Address libraryAddress = new Address("475 Boul. de Maisonneuve E", "Montreal", "QC", "H2L5C4", "Canada");
		Library library = new Library(libraryContactInfo, libraryAddress);

		// Create BookItems
		BookItem bookitem1 = new BookItem("isbn1", "The lord of the rings", "Fantasy",
				new Author("Tolkien", "J. R. R. (John Ronald Reuel), 1892-1973 auteur"),
				"London : HarperCollinsPublishers, 2014", "barcode1", LocalDate.now(), 1, BookStatus.AVAILABLE,
				BookFormat.HARDCOVER, new Location(1, "location description1"));
		BookItem bookitem2 = new BookItem("isbn1", "The lord of the rings", "Fantasy",
				new Author("Tolkien", "J. R. R. (John Ronald Reuel), 1892-1973 auteur"),
				"London : HarperCollinsPublishers, 2014", "barcode2", LocalDate.now(), 2, BookStatus.AVAILABLE,
				BookFormat.HARDCOVER, new Location(1, "location description2"));
		BookItem bookitem3 = new BookItem("isbn1", "The lord of the rings", "Fantasy",
				new Author("Tolkien", "J. R. R. (John Ronald Reuel), 1892-1973 auteur"),
				"London : HarperCollinsPublishers, 2014", "barcode3", LocalDate.now(), 3, BookStatus.AVAILABLE,
				BookFormat.HARDCOVER, new Location(1, "location description3"));
		BookItem bookitem4 = new BookItem("isbn2", "The lord of the rings: the art of the fellowship of the ring",
				"Fantasy", new Author("Russell", "Gary, 1963-"), "London : HarperCollins, 2002", "barcode4",
				LocalDate.now(), 4, BookStatus.AVAILABLE, BookFormat.HARDCOVER,
				new Location(1, "location description4"));
		BookItem bookitem5 = new BookItem("isbn2", "The lord of the rings: the art of the fellowship of the ring",
				"Fantasy", new Author("Russell", "Gary, 1963-"), "London : HarperCollins, 2002", "barcode5",
				LocalDate.now(), 5, BookStatus.AVAILABLE, BookFormat.HARDCOVER,
				new Location(1, "location description5"));
		BookItem bookitem6 = new BookItem("isbn2", "The lord of the rings: the art of the fellowship of the ring",
				"Fantasy", new Author("Russell", "Gary, 1963-"), "London : HarperCollins, 2002", "barcode6",
				LocalDate.now(), 6, BookStatus.AVAILABLE, BookFormat.HARDCOVER,
				new Location(1, "location description6"));
		BookItem bookitem7 = new BookItem("isbn3", "The old man and the sea", "Adventure",
				new Author("Hemingway", "Ernest, 1899-1961 auteur"), "Hemingway Library edition.", "barcode7",
				LocalDate.now(), 7, BookStatus.AVAILABLE, BookFormat.HARDCOVER,
				new Location(1, "location description7"));
		BookItem bookitem8 = new BookItem("isbn3", "The old man and the sea", "Adventure",
				new Author("Hemingway", "Ernest, 1899-1961 auteur"), "Hemingway Library edition.", "barcode8",
				LocalDate.now(), 10, BookStatus.AVAILABLE, BookFormat.HARDCOVER,
				new Location(1, "location description8"));
		BookItem bookitem9 = new BookItem("isbn3", "The old man and the sea", "Adventure",
				new Author("Hemingway", "Ernest, 1899-1961 auteur"), "Hemingway Library edition.", "barcode9",
				LocalDate.now(), 20, BookStatus.AVAILABLE, BookFormat.HARDCOVER,
				new Location(1, "location description9"));

		// Add bookItems to the storage

		library.addBookItem(bookitem1, bookitem2, bookitem3, bookitem4, bookitem5, bookitem6, bookitem7, bookitem8,
				bookitem9);

		ArrayList<BookItem> libraryStorage = library.getBookitem();

		// Create Librarian

		Librarian librarian1 = new Librarian(1, new Address("Earnscliffe ave", "Montreal", "QC", "H3X2P6", "Canada"),
				new ContactInfo("Tom", "431555555", "test@gmail.com"), AccountStatus.ACTIVE, "123",
				new MemberCard("card#1", LocalDate.now(), true), true);

		// Create Members
		Member member1 = new Member(2, new Address("Earnscliffe ave", "Montreal", "QC", "H3X2P6", "Canada"),
				new ContactInfo("Bill", "4316666666", "test2@gmail.com"), AccountStatus.ACTIVE, "123",
				new MemberCard("card#2", LocalDate.now(), true), true);
		Member member2 = new Member(3, new Address("Earnscliffe ave", "Montreal", "QC", "H3X2P6", "Canada"),
				new ContactInfo("Jane", "4317777777", "test3@gmail.com"), AccountStatus.ACTIVE, "123",
				new MemberCard("card#3", LocalDate.now(), true), true);

		// Add members to the library

		library.addAccount(member1, member2);
		ArrayList<Account> libraryAccounts = library.getAccounts();

		// Main menu

		login(library, libraryStorage, libraryAccounts);

	}

	public static void login(Library library, ArrayList<BookItem> libraryStorage, ArrayList<Account> libraryAccounts) {
		int input = -1;
		BookItem bookItem = null;
		Member member = null;

		do {
			displayChoices(member, bookItem);
			System.out.println("*** Main menu ***");
			displayMenu();
			input = in.nextInt();
			switch (input) {
			case 0:
				System.out.println("Exit system, see you next time.");
				input = 0;
				break;
			case 1:
				int inputFirst = -1;
				do {
					displayChoices(member, bookItem);
					System.out.println("*** Manage members ***");
					displayManageMembers();
					inputFirst = in.nextInt();
					switch (inputFirst) {
					case 0:
						System.out.println("Exit system, see you next time.");
						input = 0;
						break;
					case 1:
						System.out.println("Active members: ");
						library.displayMembers();
						break;
					case 2:
						System.out.println("Choose one of the member below: ");
						library.displayMembers();
						int index = in.nextInt();
						member = (Member) libraryAccounts.get(index - 1);
						break;
					case 3:
						inputFirst = 0;
						break;

					default:
						System.out.println("Invalid action. please re-try.");
					}
				} while (inputFirst != 0);
				break;
			case 2:
				int inputSecond = -1;
				do {
					displayChoices(member, bookItem);
					System.out.println("*** Manage library storage ***");
					displayManageStorage();
					inputSecond = in.nextInt();
					switch (inputSecond) {
					case 0:
						System.out.println("Exit system, see you next time.");
						input = 0;
						break;
					case 1:
						System.out.println("Books in the storage: ");
						library.displayBooks();
						break;
					case 2:
						System.out.println("Choose one of the book below: ");
						library.displayBooks();
						int index = in.nextInt();
						bookItem = libraryStorage.get(index - 1);
						break;
					case 3:
						inputSecond = 0;
						break;

					default:
						System.out.println("Invalid action. please re-try.");
					}
				} while (inputSecond != 0);
				break;
			case 3:
				if (member != null && bookItem != null) {
					int inputThird = -1;
					do {
						displayChoices(member, bookItem);
						System.out.println("*** Main functionality ***");
						displayMainFunctionality();
						inputThird = in.nextInt();
						switch (inputThird) {
						case 0:
							System.out.println("Exit system, see you next time.");
							input = 0;
							break;
						case 1:
							member.reserveBookItem(bookItem);
							break;
						case 2:
							member.checkoutBookItem(bookItem);
							break;
						case 3:
							member.cancelReservation(bookItem);
							break;
						case 4:
							member.returnBook(bookItem);
							break;
						case 5:
							member.cancelReservationAll();
							break;
						case 6:
							member.returnBookAll();
							break;
						case 7:
							member.displayReservedBooks();
							break;
						case 8:
							member.displayBorrowedBooks();
							break;
						case 9:
							inputThird = 0;
							break;

						default:
							System.out.println("Invalid action. please re-try.");
						}
					} while (inputThird != 0);
				} else {
					System.out.println("Warning : Before using the main functionality, please choose member and desired book");
				}

				break;

			default:
				System.out.println("Invalid action. please re-try.");
			}
		} while (input != 0);

	}

	public static void displayMenu() {
//		System.out.printf("%n%nHello, our dear member %s, how can we help you?%n");
		System.out.println("----------------------------------------------------------");

		StringBuilder menuString = new StringBuilder();
		menuString.append("1. Manage members %n");
		menuString.append("2. Manage library storage %n");
		menuString.append("3. Main functionality %n");
		menuString.append("0. Exit %n");

		System.out.printf(menuString.toString());

		System.out.println("----------------------------------------------------------");
	}

	public static void displayManageMembers() {
		System.out.println("----------------------------------------------------------");

		StringBuilder menuString = new StringBuilder();
		menuString.append("1. Display all members %n");
		menuString.append("2. Choose member %n");
		menuString.append("3. Back to main menu %n");
		menuString.append("0. Exit %n");

		System.out.printf(menuString.toString());

		System.out.println("----------------------------------------------------------");
	}

	public static void displayManageStorage() {
		System.out.println("----------------------------------------------------------");

		StringBuilder menuString = new StringBuilder();
		menuString.append("1. Display all books %n");
		menuString.append("2. Choose the book %n");
		menuString.append("3. Back to the main menu %n");
		menuString.append("0. Exit %n");

		System.out.printf(menuString.toString());

		System.out.println("----------------------------------------------------------");
	}

	public static void displayMainFunctionality() {
		System.out.println("----------------------------------------------------------");

		StringBuilder menuString = new StringBuilder();
		menuString.append("1. Make a reservation %n");
		menuString.append("2. Borrow the book %n");
		menuString.append("3. Cancel the reservation %n");	
		menuString.append("4. Return the book %n");
		menuString.append("5. Cancel all reservations %n");
		menuString.append("6. Return all books %n");
		menuString.append("7. Display reserved books %n");
		menuString.append("8. Display borrowed books %n");
		menuString.append("9. Back to the main menu %n");
		menuString.append("0. Exit %n");

		System.out.printf(menuString.toString());

		System.out.println("----------------------------------------------------------");
	}

	public static void displayChoices(Member member, BookItem bookItem) {
		if (member != null && bookItem != null) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("|\tActive member : %s, ID : %s \t|\tActive book : %s, Code : %s, Status : %s\t|\n",
					member.getContactInfo().getName(), member.getId(), bookItem.getTitle(), bookItem.getBarcode(),
					bookItem.getStatus());
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}

	}

}
