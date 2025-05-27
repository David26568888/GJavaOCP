package day20;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

// lombok=get+set+equalHashcode+toString
//Gson=https://mvnrepository.com/artifact/com.google.code.gson/gson
//lombok下載點 https://projectlombok.org/ 
//Gson lombok下載點 =https://mvnrepository.com/artifact/org.projectlombok/lombok/1.18.38
//以上為google 已寫好的外掛
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
//@AllArgsConstructor
//@NoArgsConstructor


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Snack {
	private String name;//小吃
	private String description;//名稱
	private Integer price;//價格
	private String location;//地址
	private String type;  //類型
	private Double latitude;//緯度
	private Double longitude;//經度
//----------------------------
	private Double distance;

}
