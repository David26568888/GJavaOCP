package day09.case1;

//小吃店 (台灣第一家鹹酥雞專賣店)
public class SnackStore {

	public static void main(String[] args) {
		CrispySaltedChicken crispySaltedChicken = new CrispySaltedChicken("鹹酥雞", 60);

		Tempura tempura = new Tempura("甜不辣", 30);
		Tofu tofu = new Tofu("百頁豆腐", 25);

		// 製作餐點-鹹酥雞
		System.out.printf("======開始製作:%s ======%n", crispySaltedChicken.getName());
		crispySaltedChicken.prepare();
		crispySaltedChicken.cook();
		crispySaltedChicken.serve();
		System.out.printf("======售價:NT %d=====%n", crispySaltedChicken.getPrice());
		System.out.printf("======製作完成:%s=====%n", crispySaltedChicken.getName());
		System.out.println("-----------------------------------------------");
		System.out.println("");
		// 製作餐點-甜不辣
		System.out.printf("======開始製作:%s ======%n", tempura.getName());
		tempura.prepare();
		tempura.cook();
		tempura.serve();
		System.out.printf("======售價:NT %d=====%n", tempura.getPrice());
		System.out.printf("======製作完成:%s=====%n", tempura.getName());
		System.out.println("-----------------------------------------------");
		System.out.println("");
		
		// 製作餐點-百頁豆腐
		System.out.printf("======開始製作:%s ======%n", tofu.getName());
		tofu.prepare();
		tofu.cook();
		tofu.serve();
		System.out.printf("======售價:NT %d=====%n", tofu.getPrice());
		System.out.printf("======製作完成:%s=====%n", tofu.getName());
		System.out.println("");
		
		//設計反思 發現重複的地方太多的
	}

}
