package day06;



public class WrapperTest {
	//外包類型
	public static void main(String[] args) {
		int a = 10;
		Integer b = Integer.valueOf(10);
		System.out.println(a);
		System.out.println(b);//與下列相比省略.intValue 其實JAVA會自己補
		System.out.println(b.intValue());//印出外包類型比較正確的寫法
	
		//求int最大值
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		
		int scoreA = 70;
		int scoreB = 90;
		int highScore = Integer.max(scoreA, scoreB);
		System.out.println(highScore);
		//-------------------------------------
		//Integer or int 建立數字變數類型? 用哪一個好
		//int比較快 Integer 可以判斷null
		
		//auto-boxing 	自動裝箱
		//auto-unboxing 自動拆箱
		//Java 5.0以前
		Integer x1 = Integer.valueOf(10);
		//Java 5.0(含)以後
		Integer x2 = 10;//auto-boxing 會自動將轉成物件Integer.valueOf(10);
		
		//auto-unboxing 自動拆箱
		//Java 5.0 以前
		System.out.println(x1.intValue());
		
		//Java 5.0(含) 以後
		System.out.println(x2);//auto-unboxing 會自動將x2物件內容透過x2.valueOf() 轉出
	}

	
}
