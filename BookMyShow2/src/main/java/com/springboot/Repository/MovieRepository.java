package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Entity.Movie;

public interface MovieRepository extends JpaRepository <Movie, Integer>{

}
