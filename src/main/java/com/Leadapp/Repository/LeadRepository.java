package com.Leadapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Leadapp.Entity.Lead;


public interface LeadRepository extends JpaRepository<Lead, Long> {
	
	Lead findByEmail(String email);

}
