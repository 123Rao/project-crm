package com.Leadapp.Service;

import java.util.List;

import com.Leadapp.Entity.Lead;

public interface LeadService {

	public void SaveLead(Lead lead);
	public Lead getLeadById(long id);
	public void deletOneLead(long id);
	public List<Lead> listAll();
	public Lead getLeadByEmail(String email);
	
}
