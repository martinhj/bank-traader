class Insert extends Thread {
	private Account account;

	Insert(Account a) {
		account = a;
	}
	public void run() {
		System.out.println("Setter inn 50");
		System.out.println("Saldo er: " + account.getBalance());
		for (int i = 0; i < 20; i++)
			account.insert();
	}
}