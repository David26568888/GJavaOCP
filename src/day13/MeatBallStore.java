package day13;

public class MeatBallStore {
	public static void main(String[] args) {
		MeatBall meatBall1 = new MeatBall("豬肉", true , 55);
		MeatBall meatBall2 = new MeatBall("豬肉", true , 55);
		System.out.println(meatBall1);//會自動呼叫 toString()方法
		System.out.println(meatBall1);//會自動呼叫 toString()方法
		
		System.out.println(meatBall1==meatBall2);
		System.out.println(meatBall1.equals(meatBall2));//在沒有改寫override之前 API內 equals 其實還是"=="
		System.out.println(meatBall1.hashCode());//2361780 軟體位置
		System.out.println(meatBall2.hashCode());//2361780  當物件完全相同 索引位置就會相同 加速搜尋
		//但hashCode 相同 物件不一定完全一樣
		
	}

}
