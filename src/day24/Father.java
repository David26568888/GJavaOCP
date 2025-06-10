package day24;

public class Father extends Thread{
	
	@Override
	public void run() {
		System.out.println("爸爸下班回家");
		System.out.println("爸爸準備洗澡");
		System.out.println("爸爸發現沒有熱水");
		System.out.println("爸爸打電話請瓦斯工人送瓦斯");
		
		Worker worker = new Worker();
		worker.start();
		try {
			worker.join();
			//比較 Thread.sleap(20000)
			//worker.join(6000);//給工人多久時間完成送瓦斯
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("爸爸開始洗熱水澡");
		System.out.println("爸爸洗完澡了");
		
	}
}
