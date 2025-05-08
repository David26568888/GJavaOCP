package day07;

public class Father {
	int cash = 1000000;//現金 只有跟Father 同個package 才能呼叫
	protected int stock  = 10000000; 
	//股票 protected 即使不是同個package 也可以調用
	//public 則是有沒有繼承都可以用
	//private 則是即使有繼承也不能調用
	//以下為屬性方法代表的符號
	//+ public 
	//#	protected
	//~ 無(package)/ 預設
	//-	private
	void play() {
		System.out.println("Golf");
	}
}
