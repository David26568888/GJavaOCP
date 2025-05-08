package day10;
/*
類別設計
介面 Interface
抽象 abstract class  (implements)
具體 class (extends)

設計不會在抽象類 建立物件 而是在子類建立物件
 */

public interface Product {
 
	public abstract String getName();
	public abstract int getPrice();
}
 
