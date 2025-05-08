package day09.case2;

public class SaltedChicken extends AbstractSnack {

	public SaltedChicken(String name, int price) {
		super(name, price);
	}

	@Override
	public void prepare() {
		System.out.println("準備雞腿肉,蒜頭,洋蔥,九層塔");
	}

	@Override
	public void cook() {
		System.out.println("雞腿肉炸酥後再加入蒜頭,洋蔥,九層塔翻炒");
	}


	


}
