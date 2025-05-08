package day12;
/*2.Function(接受一個引數 以該引數計算後回傳任意結果)
interface Function<T,R>{
	R apply(T t);
	}
	*/

import java.util.function.BiFunction;//帶入兩個引數 傳回一個值  可用Ctrl 按入查看
import java.util.function.BinaryOperator;// 針對三個傳入一樣的類型引數 省略
import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionDemo {
	public static void main(String[] args) {
		//計算名字的字數
		Function<String, Integer> func1 = (name) -> name.length();
		func1.apply("John");
		System.out.println(func1.apply("John"));
		
		IntFunction<Double> func2 =(x) -> Math.pow(x,2);
		func2.apply(5);
		System.out.println(func2.apply(5));
		
		//計算BMI
		BiFunction<Double, Double, Double> func3 = (h,w)-> w/Math.pow(h/100, 2);
		System.out.println("BMI:"+func3.apply(170.0, 60.0));
		
		//針對上述 用BinaryOperator 針對三個傳入一樣的類型引數 省略
		BinaryOperator<Double> func4 = (h, w) -> w / Math.pow(h/100, 2);
		System.out.println("BMI:"+func4.apply(190.0, 60.0));

	}

}
