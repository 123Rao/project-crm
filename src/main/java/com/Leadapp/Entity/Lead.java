package com.Leadapp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Leads")
public class Lead {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	@Column(name="first_name",length = 30,nullable = false)
	private String firstname;
	
	@Column(name="last_name",length = 30,nullable = false)
	private String lastname;
	
	@Column(name="email",length = 130,nullable = false,unique = true)
	private String email;
	
	@Column(name="mobile",length = 30,nullable = false,unique = true)
	private String mobile;
	
	@Column(name="address",length = 400,nullable = false)
	private String address;
	
	@Column(name="lead_Source")
	private String leadSource;
	
	@Column(name="gender")
	private String gender;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLeadSource() {
		return leadSource;
	}

	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Lead(long id, String firstname, String lastname, String email, String mobile, String address,
			String leadSource, String gender) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.leadSource = leadSource;
		this.gender = gender;
	}

	public Lead() {
		super();
	}
	
	
	

}
