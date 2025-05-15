package day07;

public class ClawMachine {
	protected int coinCount;// 儲存投幣數量
	// 投幣功能

	public void inserCoin() {
		coinCount++;
		System.out.printf("投幣成功! 目前投幣數量:%d ", coinCount);
	}

	// 啟動夾娃娃機
	public void play() {
		if (coinCount > 0) {
			coinCount--;
			System.out.println("開始夾娃娃!");
		} else {
			System.out.println("請先投幣");
		}
	}
}
