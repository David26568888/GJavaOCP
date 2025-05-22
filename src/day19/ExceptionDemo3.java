package day19;



public class ExceptionDemo3 {
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
		//如果再try catch前 用if else 做過濾 ，代表你允許(null & 0)錯誤值可以輸入 ，缺少錯誤機制處理機制，不建議排錯用if else		
		//先判斷Y是否有值?
			if(y==null) {
				System.out.println("分母不可是null");
				return;
			}
			//先判斷Y是否=0?
			if(y==0) {
				System.out.println("分母不可是0");
				return;
			}
			Integer result=  x / y;
			System.out.println(result);
	}
}
