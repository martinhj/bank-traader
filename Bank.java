class Bank {
    Account account = new Account();
    Insert insert = new Insert(account);
    Withdraw withdraw = new Withdraw(account);
	Bank () {

			insert.start();
			withdraw.start();
		try {
		Thread.sleep(20);
		} catch(InterruptedException e) {
		} 
		System.out.println(account.getBalance());
	}
	public static void main (String [] args) {
        new Bank();
    }
}