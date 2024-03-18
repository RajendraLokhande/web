package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Entity.BookedSeats;

public interface BookedSeatsRepository extends JpaRepository<BookedSeats, Integer>{

}
