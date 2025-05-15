package day01;

import org.w3c.dom.ls.LSOutput;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// 班上有10位同學
		// 如何記錄每一個同學的成績
//		int s1 = 100;
//		int s2 = 90;
		
		int[] scores = {80,70,100,90,40,60,50,30,95,55};
//                       0  1  2   3  4  5  6  7  8  9 <<陣列維度
	//列出一位同學的成績
		for (int i= 0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		System.out.println("-----------");
	
//請反過來印
	for(int i =scores.length-1;i>0;i--) {
		System.out.println(scores[i]);	
	}
	}
	}

