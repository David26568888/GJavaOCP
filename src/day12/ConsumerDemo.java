package day12;

/*Lambda 最重要要先學會@FunctionalInterface 下
1.Consumer(接受引數 然後處理後不傳回值)
interface Consumer<T>*T是泛型,利用泛型 支援全類別 Ex Long Integer Double......*{
	void accept(T t);
	}
2.Function(接受一個引數 以該引數計算後回傳任意結果)
interface Function<T,R>{
	R apply(T t);
	}

3.Predicate
4.Supplier
*/

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<Integer> c1 = (t)->System.out.println(t+t);
		c1.accept(30);
		//c1.accept("30");  字串報錯
		
		Consumer<String> c2 = (t)->System.out.println(t+t);
		c2.accept("30");
		c2.accept("A");
		
		
		//以下為 Lambda簡化的過程
		Stream.of("john","mary","jack","rose")
			.forEach(c2);
		
		Stream.of("john","mary","jack","rose")
		.forEach(t-> System.out.println(t));
		
		Stream.of("john","mary","jack","rose")
		.forEach(System.out::println);
	}

}
