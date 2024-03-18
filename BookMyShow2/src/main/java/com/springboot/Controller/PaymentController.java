package com.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Dto.PaymentDto;
import com.springboot.Service.PaymentService;

@RestController
@RequestMapping("/api")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	

	@PostMapping("/addPayment")
	public ResponseEntity<PaymentDto> savePayment(@RequestBody PaymentDto Dto){
		
	PaymentDto addPayment = paymentService.addPayment(Dto);
	return new ResponseEntity<PaymentDto>(addPayment, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/payment/{id}")
	public ResponseEntity<PaymentDto> savePayment(@PathVariable Integer id){
			
	PaymentDto payment = paymentService.getPayment(id);
	return new ResponseEntity<PaymentDto>(payment, HttpStatus.OK);
	}
	
	@GetMapping("/payments")
	public ResponseEntity<List<PaymentDto>> getAllPayment(){
		
	List <PaymentDto>	payment=paymentService.getAllPayment();
	return new ResponseEntity<List<PaymentDto>>(payment, HttpStatus.OK);		
	
   }
		
}
