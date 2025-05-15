package day01;

import java.util.Arrays;
import java.util.stream.IntStream;

import org.w3c.dom.ls.LSOutput;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// 班上有10位同學
		// 如何記錄每一個同學的成績
//		int s1 = 100;
//		int s2 = 90;
		
		int[] scores = {80,70,100,90,40,60,50,30,95,55};
//                       0  1  2   3  4  5  6  7  8  9 <<陣列維度
	//請計算總分與平均分
		int sum = 0;
		
		for(int x: scores) {
			System.out.println(x);
			sum=sum+x;
			
		}
		System.out.println("-------");
		System.out.println("總分"+sum);
		int avg= sum/scores.length;
		System.out.println("平均分"+avg);
	}
	}
		
	

