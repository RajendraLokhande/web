package in.ashokit.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
	
	
	private Integer ticketId;
	private String pnr;
	private String ticketStatus;
	
	
	

}
