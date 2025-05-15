package day15;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		//List 元素資料可以重複並且有順序性
		List<Integer> scores = new ArrayList<>();
		scores.add(95);
		//scores.add(2,100);  指定位置不能在為創立之前
		scores.add(100);
		scores.add(100);
		scores.add(100);
		scores.add(4,80);
		System.out.println(scores);
		
		//取的元素
		System.out.println(scores.get(0));//首筆
		System.out.println(scores.get(scores.size()-1));//末筆
		System.out.println("------------");
		
		//走訪元素1
		for(int i=0, lens=scores.size(); i<lens;i++) {
			System.out.println(scores.get(i));
		}
		System.out.println("-----------");
		//走訪元素2
		for(Integer score:scores) {
			System.out.println(score);
		}
		//scores.stream().forEach(System.out::println);
		scores.forEach(score->System.out.println(score));
		scores.stream().filter(score-> score==100).forEach(System.out::println);//有要對陣列做過濾 mapToInt Filter 
			
		
	}

}
