package bank;


class BankC extends Bank {

	@Override
	public double getBalance() {
		return 200;
	}

}

class BankB extends Bank {

	@Override
	public double getBalance() {
		return 150;
	}

}

class BankA extends Bank {

		
	@Override
	public double getBalance() {
		return 100;
	}

}


public abstract class Bank {

	public abstract double getBalance();

}
