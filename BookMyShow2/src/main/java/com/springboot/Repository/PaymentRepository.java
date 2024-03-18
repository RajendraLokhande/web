package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
