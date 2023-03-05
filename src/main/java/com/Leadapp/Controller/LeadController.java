package com.Leadapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Leadapp.Controller.util.EmailServices;
import com.Leadapp.Entity.Contact;
import com.Leadapp.Entity.Lead;
import com.Leadapp.Service.ContactService;
import com.Leadapp.Service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService serv;
	
	@Autowired
	private ContactService contserv;
	
	@Autowired
	private EmailServices emailServices;
	
	
	@RequestMapping("/")
	public String viewLeadPage() {
		
		return "view_lead_page";
		
	}
	

	
	@RequestMapping("/savelead")
	public String saveOneLead(@ModelAttribute("xyz")Lead lead,ModelMap model) {
		serv.SaveLead(lead);
		model.addAttribute("lead",lead);
        return "lead_info";
	}
	
	@RequestMapping("/convertlead")
	public String convertLead(@RequestParam("id")long id,ModelMap model) {
		Lead lead = serv.getLeadById(id);
		
		Contact contact = new Contact();
		contact.setFirstname(lead.getFirstname());
		contact.setLastname(lead.getLastname());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setLeadSource(lead.getLeadSource());
		contact.setGender(lead.getGender());
		contact.setAddress(lead.getAddress());
		contserv.saveContact(contact);
		model.addAttribute("lead",lead);
		serv.deletOneLead(id);
		List<Contact>leads=contserv.listAll();
		model.addAttribute("contact",leads);
		return "Contact_Search";
		
	}
	
	@RequestMapping("/lead_search")
	public String getAllLeads(ModelMap model){
		
		List<Lead>leads=serv.listAll();
		model.addAttribute("leads",leads);
		return "Lead_Search";		
	}
	
	@RequestMapping("/getleadByid")
	public String getleadByid(@RequestParam("id")long id,ModelMap model) {
		Lead lead = serv.getLeadById(id);
		model.addAttribute("lead",lead);
        return "lead_info";
        
        
	}
	@RequestMapping("/deleteleadid")
	public String deleteleadlist(@RequestParam("id")long id,ModelMap model) {
		serv.deletOneLead(id);
		List<Lead>lead=serv.listAll();
		model.addAttribute("leads",lead);
		return "Lead_Search";
		
	}
	@RequestMapping("/updateleadid")
	public String updateLead(@RequestParam("id")long id,ModelMap model) {
		Lead lead = serv.getLeadById(id);
		model.addAttribute("lead",lead);
		return "Update_lead";
		
	}
	
	@RequestMapping("/updatelist")
	public String saveupdatelead(@ModelAttribute("xyz")Lead leads,@RequestParam("id") long id,  ModelMap model) {
		serv.SaveLead(leads);
		List<Lead>lead=serv.listAll();
		model.addAttribute("leads",lead);
		return "Lead_Search";
		
	}

	@RequestMapping("/getcontactid")
	public String getcontactId(@RequestParam("id")long id,ModelMap model) {
		Contact contactinfo =  contserv.getLeadById(id);
		model.addAttribute("contact",contactinfo);
        return "Contact_info";
	}
	

	@RequestMapping("/EmailleadByemail")
	public String EmailLeadPage(@RequestParam("email")String email,ModelMap model) {
		Lead findemail = serv.getLeadByEmail(email);
    	model.addAttribute("lead",findemail);
		return "Email";
		
	}
	
	@RequestMapping("/emaildetails")
	public String Emaildetails(@RequestParam("to")String to,@RequestParam("subject")String subject,@RequestParam("message")String message ,ModelMap model) {
		emailServices.SendEmail(to,subject,message);
		return "Email";
		
	}
	
}
