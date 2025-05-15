package day02;

//咖啡設計圖
public class Coffee {
	//咖啡 :   Hot
	String name;//名字
	char size;//尺寸(S,L)
	int price;//價格
	boolean hot;//true:熱/ flase:冷
	
	//建構子
	public Coffee() {
		
	}
	
	//建構子
	public Coffee(String name,char size ,int price ,boolean hot) {
		this.name= name;
		this.size= size;
		this.price=price;
		this.hot= hot;
		
	}
	//列出產品資訊
	void printInfo() {
		System.out.printf("%c%s%s $%d%n",size,(hot?"熱":"冷"),name,price);
	}
	
	
	

}
