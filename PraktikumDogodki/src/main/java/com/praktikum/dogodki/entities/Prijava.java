
 
 package com.praktikum.dogodki.entities;

public class Prijava {
	String ime;
	String priimek;
	String email;
	int Ocena;
	String prijava;
	String status;
	
	

	public Prijava (String ime, String priimek, String email ) {
		this.ime = ime;
		this.priimek = priimek;
		this.email = email;
		
	}
	public Prijava (String ime, String priimek, String email,int Ocena,String prijava,String status ) {
		this.ime = ime;
		this.priimek = priimek;
		this.email = email;
		this.Ocena = Ocena;
		this.prijava = prijava;
		this.status=status;
		
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



	
	
	public String toString() {
		return "Uporabnik " + ime+ " " + priimek +"/n"+
		"Email : "+ email + "/n";
		
	}
	
	
	

}