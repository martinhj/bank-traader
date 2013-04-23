class Account {
	static final int AMOUNT = 50;
	long balance;
	void insert() {
		balance += AMOUNT;
	}
	void withdraw() {
		balance -= AMOUNT;
	}
	long getBalance() {
		return balance;
	}
}