package com.springboot.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Address;
import com.springboot.entity.Employee;

public interface EmpRepository extends JpaRepository<Address, Serializable> {

	void save(Employee emp);

}
