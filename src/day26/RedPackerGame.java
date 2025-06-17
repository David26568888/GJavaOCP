package day26;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//搶紅包遊戲
public class RedPackerGame {
	public static void main(String[] args) throws InterruptedException {
		Map<String, Integer> earnings = new ConcurrentHashMap<>();
		//ConcurrentHashMap  多執行緒的時候必須使用 類似synchronized 一個緒完成下一個才能用
		//三個人來搶紅包
		ExecutorService players = Executors.newFixedThreadPool(3);
		int redPacket = 2000;
		
		System.out.println("遊戲開始");
		for(int i=1; i<=100 ;i++) {
			players.submit(()->{//submit(Runnable task)<<任務
				String tName = Thread.currentThread().getName();
				try {
					Thread.sleep(new Random().nextInt(500));
				} catch (Exception e) {
					System.out.printf("%s 被中斷%n",tName);
					return;
				}
				System.out.printf("%s 搶到紅包$%d%n",tName,redPacket);
				
				//累加該執行緒的金額
				earnings.merge(tName, redPacket, (t, u)->t+u);
				// BiFunction<T, U, R>
				//t是現在值 U下一筆得到的 回傳t=t+u 
				//earnings.merge(tName, redPacket, Interger::sum);
			});
		}
		
		//現時2000ms(2秒)
		Thread.sleep(2000);
		
		//強制將players 結束
		players.shutdownNow();
		System.out.println("時間到,遊戲結束");
		System.out.println(earnings);
	}
}
