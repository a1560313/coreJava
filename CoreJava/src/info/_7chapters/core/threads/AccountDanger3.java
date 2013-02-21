package info._7chapters.core.threads;

class Account {
	private int balance = 50;
	public int getBalance() {
		return balance;
	}
	public void withdraw(int amount) {
		balance = balance - amount;
	}
}


public class AccountDanger3 implements Runnable {
	private Account acct = new Account();
	public static void main (String [] args) {
		AccountDanger3 r = new AccountDanger3();

		Thread one = new Thread(r,"Jay");
		Thread two = new Thread(r,"Raju");
		
		one.setPriority(10);
		two.setPriority(1);
		
		System.out.println("1one.getState()" + one.getState());
		one.start();
		System.out.println("2one.getState()" + one.getState());
		two.start();
	}
	public void run() {
		
//		synchronized(this){
			for (int x = 0; x < 6; x++) {
				makeWithdrawal(10);
				if (acct.getBalance() < 0) {
					System.out.println("account is overdrawn!");
				}
			}
//		}
	}
	
	private synchronized void makeWithdrawal(int amt) {
		if (acct.getBalance() >= amt) {

			System.out.println(Thread.currentThread().getName()
					+ " is going to withdraw");
			try {
				Thread.sleep(500);
			} catch(InterruptedException ex) { 
				
			}
			acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName()
					+ " completes the withdrawal and current Balance is "+ acct.getBalance());
		} else {
			System.out.println("Not enough in account for "
					+ Thread.currentThread().getName()
					+ " to withdraw " + acct.getBalance());
		}
	}
}