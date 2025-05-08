package day07;

public class DeluxeClawMachine extends ClawMachine {
	
	private boolean musicEnabled = true;
	
	public void playMusic() {
		if(musicEnabled) {
			System.out.println("撥放音樂:♪♪♪ ");
		}
	}
	//覆寫
	@Override
	public void play() {
		if(coinCount>0) {
			coinCount--;
			playMusic();//開始撥放音樂
			System.out.println("豪華版夾娃娃機 開始夾娃娃");
		}else {
			System.out.println("請先投幣");
		}
		
	}
}
