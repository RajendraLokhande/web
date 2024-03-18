package com.springboot.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Dto.PaymentDto;
import com.springboot.Entity.Payment;
import com.springboot.Repository.PaymentRepository;
import com.springboot.Service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	@Override
	public PaymentDto addPayment(PaymentDto Dto) {
		
		Payment payment=modelMapper.map(Dto, Payment.class);
		Payment save=paymentRepository.save(payment);
		return this.modelMapper.map(save, PaymentDto.class);
		
	}
	@Override
	public PaymentDto getPayment(Integer Id) {
		
	Payment payment= paymentRepository.findById(Id).orElse(null);
	return this.modelMapper.map(payment, PaymentDto.class);
	}
	@Override
	public List<PaymentDto>getAllPayment(){
		
	List<Payment>List=paymentRepository.findAll();
	List<PaymentDto> List2 = List.stream().map((list1)-> modelMapper.map(list1, PaymentDto.class)).collect(Collectors.toList());
    
	return List2;	
		
	}
	
	
	@Override
	public PaymentDto updatePayment(PaymentDto Dto, Integer Id) {
	return null;	
	}
	
	
	
	@Override
	public PaymentDto deletePayment(Integer Id) {
	return null;

}
}