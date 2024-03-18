package in.ashokit.binding;

import lombok.Data;

@Data
//@XmlRootElement (error)
public class Book {
	
	
	private Integer Id;
	private String name;
	private Double price;

}
