package day09.case2;

//小吃抽象類"abstract class"
//用來實現name 與price (或以後要新增其他屬性 例如 大份小份  加不加辣) 
//接著讓 鹹酥雞+百頁豆腐+甜不辣 繼承這個抽象類 漸少重複編碼
//也可以在抽象類 添加方法 

public abstract class AbstractSnack implements Snack {
	protected String name;
	protected int price;
	private final int fixedPrice;//固定價格，用來計算price 與 size 的種子
	//利用固定值 讓price不會因為客人 改幾份 倒置price初始值異常
	//protected boolean isLarge= false;//true 大份: false:小份(預設)
	private final String[] sizeName = {" ","小","中","大","特大","全家福"};
	//					                0	 1	 2	 3	  4	    5	
	//放在全域宣告 sizeName陣列  可以減少記憶體使用
	protected int size =1;//1.小份 2.中份 3.大份 4.特大份 5.全家福
	public AbstractSnack(String name, int price) {
		this.name = name;
		this.price = price;
		fixedPrice=price;
	}
	
	public void setSize(int size) {
		//變更 Size
		this.size=size;
		//會影響價格
		this.price=fixedPrice*this.size;
	}
	
	public int getSize() {
		return size;
	}
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	//
	@Override
	public void serve() {
		System.out.printf("將 %s 撒上胡椒粉後再裝入紙袋%n", name);
	}
	// 加入一個make  製作流程與包裝
	public void makeSnack() {
							
		
		System.out.printf("======開始製作:%s(%s份) ======%n",name,sizeName[size]);
		prepare();
		cook();
		serve();
		System.out.printf("======售價:NT %d=====%n", price);
		System.out.printf("======製作完成:%s=====%n", name);
		System.out.println("-----------------------------------------------");
		System.out.println("");
	}
}
