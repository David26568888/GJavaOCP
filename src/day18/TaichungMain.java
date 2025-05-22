package day18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


//洪文記涼麵皮 https://g.co/kgs/6Xr2qYC

public class TaichungMain {
	public static void main(String[] args) throws Exception {
		String content = ReadFile.read("src/day18/taichung.txt");
		// System.out.println(content);

		// 逐筆資料 區分
		String[] rows = content.split("\r\n");

		// 創建List 存儲所有景點資料
		List<Attraction> attractions = new ArrayList<>();
		for (int i = 1; i < rows.length; i++) {
			System.out.printf("%d=>%s%n", i, rows[i].trim());// trim() 刪除不必要的空白

			// 創立物件 分為 type name foods trans pop cost CP=pop/cost
			Attraction attraction = new Attraction(rows[i]);
			attractions.add(attraction);
		}

		System.out.printf("景點數量:%d%n", attractions.size());
		//
		// 1.請印出所有的景點
		attractions.forEach(System.out::println);
		System.out.println("-----------------CP 最高的景點");
		// 2.請印出CP 最高的景點
		Attraction best = attractions.stream()
				//CP 最高的景點"a1-a2"  
				//.max((a1, a2) -> (int) (a1.getCp() * 1000 - a2.getCp() * 1000))<<<方法一
				//.max((a1,a2)-> Double.compare(a1.getCp(), a2.getCp())<<<方法二
				//.max(Comparator.comparingDouble(a -> a.getCp()))<<<方法三
				.max(Comparator.comparingDouble(Attraction::getCp))//<<<方法四
				.orElse(null);
		System.out.printf("CP值最高的景點:%s%n", best);
		// 3.請印出CP 最低的景點
		System.out.println("-----------------CP 最低的景點");
		Attraction low  = attractions.stream()
				.min((a1,a2)-> (int)(a1.getCp()*1000-a2.getCp()*1000))
				.orElse(null);
		System.out.printf("CP值最低的景點:%s%n", low);
		
		System.out.println("----------------CP最高的前10名");
		//4.請印出CP最高的前10名 景點(先按CP值高低排序，再取前三名)
		attractions.stream()
					.sorted(Comparator.comparingDouble(Attraction::getCp).reversed())//排序後預設是由小到大 要在加reversed()反轉
					.limit(10)//限制取前10個值
					.forEach(System.out::println);
		
		System.out.println("----------------有珍珠奶茶的店有哪些?");
		//5.有珍珠奶茶的店有哪些
		String foodName = "珍珠奶茶";
		attractions.stream()
					.filter(a -> a.getFoods().contains(foodName))
					.forEach(System.out::println);
		
		
		//6.請問有公車可以到達的景點有哪些?
		System.out.println("----------------有公車可以到達的景點有哪些?");
		String trans = "公車";
		attractions.stream()
					.filter(a -> a.gettrans().contains(trans))
					//.forEach(System.out::println);
					//如果只Show 名字
					.forEach(a -> System.out.println(a.getName()));
		
		//7.請印出每一個Type 最高CP值最高的景點
		System.out.println("----------------每一個Type 最高CP值最高的景點?");
		Map<String , Optional<Attraction>> maxCpByType = attractions.stream()
		.collect(Collectors.groupingBy(
							Attraction::getType,//取出String
							Collectors.maxBy(Comparator.comparingDouble(Attraction::getCp))//得到Optional
																			));
		maxCpByType.forEach((type, optAttraction) -> {
			if(optAttraction.isPresent()) {
				Attraction attraction = optAttraction.get();
				System.out.println(type + " => " + attraction);
			}
		});
		//有珍珠奶茶的店中 CP值最高的景點
		
//		String foodName1 = "珍珠奶茶";
//		Map<String, Optional<Attraction>>  maxCpByFood=
//		attractions.stream().collect(Collectors.groupingBy(
//							a1->a1.getFoods().contains(foodName1),
//							Collectors.maxBy(Comparator.comparingDouble(Attraction::getCp)));
//					maxCpByFood.forEach((food, optAttraction) -> {
//						if(optAttraction.isPresent()) {
//							Attraction attraction = optAttraction.get();
//							System.out.println(food + " => " + attraction);
//						}
//					});	
		
		System.out.println("----------------有珍珠奶茶的店中 CP 值最高的景點----------------");
		String foodName1 = "珍珠奶茶";
		Optional<Attraction> maxCpAttractionWithBubbleTea = attractions.stream()
		    .filter(a -> a.getFoods().contains(foodName1))
		    .max(Comparator.comparingDouble(Attraction::getCp));

		if (maxCpAttractionWithBubbleTea.isPresent()) {
		    System.out.printf("有珍珠奶茶的店中 CP 值最高的景點: %s%n", maxCpAttractionWithBubbleTea.get());
		} else {
		    System.out.println("沒有找到有珍珠奶茶的景點。");
		}
		
		System.out.println("----------------有豆花的店中 CP 值最高的景點----------------");
		String foodName2 = "豆花";
		Optional<Attraction> maxCpAttractionWithDouhua = attractions.stream()
				.filter(a->a.getFoods().contains(foodName2))
				.max(Comparator.comparingDouble(Attraction::getCp));
		if (maxCpAttractionWithDouhua.isPresent()) {
			System.out.printf("有豆花的店中 CP 值最高的景點: %s%n",maxCpAttractionWithDouhua.get());	
		}else {
			System.out.println("沒有找到有豆花的景點。");
		}
		
//		System.out.println(attractions.get(0).getFoods().get(0));
//		System.out.println(attractions.get(0).getFoods().get(1));
//		attractions.forEach(System.out::println);	
		
		System.out.println("----------------有步行可以到達的景點有哪些?");
		String trans2 = "步行";
		attractions.stream().filter(a-> a.gettrans().contains(trans2))
		.forEach(a-> System.out.println(a.getName()));

	
		// 每一種食物 CP 值最高的景點
		System.out.println("----------------每一種食物 CP 值最高的景點----------------");
		Map<String, Optional<Attraction>> maxCpAttractionsByFood = new HashMap<>();

		// 遍歷每個景點，將其食物與 CP 值存入 Map
		for (Attraction attraction : attractions) {
		    for (String food : attraction.getFoods()) {
		        maxCpAttractionsByFood.putIfAbsent(food, Optional.of(attraction));
		        maxCpAttractionsByFood.computeIfPresent(food, (k, v) -> 
		            v.map(a -> a.getCp() > attraction.getCp() ? v : Optional.of(attraction))
		              .orElse(Optional.of(attraction))
		        );
		    }
		}

		// 印出結果
		for (Map.Entry<String, Optional<Attraction>> entry : maxCpAttractionsByFood.entrySet()) {
		    String foodName3 = entry.getKey();
		    Optional<Attraction> maxAttraction = entry.getValue();
		    if (maxAttraction.isPresent()) {
		        System.out.printf("食物: %s, CP 值最高的景點: %s%n", foodName3, maxAttraction.get());
		    } else {
		        System.out.printf("食物: %s, 沒有找到相關景點%n", foodName3);
		    }
		}
	
	}
}
