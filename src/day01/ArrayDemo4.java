package day01;

import java.util.stream.IntStream;

import org.w3c.dom.ls.LSOutput;

public class ArrayDemo4 {

	public static void main(String[] args) {
		// 班上有10位同學
		// 如何記錄每一個同學的成績
//		int s1 = 100;
//		int s2 = 90;
		
		int[] scores = {80,70,100,90,40,60,50,30,95,55};
//                       0  1  2   3  4  5  6  7  8  9 <<陣列維度
	//列出一位同學的成績
	//使用for-each/ for-in(只能從前端開始列印)
	//會自動從頭開始訪問每一個元素並自動結束
		
	for(int x:scores) {
		System.out.println(x);
	}
	System.out.println("--------");
	
	//使用Java8
	IntStream.of(scores).forEach(x->System.out.print(x+"."));
	}
	}

