package day05;

//接送
public class Transport {
	private String locatrion;
	private int price;
	
	public Transport(String locatrion, int price) {
		this.locatrion = locatrion;
		this.price = price;
	}

	public String getLocatrion() {
		return locatrion;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Transport [locatrion=" + locatrion + ", price=" + price + "]";
	}
	
	
	
}
