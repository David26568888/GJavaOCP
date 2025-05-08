package day02;

public class CoffeeShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee latte= new Coffee();//建立一個咖啡實體
		latte.name="拿鐵";
		latte.size='大';
		latte.price=65;
		latte.hot=true;
		latte.printInfo();
		
		Coffee macchiato= new Coffee();//建立一個咖啡實體
		macchiato.name="焦糖瑪堤朵";
		macchiato.size='大';
		macchiato.price=80;
		macchiato.hot=false;
		macchiato.printInfo();
		
		Coffee americano = new Coffee();
		americano.name= "美式";
		americano.size= '大';
		americano.price= 50;
		americano.hot = true;
		americano.printInfo();
		
	}

}
