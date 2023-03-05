package com.Leadapp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Leadapp.Entity.Contact;
import com.Leadapp.Entity.Lead;
import com.Leadapp.Repository.ContactRepository;

@Service
public class ContactServiceimpl implements ContactService {

	@Autowired
	private ContactRepository contRepo;
	
	@Override
	public void saveContact(Contact contact) {
		contRepo.save(contact);
		
		
	}

	@Override
	public List<Contact> listAll() {
		List<Contact> leads = contRepo.findAll();
		return leads;
	}

	@Override
	public Contact getLeadById(long id) {
		Optional<Contact> contact = contRepo.findById(id);
		Contact contactinfo = contact.get();
		return contactinfo;
	}

	@Override
	public void deletOneLead(long id) {
		contRepo.deleteById(id);
		
	}

	@Override
	public Contact getconatactById(long id) {
		Optional<Contact> findBy = contRepo.findById(id);
		Contact lead = findBy.get();
		return lead;
		
	}

	@Override
	public void SaveContact(Contact contacts) {
		contRepo.save(contacts);
		
	}



	
}
