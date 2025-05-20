package day18;

public class Test3 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);//第一個錯誤發生下面部會執行
			
			int[] scores  = new int[2];
			scores[0] = 100;
			scores[1] = 90;
			scores[2]=80;	
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("有例外發生:" + e.getMessage());	
		}
	}
}
