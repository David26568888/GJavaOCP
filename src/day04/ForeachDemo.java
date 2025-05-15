package day04;

import java.util.stream.Stream;

public class ForeachDemo {
	public static void main(String[] args) {
		//For each 利用foreach 的語法將每一個人名印出
		String[] names = {"Bob","Jack","Rose","Vincent","Anita","Howard","Joanna","Jo"};
		for(String name : names) {
			System.out.println(name);
		}
		//利用 Stream.of() 提供的foreach()方法也有異曲同工之妙 Java 8.0提供此語法
		Stream.of(names).forEach(name->{
			System.out.println(name);
			});//陣列轉串流
		Stream.of(names).forEach(name->System.out.println(name));//只有一行才可以不用大括弧
	}
}
