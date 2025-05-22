package day19;

/*
 
Throwable →Error(不可復原的錯誤)+(非受檢意外)
	  →Exception(例外)→RuntimeException(非受檢意外)
			   →SQL Exception(需受檢意外為非以上兩者，其他都是)
			   →IO Exception 
 */

public class ExceptionDemo2 {
	public static void main(String[] args) {
		div(10, 2);
		div(10, null);//ArithmeticException: 數學錯誤 ; NullPointerException空值錯誤
		div(10, 5);
		
		
		System.out.println("看到我表示程式正常結束!!");
	}
	
	private static void div(Integer x,Integer y) {//除法
		try {
			Integer result=  x / y;
			System.out.println(result);
		} catch (NullPointerException e) {
			System.out.println("發生空值錯誤:");
			System.out.println("錯誤訊息:"+e.getMessage());
			System.out.println("錯誤物件:"+e);
			System.out.println("完整錯誤訊息(如下):");
			e.printStackTrace(System.out);
		}catch (ArithmeticException e) {
			System.out.println("發生數學錯誤:");
			System.out.println("分母不可=0");
			System.out.println("錯誤物件:"+e);
			System.out.println("完整錯誤訊息(如下):");
			e.printStackTrace(System.out);
		}
		
	
	}
}
