package day16;

import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		//Vector 執行續安全的集合
		Vector<Integer> v = new Vector<Integer>(500, 10);
		//可用Icreatment 限制每次超出增加多少空間
		//可以再依開創力物件 設定capacity 初始值
//		v.add(1);
//		v.add(2);
//		v.add(3);
		for(int i=1 ; i<=501;i++) {
			v.add(1);
		}
		
		
		System.out.println("size:"+v.size());
		System.out.println("capacity:"+v.capacity());
		System.out.println("free:"+(v.capacity()-v.size()));
		//空間會倍數成長 從初始10>20>40>80>160>320>640.........預設倍數成長
		System.out.println("day16");
	}

}
