package day17;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.OptionalDouble;
import static java.util.Map.Entry;
import static java.util.Map.Entry.comparingByValue;
import java.util.IntSummaryStatistics;

import static java.lang.System.out;//System.out.println 可以省略System

public class MapDemo1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("國文", 95);
		map.put("數學", 100);
		map.put("社會", 70);
		map.put("自然", 80);
		out.println(map);
		out.println(map.keySet());//所有的Key
		out.println(map.values());//所有的value
		out.println(map.get("國文"));// 時間複雜度 0(1)
		out.println(map.get("英文"));// 時間複雜度 0(1)
		System.out.println("----------------");
		
		//列出所有的元素
		
		for(Map.Entry<String, Integer> entry :map.entrySet()) {
			System.out.printf("科目:%s 分數:%d%n",entry.getKey(),entry.getValue());
			
		}
		
		//找出最高課目 
		Map.Entry<String, Integer> highest =null;
		for(Map.Entry<String, Integer> entry :map.entrySet()) {
			if(highest ==null || entry.getValue()>highest.getValue()) {
				highest = entry;
			}
		}
		System.out.println("科目最高科目:"+highest.getKey());
		//利用import static java.util.Map.Entry;  可以使Map.Entry
		Entry<String, Integer> highest2 =null;
		for(Entry<String, Integer> entry :map.entrySet()) {
			if(highest2 ==null || entry.getValue()>highest2.getValue()) {
				highest2 = entry;
			}
		}
		System.out.println("科目最高科目:"+highest.getKey());
		
		//找出最高分的科目 : 現代Stream API
				map.entrySet()
				.stream()
				.max(comparingByValue())//根據value 來找最大值的元素(entry)
				.ifPresent(entry-> System.out.println(entry.getKey()));//若有找到則印出Key5值
		
		//算出平均
//				double avg = 
//						map.values()
//						.stream()
//						.mapToInt(score-> score.intValue())
//						.average()
//						.getAsDouble();
//				out.println(avg);
				
		//以上改寫為 OptionalDouble
				OptionalDouble optAvg = 
				map.values()
				.stream()
				.mapToInt(score-> score.intValue())
				.average();
				
				if(optAvg.isPresent()) {
					System.out.println("平均"+ optAvg.getAsDouble());
				}else {
					System.out.println("無法計算平均");
				}
		
		//算出總分
			int sum = 
					map.values()
					.stream()
					.mapToInt(score-> score.intValue())
					.sum();
			System.out.println("總分:"+sum);
			
		//利用統計物件
			IntSummaryStatistics stat =map.values().stream().mapToInt(Integer::intValue).summaryStatistics();
			System.out.println("平均:" + stat.getAverage());
			System.out.println("總分:" + stat.getSum());
			System.out.println("最大:" + stat.getMax());
			System.out.println("最小:" + stat.getMin());
			System.out.println("個數:" + stat.getCount());
				
	}
}
