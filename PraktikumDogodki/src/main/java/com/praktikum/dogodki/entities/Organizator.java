package com.praktikum.dogodki.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Organizator {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String ime;	
	private String priimek;
	private String email;
	
	
	


	public Organizator(String ime, String priimek, String email) {
		super();
		this.ime = ime;
		this.priimek = priimek;
		this.email = email;
	}


	public Organizator(int id, String ime, String priimek, String email) {
		super();
		this.id = id;
		this.ime = ime;
		this.priimek = priimek;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	public String getPriimek() {
		return priimek;
	}


	public void setPriimek(String priimek) {
		this.priimek = priimek;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	
	
}


	



//
// package com.praktikum.dogodki.entities;
//
//
//public class Organizator {
//	Long id;
//	String ime;
//	String priimek;
//	String email;
//
//	public Organizator () {
//		
//	}
//	
//	
//	public Organizator (String ime, String priimek, String email) {
//		this.ime = ime;
//		this.priimek = priimek;
//		this.email = email;
//		
//	}
//
//
//	public String getIme() {
//		return ime;
//	}
//
//
//	public void setIme(String ime) {
//		this.ime = ime;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//
//	public String getPriimek() {
//		return priimek;
//	}
//
//
//	public void setPriimek(String priimek) {
//		this.priimek = priimek;
//	}
//
//
//	public String getEmail() {
//		return email;
//	}
//
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//
//
//	
//	public String toString() {
//		return "Uporabnik " + ime+ " " + priimek +"/n"+
//		"Email : "+ email + "/n"; 
//		
//	}
//	
//	
//	
//
//}