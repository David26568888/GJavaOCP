package day13;
// 請比較Week 1 2 3差異
public class WeekDemo {
	
	public static void main(String[] args) {
		monkeyDay(Week.星期日);
		monkeyDay(1);
		monkeyDay(Week.星期四);
		monkeyDay(5);
		monkeyDay(0); // ?? 誤用
		monkeyDay(-1); // ?? 誤用
		monkeyDay(8); // ?? 誤用
		//---------------------------------------
		monkeyDay2(Week2.星期日);
		monkeyDay2(Week2.星期二);
		
		//--------------------------------------------
		monkeyDay3(Week3.星期日);
		monkeyDay3(Week3.星期一);
		
	}
	//省略Switch
	public static void monkeyDay3(Week3 w) {
		System.out.println(w.getAction());
	}
	
	
	//解決誤用參數的問題  以前用switch 會有誤按數字的問題 enum列舉  可以強制只能用列舉的內容
	public static void monkeyDay2(Week2 w) {
		switch (w) {
			case 星期日:
				System.out.println("猴子去教堂");
				break;
			case 星期一:
				System.out.println("猴子穿新衣");
				break;
			case 星期二:
				System.out.println("猴子肚子餓");
				break;
			case 星期三:
				System.out.println("猴子去爬山");
				break;
			case 星期四:
				System.out.println("猴子去考試");
				break;
			case 星期五:
				System.out.println("猴子去跳舞");
				break;
			case 星期六:
				System.out.println("猴子去斗六");
				break;
		}
	}
	
	public static void monkeyDay(int w) {
		switch (w) {
			case Week.星期日:
				System.out.println("猴子去教堂");
				break;
			case Week.星期一:
				System.out.println("猴子穿新衣");
				break;
			case Week.星期二:
				System.out.println("猴子肚子餓");
				break;
			case Week.星期三:
				System.out.println("猴子去爬山");
				break;
			case Week.星期四:
				System.out.println("猴子去考試");
				break;
			case Week.星期五:
				System.out.println("猴子去跳舞");
				break;
			case Week.星期六:
				System.out.println("猴子去斗六");
				break;
			
		}
	}
}