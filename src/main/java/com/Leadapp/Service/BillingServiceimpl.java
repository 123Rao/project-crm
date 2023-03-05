package com.Leadapp.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Leadapp.Entity.Billing;
import com.Leadapp.Entity.Contact;
import com.Leadapp.Repository.BillingRepository;

@Service
public class BillingServiceimpl implements BillingService {
	
	@Autowired
	private BillingRepository BillRepo;
	
	@Override
	public Billing savebilldata(Billing lead) {
		Billing savedBill = BillRepo.save(lead);
		return savedBill;
	}



}
