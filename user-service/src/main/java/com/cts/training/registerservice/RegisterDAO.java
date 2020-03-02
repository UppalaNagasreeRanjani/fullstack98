package com.cts.training.registerservice;

import org.springframework.data.jpa.repository.JpaRepository;



public interface RegisterDAO extends JpaRepository<Register, Integer>  {
	Register findByEmail(String email);
}

