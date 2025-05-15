package day04;

//書的設計
public class Book {
	private String name;// 書名
	private int price;// 價格 利用private 保護數值
	private int pages;// 頁數

	// 若沒有寫建構子則 Java 會自動產生,所產生的建構子稱為預設建構子,其建構如下所述:
	public Book() {
		System.out.println("呼叫Book()建構子");
	}

	// 建立有參數建構子
	public Book(String name, int price, int pages) {
		setName(name);
		setPages(pages);
		setPrice(price);
	}

	// 封裝 針對傳入值名字 與參數名相同時可以對照
	public void setPrice(int price) {
		if (price > 0) {// 設定條件大於0
			this.price = price;// this.price 為private price = 傳入值price
		} else {
			System.out.println("價格輸入錯誤");
		}
	}

	public int getPrice() {
		// return this.price;
		return price;// 回傳的是private
	}

	// 封裝書名+封裝頁數 利用封裝避免傳入值異常並設入條件
	public void setName(String name) {
		this.name = name;
	}

	public void setPages(int pages) {
		if (pages > 0) {
			this.pages = pages;
		} else {
			System.out.println("頁數設定錯誤");
		}
	}

	// 取的數值
	public int getPages() {
		return pages;
	}

	public String getName() {
		return name;
	}

	public void printInfo() {
		System.out.printf("書名:%s 價格:%d 頁數:%d", name, price, pages);
	}

}
