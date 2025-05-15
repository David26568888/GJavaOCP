package day14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {
	public static void main(String[] args) {
//		Set<Integer> set1 = new HashSet<Integer>();//後方<>可省略 
// 		set1.add(100);
//		set1.add("一百");//新建物件時可限制放入物件類行為 Interger 此行會抱錯。
//		
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		Set<Integer> set2 = new LinkedHashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		System.out.println(set1);
		System.out.println(set2);
		
		//交集intersection ，聯集 union , 差集difference
		Set<Integer> intersection = new HashSet<>(set1);//放入要比較的set
		intersection.retainAll(set2);// 3 4 
		System.out.println("交集:"+intersection);
		
		Set<Integer> union = new HashSet<Integer>(set1);
		union.addAll(set2);//[1, 2, 3, 4, 5, 6]  將兩集合放一起 且因為Set特性 踢出重複值
		System.out.println("聯集:"+union);
		
		Set<Integer> difference = new HashSet<>(set1);
		difference.removeAll(set2);//set1與set2比較 相同的踢出
		System.out.println("差集:"+difference);
		
		//union 中是否有包含5
		boolean check =union.contains(5);//尋找union 中是否有5
		System.out.println(check);
		
		
	}
}
