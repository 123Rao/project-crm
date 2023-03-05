package com.Leadapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Leadapp.Entity.Contact;
import com.Leadapp.Entity.Lead;
import com.Leadapp.Service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contact;
	

	@RequestMapping("/listContact")
	public String listAllContacts(ModelMap model) {
		List<Contact> lead = contact.listAll();
		model.addAttribute("contact", lead);
		return "Contact_Search";
	}
	
	@RequestMapping("/getcontactsid")
	public String deleteContactlist(@RequestParam("id")long id,ModelMap model) {
		contact.deletOneLead(id);
		List<Contact> lead = contact.listAll();
		model.addAttribute("contact", lead);
		return "Contact_Search";
		
	}
	
	@RequestMapping("/generateupdateid")
	public String updateLead(@RequestParam("id")long id,ModelMap model) {
		Contact lead = contact.getconatactById(id);
		model.addAttribute("lead",lead);
		return "Update_Contact";
		
	}
	@RequestMapping("/updatecontact")
	public String saveupdateContact(@ModelAttribute("xyz")Contact contacts ,@RequestParam("id")long id,  ModelMap model) {
		contact.SaveContact(contacts);
		List<Contact> lead = contact.listAll();
		model.addAttribute("contact", lead);
		return "Contact_Search";
		
	}
	@RequestMapping("/getcontactsinfoid")
	public String updateConatctlist(@RequestParam("id")long id,ModelMap model) {
		Contact lead = contact.getconatactById(id);
		model.addAttribute("contact",lead);
		return "Contact_info";
		
	}
	
}
