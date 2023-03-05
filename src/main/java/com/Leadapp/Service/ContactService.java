package com.Leadapp.Service;

import java.util.List;

import com.Leadapp.Entity.Contact;
import com.Leadapp.Entity.Lead;

public interface ContactService {
	
	public void saveContact(Contact contact);
	public List<Contact> listAll();
	public Contact getLeadById(long id);
	public void deletOneLead(long id);
	public Contact getconatactById(long id);
	public void SaveContact(Contact contacts);
	


}
