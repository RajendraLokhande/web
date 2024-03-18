package in.ashokit.rest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourceRestController {
	
	@GetMapping("/cource")
	public ResponseEntity<String> getCourceFee(@RequestParam ("cname") String cname,@RequestParam ("tname")String tname ) {
		
		String respBody = cname +  "By" +  tname +  "Fee is 7000 INR";
		
		return new ResponseEntity<> (respBody, HttpStatus.OK);
		
	}

}
