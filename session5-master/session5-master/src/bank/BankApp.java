package bank;

public class BankApp {
	
	public static void main(String...strings) {
		
		Bank[] bankList =  new Bank[]
				{new RBC(), new TD()};
		
		
		for (int i = 0 ; i< bankList.length; i++) {
			showInfo(bankList[i]);
		}
		
		
	}
	
	
	public static void showInfo(Bank b) {
//		Bank bank= new Bank();
		double interestBank = b.getInterest(); //ctrl + 2 ... l
		System.out.println(b.getName() + " => interest = " + interestBank);

		
		
////		RBC rbcBank = new RBC();
//		double interestRbc = b.getInterest();
//		System.out.println(b.getName() + " => interest = " + interestRbc);
//
//		
////		TD Tdbank = new TD();
//		double interestTd = b.getInterest();
//		System.out.println(b.getName() + " => interest = " + interestTd);

	}
}
