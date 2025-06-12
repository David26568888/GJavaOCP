package day25;

//進行提款工作

public class Withdraw implements Runnable {
	private Account account;
	private Integer amount;
	
	public Withdraw(Account account,Integer amount) {
		this.account = account;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		//執行提款
		account.widthdraw(amount);
	}

}
