class Account {
	static final int AMOUNT = 50;
	long balance;
	synchronized void insert() {
		balance += AMOUNT;
	}
	synchronized void withdraw() {
		balance -= AMOUNT;
	}
	synchronized long getBalance() {
		return balance;
	}
}