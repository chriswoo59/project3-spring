package com.cognixia.jump.project3spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.project3spring.model.Burger;

@Repository
public interface BurgerRepository  extends JpaRepository<Burger, Long>{

}