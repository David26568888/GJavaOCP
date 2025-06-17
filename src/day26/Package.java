package day26;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Package {
	private String id;
	private String address;
	private Boolean delivered;//派送壯態
}
