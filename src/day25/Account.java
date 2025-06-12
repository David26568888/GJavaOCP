package day25;

public class Account {
	private Integer balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	public synchronized void widthdraw(int amount) {//synchronized 讓執行緒不要一起進入 而是分開進入
		String threadName = Thread.currentThread().getName();
		System.out.printf("%s 開始提款%n", threadName);
		
		
		//取得餘額
		int myBalance = balance;
//		myBalance = -10;
		
		//模擬運作時間
		for(int i=0; i<999999;i++);
		
		
		//檢查餘額是否足夠?
		if(myBalance<amount) {
			System.out.printf("%s 要提款:%d 失敗 目前餘額: %d 餘額不足%n"
					,threadName,amount,myBalance);
			return;
		}
		
		//進行提款
		myBalance = myBalance-amount;//扣款金額
		balance = myBalance;//將myBalance 設定給balance
		System.out.printf("%s 要提款:%d 成功 目前餘額: %d%n"
				,threadName,amount,myBalance);
	}
}
