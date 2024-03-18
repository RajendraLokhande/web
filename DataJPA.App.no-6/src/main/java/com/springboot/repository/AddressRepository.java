package com.springboot.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Address;
import com.springboot.entity.Employee;

public interface AddressRepository extends JpaRepository<Employee, Serializable>{

	void save(Address addr);

}
