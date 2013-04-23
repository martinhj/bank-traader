class Withdraw extends Thread {
	private Account account;
	Withdraw(Account a) {
		account = a;
	}
	public void run() {
		System.out.println("Tar ut 50");
		System.out.println("Saldo er: " + account.getBalance());
		for (int i = 0; i < 20; i++)
			account.withdraw();
	}
}