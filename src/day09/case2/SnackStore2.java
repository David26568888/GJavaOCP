package day09.case2;


public class SnackStore2 {

	public static void main(String[] args) {
		SaltedChicken saltedChicken = new SaltedChicken("鹹酥雞",50);
		saltedChicken.setSize(3);
		//異常 初始值異常 未設fixedPrice  所以會倒置price 被改
		System.out.printf("%s 份量:%d 價格:%d%n",
				saltedChicken.getName(),saltedChicken.getSize(),saltedChicken.getPrice());
		saltedChicken.makeSnack();
	}


}
