package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Passanger;
import in.ashokit.binding.Ticket;

@RestController
public class TicketController {
	
	@GetMapping(value= "/bookTicket", produces = {"application/json"} ,
	consumes = {"application/json"})
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger request){
		
		System.out.println(request);
		
		Ticket t = new Ticket();
		t.setTicketId(12345);
		t.setPnr("JHLK8864");
		t.setTicketStatus("CONFIRMED");
	
		return new ResponseEntity<Ticket>(t, HttpStatus.CREATED);
	
	}
	@PutMapping("/ticket")
	public ResponseEntity<String> updateTicket(@RequestBody Passanger request){
		
		System.out.println(request);
		
		//logic to update ticket
		
		return new ResponseEntity<String> ("Ticket Update", HttpStatus.OK );
		
	}
	
	@DeleteMapping("/ticket/{ticketId}")
	public ResponseEntity<String> deleteTicket(@PathVariable ("ticketId")Integer ticketId){
		
	//	logic to delete the tickrt
	
	  return new ResponseEntity<>("Ticket Delete", HttpStatus.OK);
		
	}

}
