package day26;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Car extends Thread{
	private CyclicBarrier cb;
	
	
	public Car(CyclicBarrier cb,String tName) {
		this.cb =cb;
		setName(tName);
	}
	
	
	@Override
	public void run() {
		String tName  = Thread.currentThread().getName();
		System.out.printf("%s 從台北出發了%n",getName());
		try {
			Thread.sleep(new Random().nextInt(5000));
			System.out.printf("%s 到台中了%n",tName);
			cb.await();
		} catch (Exception e) {
	
		}
		System.out.printf("%s 任務結束%n",tName);
	}
}
