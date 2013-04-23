class Insert extends Thread {
	private Account account;

	Insert(Account a) {
		account = a;
	}
	public void run() {
		account.insert();
	}
}