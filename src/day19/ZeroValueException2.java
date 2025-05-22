package day19;


// EmptyValueException  自已定義一個例外 讓 Exception 更明確
public class ZeroValueException2 extends Exception {
	
	public ZeroValueException2(String message) {
		super(message);//
	}
	
	public void how2Do() {
		System.out.println("請充新定義資料：資料不可為0");
		
	}

}
