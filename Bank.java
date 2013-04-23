class Bank {
    
	public static void main (String [] args) {
        new Bank();
    }
}

class BankLogic extends Thread {
	Account a;
	public void run() {
		insertAndWithDraw(a);
	}

	BankLogic(Account a) {
		this.a = a;
	}
	
	synchronized void insert(Account a) {
		try {
		Thread.sleep((long)Math.random() * 1000);
		} catch (InterruptedException e) {
			System.out.println("Noe skjerv..");
			System.exit(1);
		}
		a.insert();
		//System.out.println(a.getBalance());
	}

	synchronized void withdraw(Account a) {
		try {
		Thread.sleep((long) Math.random() * 1000);
		} catch (InterruptedException e) {
			System.out.println("Noe skjerv..");
			System.exit(1);
		}
		a.withdraw();
	}

	synchronized void insertAndWithDraw(Account a) {
		for (int i = 0; i < 20; i++) {
			insert(a);
			withdraw(a);
		}
	}

	synchronized void printOut(Account a) {
		System.out.println(a.getBalance());
	}
}