package day03;

public class StringDemo2 {
public static void main(String[] args) {
	//StringBuffer vs StringBuilder(Java 5.0)
	//多執行續下(慢)		多執行續下(快)
	StringBuilder sb = new StringBuilder("Java");
	//sb = sb.append("17").append("!");
	sb.append("17").append("!");
	System.out.println(sb);
	//System.out.println(sb.toString());
}
}
