package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Entity.Card;

public interface CardRepository extends JpaRepository <Card, Integer> {

}
