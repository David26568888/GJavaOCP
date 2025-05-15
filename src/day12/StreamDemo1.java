package day12;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class StreamDemo1 {
	public static void main(String[] args) {
		int[] scores = {45,55,46,48,56,19,9,50,10};
		//第1種 找出一筆及格的分數(沒有設定 若沒有及格分數的意外 會報錯 )
//		
//		int passScore = Arrays.stream(scores)
//			.parallel()//並行流
//			.filter(score-> score>=60)
//			.findAny()
//			.getAsInt();//這是方法非串流
//		
//		System.out.println(passScore);
//		
//		
		//第2種 找出一筆及格的分數
		OptionalInt optInt = Arrays.stream(scores)
				.filter(score-> score>=60)
				.findAny();
		if(optInt.isPresent()) {
			System.out.println(optInt.getAsInt());
		}else {
			System.out.println("查無資料");
		}
	}
}
