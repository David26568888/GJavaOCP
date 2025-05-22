package day19;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
	private String name;
	private String description;
	private Integer price;
	private String location;
	private String type;

}
