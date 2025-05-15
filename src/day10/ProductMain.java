package day10;

import java.util.stream.Stream;

public class ProductMain {
	public static void main(String[] args) {
		Toner toner = new Toner("玫瑰保濕化妝水", 850);
		Lotion lotion =new Lotion("玻尿酸乳液", 1250);
		Serum serum = new Serum("維他命C精華液", 1680);
		FaceWash faceWash = new FaceWash("男性控油洗面乳", 120);
		Aftershave aftershave = new Aftershave("清爽鬍鬚水", 250);
		HairGel hairGel = new HairGel("自然造型髮雕", 199);
				
		
		//專屬方法示範
		toner.refreshSkin();
		lotion.moisturize();
		serum.repairSkin();
		faceWash.deepClean();
		aftershave.sootheskin();
		hairGel.stylehair();
		
		//價格
		/*
		System.out.printf("%s $%,d%n",toner.name,toner.price);
		System.out.printf("%s $%,d%n",lotion.name,lotion.price);
		System.out.printf("%s $%,d%n",serum.name,serum.price);
		*/
		
		Product[] products = {toner,lotion,serum,faceWash,aftershave,hairGel};
		Stream.of(products)
			.forEach(p->System.out.printf("%s $%,d%n",p.getName(),p.getPrice()));
		
		
		//計算
		int sum= Stream.of(products)
			.mapToInt(p-> p.getPrice())//提煉出每個物件的 int
			.sum();
		System.out.printf("全部商品總共%d%n",sum);
		System.out.println("----------------------");
		int max= Stream.of(products)
				.mapToInt(Product::getPrice)//提取物件內的Int
				.max().getAsInt();//求最貴的
		int min= Stream.of(products)
				.mapToInt(Product::getPrice)
				.min().getAsInt();//求最最便宜的
		System.out.printf("商品最貴%d 最便宜%d",max,min);
	}

}
