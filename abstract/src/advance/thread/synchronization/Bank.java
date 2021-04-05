package advance.thread.synchronization;

public class Bank {
	int bankBalance=10000;
	
	void withDraw(int amountWithdrawn) {
		System.out.println("Going to withdraw");
		if (bankBalance<amountWithdrawn){
			System.out.println("The balance is low");
			try {
				wait();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		bankBalance=bankBalance-amountWithdrawn;
				System.out.println("Withdraw complete");
	}
	
	
	synchronized void deposit(int amountdeposited) {
		System.out.println("going to deposit");
		bankBalance = bankBalance+ amountdeposited;
		System.out.println("Deposit completed");
		notify();
	}

}
