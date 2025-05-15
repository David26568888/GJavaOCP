package day13;

public enum SoupType {
	原味("傳統柴魚高湯，鮮甜清爽"),
	辣味("加入辣油辣椒,微辣開胃");
	
	private String description;
	
	//enum的建構子 一率是private 權限
	private SoupType(String descriptionString) {
		this.description= descriptionString;
	}
	public String getDesctiption() {
		return description;
	}
}
