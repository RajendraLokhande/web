package com.springboot.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.Address;
import com.springboot.entity.Employee;
import com.springboot.repository.AddressRepository;
import com.springboot.repository.EmpRepository;

//import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	
	private EmpRepository  empRepo;
	
	private AddressRepository addrRepo;
	
	
	public EmployeeService(EmpRepository empRepo, AddressRepository addrRepo ) {
		super();
		this.empRepo=empRepo;
	    this.addrRepo=addrRepo;
	  }
	
	@Transactional(rollbackFor = Exception.class)
	public void saveData() {
	
    Employee emp= new Employee();
    emp.setEmpId(201);
    emp.setEmpName("Ketan");
    emp.setEmpSal(25000.00);
    empRepo.save(emp);
	
	Address addr=new Address();
	addr.setAddrId(501);
	addr.setEmpId(201);
	addr.setState("MH");
	addr.setCountry("INDIA");
	addrRepo.save(addr);	
	
	
	
}
}