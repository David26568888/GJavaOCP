package day19;
//i18n ==internationalization (國際化) 的縮寫
//m17n ==Multilingualization（中文翻译为"多语言化"）
public class ExceptionDemo5 {
	public static void main(String[] args) {
		
	try {
		div(10, null);
	} catch (Exception e) {
		System.out.println(e.getLocalizedMessage());//L10n
		System.out.println(e.getMessage()); //i18n
	}
		

	
	System.out.println("看到我表示程式正常結束");	
	}
	
	private static void div(Integer x,Integer y) throws Exception{
		//throws的s 可能會拋出多種類的意外  在方法有throws 會強迫方法必須做 try catch || throws
		
		//先判斷Y是否有值?
			if(y==null) {
				NullPointerException ne  = new NullPointerException("分母為空值");
				throw ne;//throws 跟 throw 不同
			}
			Integer result=  x / y;
			System.out.println(result);
	}
}
