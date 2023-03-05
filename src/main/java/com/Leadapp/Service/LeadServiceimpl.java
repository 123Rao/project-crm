package com.Leadapp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Leadapp.Entity.Lead;
import com.Leadapp.Repository.LeadRepository;

@Service
public class LeadServiceimpl implements LeadService {
	
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void SaveLead(Lead lead) {
		leadRepo.save(lead);
	}

	@Override
	public Lead getLeadById(long id) {
		Optional<Lead> findBy = leadRepo.findById(id);
		Lead lead = findBy.get();
		return lead;
	}

	@Override
	public void deletOneLead(long id) {
			leadRepo.deleteById(id);
	}

	@Override
	public List<Lead> listAll() {
		
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public Lead getLeadByEmail(String email) {
		 Lead newid = leadRepo.findByEmail(email);	
		return newid;
	}

}
