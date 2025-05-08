package day02;

public class CoffeeShop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//建立物件同時放入參數
		Coffee c1 = new Coffee("拿鐵",'中',65,true); 
		Coffee c2 = new Coffee("焦糖瑪奇朵",'大',80,false); 
		Coffee c3 = new Coffee("美式",'大',50,true); 
		Coffee c4 = new Coffee("摩卡",'中',60,true); 
		Coffee c5 = new Coffee("義式濃縮",'小',55,true);
		Coffee c6 = new Coffee("巧克力碎片",'大',120,false);
		
		
		Coffee[] coffees = {c1,c2,c3,c4,c5,c6};
		
		for(int i=0; i<coffees.length-1;i++) {
			coffees[i].printInfo();
		}
		System.out.println("============================");
		for(Coffee x:coffees) {
			x.printInfo();
		}
		System.out.println("============================");
		
		//cart 購物車(2杯中熱拿 ,3杯大美式, 4杯大冰巧克力碎片)
		Coffee[] cart = {c1,c1,c3,c3,c3,c6,c6,c6,c6,};
		System.out.printf("買了 %d 杯%n",cart.length);
		int total= 0 ;
		for(int i=0;i<cart.length;i++) {
			total +=cart[i].price;//累計
		}
		System.out.printf("總價: $%, d元%n",total );
	}

}
