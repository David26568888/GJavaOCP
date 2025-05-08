package day09.case2;



public class SnackStore {
	public static void main(String[] args) {
		SaltedChicken saltedChicken = new SaltedChicken("鹹酥雞", 60);
		Tempura tempura = new Tempura("甜不辣", 30);
		Tofu tofu = new Tofu("百頁豆腐", 25);
		
		//比較兩者差異AbstractSnack[] V.S Snack[]  這兩個陣列比較
		int sum = 0;
		AbstractSnack[] abstractSnacks= {saltedChicken,tempura,tofu};
		for (AbstractSnack abstractSnack : abstractSnacks) {
			abstractSnack.makeSnack();
			sum+= abstractSnack.getPrice();
			//在AbstractSnack 抽象類 補一個製作方法 減少重複呼叫
		}
		System.out.printf("總共%d元",sum);
		//Snack[] snacks= {saltedChicken,tempura,tofu};
	}
	

}
