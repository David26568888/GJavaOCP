package day09.case1;

//鹹酥雞
//implements 實作
public class CrispySaltedChicken implements Snack{
	private String name;
	private int price;
	public CrispySaltedChicken(String name,int price) {
		this.name = name;
		this.price = price;
	}
	//封裝
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	//----------------------------------------
	
	//方法實現
	@Override
	public void prepare() {
		System.out.println("準備雞腿肉,蒜頭,洋蔥,九層塔");		
	}
	@Override
	public void cook() {
		System.out.println("雞腿肉炸酥後再加入蒜頭,洋蔥,九層塔翻炒");
	}
	@Override
	public void serve() {
		System.out.printf("將 %s 撒上胡椒粉後再裝入紙袋%n",name);
	}
	
}
