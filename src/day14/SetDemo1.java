package day14;

import java.util.HashSet;
import java.util.Set;


public class SetDemo1 {
	public static void main(String[] args) {
		//→HashSet(無序)放入順序比較快
		//→LinkedHashSet(有序)放入順序中
		//→TreeSet(排序)放入順序慢
		Set scores1= new HashSet();
		scores1.add(90);//數值不是Int 而是Integer，放入後會自動轉型成Object
		scores1.add(70);
		scores1.add(80);
		scores1.add(100);
		scores1.add(100);
		System.out.println(scores1);
		//輸出會發現 數值重複的不會出現
		//Set的特性-數值重複的不會出現
		//利用foreach 逐一尋訪元素
		for(Object data: scores1) {
			System.out.println(data);
		}
		
		//利用stream 的foreach逐一尋訪元素
		//scores1.stream().forEach(data->System.out.print(data));
		scores1.stream().forEach(System.out::println);
		//為以上縮寫
		
		
		
//		Set scores2= new TreeSet();
//		scores2.add(90);//數值不是Int 而是Integer
//		scores2.add(70);
//		scores2.add(80);
//		scores2.add(100);
//		scores2.add(100);
//		System.out.println(scores2);
	}
}
