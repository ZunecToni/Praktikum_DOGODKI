
 package com.praktikum.dogodki.entities;


public class Organizator {
	Long id;
	String ime;
	String priimek;
	String email;

	public Organizator () {
		
	}
	
	
	public Organizator (String ime, String priimek, String email) {
		this.ime = ime;
		this.priimek = priimek;
		this.email = email;
		
	}


	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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



	
	public String toString() {
		return "Uporabnik " + ime+ " " + priimek +"/n"+
		"Email : "+ email + "/n"; 
		
	}
	
	
	

}