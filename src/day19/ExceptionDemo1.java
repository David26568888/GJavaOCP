package day19;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		
		//將排錯try catch 寫在main
		try {
			div(10, null);
		} catch (NullPointerException e) {
			System.out.println("請輸入數字");
		} catch (ArithmeticException e) {
			System.out.println("請輸入不為 0 的數字");
		}
		
		try {
			div(10, 0);
		} catch (NullPointerException e) {
			System.out.println("Please input a number");
		} catch (ArithmeticException e) {
			System.out.println("Please input a number not equals 0");
		}
		
		System.out.println("看到我表示程式正常結束");
	}
	
	private static void div(Integer x,Integer y) {//除法
			Integer result=  x / y;
			System.out.println(result);
	}
}
