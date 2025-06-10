package day24;

import java.util.Iterator;

public class Worker extends Thread {
	@Override
	public void run() {
		System.out.println("瓦斯工人開始送瓦斯");
		
		for(int i =1; i<=5;i++) {
			try {
				System.out.printf("%d 秒鐘",i);
				Thread.sleep(2000);//模擬運送的時間
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
		}

		System.out.println("瓦斯工人將瓦斯送到家並裝設好");
	
	}
}
