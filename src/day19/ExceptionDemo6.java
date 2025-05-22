package day19;
//i18n ==internationalization (國際化) 的縮寫
//m17n ==Multilingualization（中文翻译为"多语言化"）

//EmptyValueException,ZeroValueException2兩者可以 再建立一個父類 讓以上兩個意外繼承 可以達到  以下catch 不用寫兩次
public class ExceptionDemo6 {
	public static void main(String[] args) {
		
	try {
		div(10, 0);
	} catch (EmptyValueException e) {
		System.out.println(e.getLocalizedMessage());//L10n
		System.out.println(e.getMessage()); //i18n
		e.how2Do();//呼叫自定義方法
	} catch (ZeroValueException2 e) {
		System.out.println(e.getLocalizedMessage());//L10n
		System.out.println(e.getMessage()); //i18n
		e.how2Do();//呼叫自定義方法
	}
	
	System.out.println("看到我表示程式正常結束");	
	}
	
	private static void div(Integer x,Integer y) throws EmptyValueException,ZeroValueException2{//EmptyValueException 為自定義錯誤
		//先判斷Y是否有值?
			if(y==null) {
				EmptyValueException ne  = new EmptyValueException("分母為空值");
				throw ne;//throws 跟 throw 不同
			}
			if(y==0) {
				ZeroValueException2 ne  = new ZeroValueException2("分母 = 0");
				throw ne;//throws 跟 throw 不同
			}
			Integer result=  x / y;
			System.out.println(result);
	}
}
