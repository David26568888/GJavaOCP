package day07;
//狗狗是一種動物
public class Dog extends Animal{
	//此建構子 隱藏了super()
	//如果父類建構子 是有參的 就必須打入super(參數) 才能呼叫
	public Dog(){
		super(4);
		System.out.println("執行 Dog 建構子");
	}
}
