package day01;

import java.util.stream.IntStream;

import org.w3c.dom.ls.LSOutput;

public class ArrayDemo6 {

	public static void main(String[] args) {
		// 班上有10位同學
		// 如何記錄每一個同學的成績
//		int s1 = 100;
//		int s2 = 90;
		
		int[] scores = {80,70,100,90,40,60,50,30,95,55};
//                       0  1  2   3  4  5  6  7  8  9 <<陣列維度
	//求最大值(最高分) 替換法
	
	int max = scores[0];
	int min = scores[0];
	
	for (int i=1;i<scores.length;i++) {
		if(scores[i]>max) {
			max=scores[i];
			}
		
		if(scores[i]<min) {
			min=scores[i];
		}
	
	}
	System.out.println("最高分"+max);
	System.out.println("最低分"+min);
	}}
	


	


