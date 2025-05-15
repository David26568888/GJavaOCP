package day12;

public class LambdaDemo1 {
	/*Lambda 最重要要先學會@FunctionalInterface 下
	1.Consumer
	interface Consumer<T>*T是泛型,利用泛型 支援全類別 Ex Long Integer Double......*{
		void accept(T t);
		}
	2.Function
	3.Predicate
	4.Supplier
	*/
	//計算器
	@FunctionalInterface //interface 只能有一個抽象辦法
	interface Calc{
		int getResult(int x,int y);
		//void ff();
	}
	
	public static void main(String[] args) {
		
		//利用上面的匿名內部類來實現介面
		Calc calc = new Calc() {
			@Override
			public int getResult (int x ,int y) {
				return x+y;
			}
		};
		System.out.println(calc.getResult(80, 90));
		//Lambda 簡化語法 1.
		System.out.println("----------------");
		System.out.println("以下為Lambda 簡化語法  簡化方法名字(因為只有一個方法)");
		Calc calc2 = (int x,int y)->{
			return x-y;
			};
			System.out.println(calc2.getResult(70, 60));
		System.out.println("-----------------");
		
		//Lambda 簡化語法 2.  省略int 
		Calc calc3 = (x,y) -> x*y;
		System.out.println(calc3.getResult(60, 50));
		
		
		System.out.println("-----------------");
		////Lambda 簡化語法 3.  
		print(50, 40, calc3);
		
		//Lambda 簡化語法 4.  
//		Calc calc4 = (x,y)->x/y;
//		print(40, 20, calc4);
		
		//Lambda 簡化語法 5.  再不建立物件的前提下  直接將函式寫入方法   註解上面4.可發現
		print(80, 20 ,(x ,y)->x/y);
		
	}
	
	public static void print(int x,int y,Calc calc) {
		System.out.println(calc.getResult(x, y));
	}
}
