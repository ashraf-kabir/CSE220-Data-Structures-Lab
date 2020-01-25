package Lab01Part02.Task07;

public class Test {

	public static void main(String[] args) {

		BankAccount acc1 = new BankAccount("Tamim Iqbal", "123", "12 abc street", 50000.00);
		BankAccount acc2 = new BankAccount("Shakib Al Hasan", "456", "34 ijk street", 20000.00);
		BankAccount acc3 = new BankAccount("Mashrafi Mortaza", "789", "56 pqr street", 30000.00);

		// acc1.setName("Tamim Iqbal");
		// acc1.setAccountID("123");
		// acc1.setAddress("12 abc street");
		// acc1.setBalance(36841.4);

		// acc2.setName("Shakib Al Hasan");
		// acc2.setAccountID("456");
		// acc2.setAddress("34 ijk street");
		// acc2.setBalance(98778.5);

		// acc3.setName("Mehedi Hasan");
		// acc3.setAccountID("789");
		// acc3.setAddress("56 pqr street");
		// acc3.setBalance(54644.8);

		System.out.printf("Account 01: " + "\n" + acc1.getName() + " ID: " + acc1.getAccountID() + " Address: "
				+ acc1.getAddress() + " Balance: " + acc1.getBalance() + " ");
		acc1.addInterest();
		System.out.printf("\n" + "Account 02: " + "\n" + acc2.getName() + " ID: " + acc2.getAccountID() + " Address: "
				+ acc2.getAddress() + " Balance: " + acc2.getBalance() + "\n");
		System.out.printf("\n" + "Account 03: " + "\n" + acc3.getName() + " ID: " + acc3.getAccountID() + " Address: "
				+ acc3.getAddress() + " Balance: " + acc3.getBalance() + " ");
		acc3.addInterest();
	}

}
