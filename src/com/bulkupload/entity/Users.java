package com.bulkupload.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity

@Table(name = "users", catalog = "bulkupload")
public class Users implements java.io.Serializable {
	private int uid;
	private String firstname;
	private String lastname;
	private String uemail;
	private String password;
	
	public Users() {
		
	}

	public Users(Integer uid, String firstname, String lastname, String uemail, String password) {
		this(firstname, lastname, uemail, password);
		this.uid = uid;
	}

	public Users(String firstname, String lastname, String uemail, String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.uemail = uemail;
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "uid", unique = true, nullable = false)
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
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

	@Column(name = "uemail", nullable = false)
	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
