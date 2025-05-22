package day19;


// EmptyValueException  自已定義一個例外 讓 Exception 更明確
public class EmptyValueException extends Exception {
	
	public EmptyValueException(String message) {
		super(message);//
	}
	
	public void how2Do() {
		System.out.println("請重新定義資料");
		
	}

}
