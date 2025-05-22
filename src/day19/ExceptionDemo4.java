package day19;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		
	try {
		div(10, null);
	} catch (NullPointerException ne) {
		System.out.println(ne.getMessage());
	}
	
	
	System.out.println("看到我表示程式正常結束");	
	}
	
	private static void div(Integer x,Integer y) {//除法
		
		//先判斷Y是否有值?
			if(y==null) {//告知呼叫者，請呼叫者處理錯誤 但呼叫者沒有 try catch 就會由java 虛擬機接
				NullPointerException ne  = new NullPointerException("分母為空值");
				throw ne;
			}
			Integer result=  x / y;
			System.out.println(result);
	}
}
