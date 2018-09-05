//package com.praktikum.dogodki.baza;
//
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class Dogodki {
//
//	//naziv, opis, lokacija, zacetek, trajanje, konecPrijav, konecOdjav, minOseb, maxOseb, status, potrebnoPovabilo
//	//LocalDateTime.now()
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private int id;
//	private String naziv;	
//	private String opis;
//	private String lokacija;
//	private String zacetek;
//	private String trajanje;
//	private String konecPrijav;
//	private String konecOdjav;
//	private int minOseb;
//	private int maxOseb;
//	private String status;
//	private boolean potrebnoPovabilo;
//
//
//	public Dogodki(int id, String naziv, String opis, String lokacija, String zacetek, String trajanje,
//			String konecPrijav, String konecOdjav, int minOseb, int maxOseb, String status,
//			boolean potrebnoPovabilo) {
//		super();
//		this.id = id;
//		this.naziv = naziv;
//		this.opis = opis;
//		this.lokacija = lokacija;
//		this.zacetek = zacetek;
//		this.trajanje = trajanje;
//		this.konecPrijav = konecPrijav;
//		this.konecOdjav = konecOdjav;
//		this.minOseb = minOseb;
//		this.maxOseb = maxOseb;
//		this.status = status;
//		this.potrebnoPovabilo = potrebnoPovabilo;
//	}
//
//
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getNaziv() {
//		return naziv;
//	}
//	public void setNaziv(String naziv) {
//		this.naziv = naziv;
//	}
//	public String getOpis() {
//		return opis;
//	}
//	public void setOpis(String opis) {
//		this.opis = opis;
//	}
//	public String getLokacija() {
//		return lokacija;
//	}
//	public void setLokacija(String lokacija) {
//		this.lokacija = lokacija;
//	}
//	public String getZacetek() {
//		return zacetek;
//	}
//	public void setZacetek(String zacetek) {
//		this.zacetek = zacetek;
//	}
//	public String getTrajanje() {
//		return trajanje;
//	}
//	public void setTrajanje(String trajanje) {
//		this.trajanje = trajanje;
//	}
//	public String getKonecPrijav() {
//		return konecPrijav;
//	}
//	public void setKonecPrijav(String konecPrijav) {
//		this.konecPrijav = konecPrijav;
//	}
//	public String getKonecOdjav() {
//		return konecOdjav;
//	}
//	public void setKonecOdjav(String konecOdjav) {
//		this.konecOdjav = konecOdjav;
//	}
//	public int getMinOseb() {
//		return minOseb;
//	}
//	public void setMinOseb(int minOseb) {
//		this.minOseb = minOseb;
//	}
//	public int getMaxOseb() {
//		return maxOseb;
//	}
//	public void setMaxOseb(int maxOseb) {
//		this.maxOseb = maxOseb;
//	}
//	public String getStatus() {
//		return status;
//	}
//	public void setStatus(String status) {
//		this.status = status;
//	}
//	public boolean isPotrebnoPovabilo() {
//		return potrebnoPovabilo;
//	}
//	public void setPotrebnoPovabilo(boolean potrebnoPovabilo) {
//		this.potrebnoPovabilo = potrebnoPovabilo;
//	}
//
//
//
//
//
//}
//
//
//
//
//
