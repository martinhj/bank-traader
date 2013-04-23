class Bank {
    Account account = new Account();
    Insert insert = new Insert(account);
    Withdraw withdraw = new Withdraw(account);
	Bank () {
		insert.start();
		withdraw.start();
	}
	public static void main (String [] args) {
        new Bank();
    }
}