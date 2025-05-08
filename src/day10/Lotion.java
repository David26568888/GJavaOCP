package day10;
//💧
public class Lotion extends  SkincareProduct {
 
	public Lotion(String name, int price) {
		super(name, price);
	}
	 
	public void moisturize() {
		System.out.printf("💧%s鎖住水分保持濕潤~%n",name);
	}
	 
}
 
