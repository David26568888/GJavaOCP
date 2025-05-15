package day04;

public class Account {
	private int balance = 10000;// 帳戶餘額(含初始值)不建議預設值設這裡 而是設在建構子

	/*
	 * 如果不打無參建構子，系統會自動生成預設建構子 public Account(){ balance=10000 }
	 *
	 */
	// 存款
	public void deposit(int amount) {
		if (amount <= 0) {// 設計思維: 當不成立條件則輸出警告 跳出回圈
			System.out.println("存款資料不正確");
			return;
		}
		System.out.printf("存款:$ %,d%n", amount);
		balance += amount;
	}

	// 提款
	public void withdraw(int amount) {

		if (amount <= 0) {// 設計思維: 當不成立條件則輸出警告 跳出回圈
			System.out.println("提款資料不正確");
			return;
		}

		if (amount > balance) {
			System.out.printf("提款$%,d%n失敗! 餘額不足!%n帳戶餘額: $%,d%n", amount, balance);
			return;
		}
		System.out.printf("提款:$ %,d%n", amount);
		balance -= amount;

	}
	
	//轉帳
	public void transfer (int amount,Account account2) {
		//判斷是否夠提
		if (amount>balance) {
			System.out.printf("轉帳$%,d%n失敗! 餘額不足!%n帳戶餘額: $%,d%n", amount, balance);
			return;
		}
		
		//自己這一方(提款)
		this.withdraw(amount);
		//對方
		account2.deposit(amount);;
	}

	// 列印帳戶資料
	public void printInfo() {
		System.out.printf("帳戶餘額: $%,d%n", balance);

	}
}
