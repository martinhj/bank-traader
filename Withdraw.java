class Withdraw extends Thread {
	private Account account;
	Withdraw(Account a) {
		account = a;
	}
	public void run() {
		account.withdraw();
	}
}