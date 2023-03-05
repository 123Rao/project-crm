package com.Leadapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Leadapp.Entity.Contact;
import com.Leadapp.Entity.Lead;

public interface ContactRepository extends JpaRepository<Contact,Long> {

	
}
