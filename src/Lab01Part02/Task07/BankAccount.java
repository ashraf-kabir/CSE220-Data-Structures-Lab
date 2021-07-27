package Lab01Part02.Task07;

public class BankAccount {

	public String name, address, accountID;
	public double balance;

	public BankAccount(String n, String add, String aId, double b) {
		name = n;
		address = add;
		accountID = aId;
		balance = b;
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setAccountID(String i) {
		accountID = i;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAddress(String a) {
		address = a;
	}

	public String getAddress() {
		return address;
	}

	public void setBalance(double c) {
		balance = c;
	}

	public double getBalance() {
		return balance;
	}

	public void addInterest() {
		double x = balance * 7 / 100;
		System.out.println("Interest: " + x);
	}

}
