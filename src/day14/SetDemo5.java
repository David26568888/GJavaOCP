package day14;

import java.util.LinkedHashSet;
import java.util.Set;

import org.w3c.dom.ls.LSOutput;

public class SetDemo5 {
	public static void main(String[] args) {
		Set<Gift> gifts = new LinkedHashSet<Gift>();
		gifts.add(new Gift("康乃馨","心意",1200,"媽媽你是我的避風港"));
		gifts.add(new Gift("按摩椅","健康",26800,"媽媽的健康無價"));
		gifts.add(new Gift("資生堂抗老精華","美妝",3200,"媽媽永遠年輕美麗"));
		gifts.add(new Gift("烤箱","實用",2500,"讓媽媽烤餅乾給我吃讓媽媽開心"));
		gifts.add(new Gift("手寫卡片","DIY",null,"媽媽我愛你，謝謝你的付出"));
		gifts.add(new Gift("紅包","現金",600,"媽媽請省點花 心意比較重要"));
		
		
		System.out.println(gifts);
		
		//請問此次母親節花多少錢
		int  total1= 0;
		for( Gift gift: gifts) {
			if(gift.getPrice()!=null) {
				total1+= gift.getPrice();
			}
		}
		System.out.println(total1);
		
		int totoal2 = gifts.stream()
				.filter(gift->gift.getPrice()!=null)
				//.mapToInt(gift-> gift.getPrice()).sum(); 原型
				.mapToInt(Gift::getPrice).sum();//縮寫
		System.out.println(totoal2);
	}
}
