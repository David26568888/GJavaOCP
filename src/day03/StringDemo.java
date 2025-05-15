package day03;

import java.util.StringTokenizer;

public class StringDemo {
public static void main(String[] args) {
	String s1 = "Java";
	s1 = s1.concat("8");
	System.out.println(s1);
	
	String s2 = "Java";
	//s2 = s2.concat("11");
	s2.concat("11");
	//請與上者比較 會發現新的s2 並沒有指向給s2 所以值並沒有發生改變
	System.out.println(s2);
	
	//字串replace的應用
	String s3 = "Java";
	s3 = s3.replace('J','A');
	//s3.replace('J','A');
	System.out.println(s3);
}
}
