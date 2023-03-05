package com.Leadapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Leadapp.Entity.Billing;
import com.Leadapp.Entity.Contact;
import com.Leadapp.Service.BillingService;
import com.Leadapp.Service.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private ContactService serv;
	
	@Autowired
	private BillingService bill;
	
	@RequestMapping("/generateBillid")
	public String viewBillingPage(@RequestParam("id") long id, ModelMap model) {
		Contact contact = serv.getLeadById(id);
		model.addAttribute("contact", contact);
		
		return "Create_bill";
	}
	
	@RequestMapping("/savebill")
	public String saveOneBill(@ModelAttribute("xyz")Billing lead,@RequestParam("id")long id,ModelMap model) {
		
		Billing savebilldata = bill.savebilldata(lead);
		
		model.addAttribute("contacts",savebilldata);

			return "Invoice_info";	
      
	}

	
}
