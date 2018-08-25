package com.praktikum.dogodki.entities;

import java.util.Date;

public class Dogodek {

	//naziv, opis, lokacija, zacetek, trajanje, konecPrijav, konecOdjav, minOseb, maxOseb, status, potrebnoPovabilo
	//LocalDateTime.now()

    private Long id;
	private String naziv;	
	private String opis;
	private String lokacija;
	private Date zacetek;
	private Date trajanje;
	private Date konecPrijav;
	private Date konecOdjav;
	private int minOseb;
	private int maxOseb;
	private String status;
	private boolean potrebnoPovabilo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getLokacija() {
		return lokacija;
	}

	public void setLokacija(String lokacija) {
		this.lokacija = lokacija;
	}

//
	public Dogodek() {
	}
	
	public Dogodek(String naziv, String lokacija) {
		super();
		this.naziv = naziv;
		this.lokacija = lokacija;
	}
//	
	public Dogodek(String naziv, String opis, String lokacija, Date zacetek, Date trajanje, Date konecPrijav,
			Date konecOdjav, int minOseb, int maxOseb, String status, boolean potrebnoPovabilo) {
		super();
		this.naziv = naziv;
		this.opis = opis;
		this.lokacija = lokacija;
		this.zacetek = zacetek;
		this.trajanje = trajanje;
		this.konecPrijav = konecPrijav;
		this.konecOdjav = konecOdjav;
		this.minOseb = minOseb;
		this.maxOseb = maxOseb;
		this.status = status;
		this.potrebnoPovabilo = potrebnoPovabilo;
	}

	public Date getZacetek() {
		return zacetek;
	}

	public void setZacetek(Date zacetek) {
		this.zacetek = zacetek;
	}

	public Date getTrajanje() {
		return trajanje;
	}

	public void setTrajanje(Date trajanje) {
		this.trajanje = trajanje;
	}

	public Date getKonecPrijav() {
		return konecPrijav;
	}

	public void setKonecPrijav(Date konecPrijav) {
		this.konecPrijav = konecPrijav;
	}

	public Date getKonecOdjav() {
		return konecOdjav;
	}

	public void setKonecOdjav(Date konecOdjav) {
		this.konecOdjav = konecOdjav;
	}

	public int getMinOseb() {
		return minOseb;
	}

	public void setMinOseb(int minOseb) {
		this.minOseb = minOseb;
	}

	public int getMaxOseb() {
		return maxOseb;
	}

	public void setMaxOseb(int maxOseb) {
		this.maxOseb = maxOseb;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean getPotrebnoPovabilo() {
		return potrebnoPovabilo;
	}
	
	public void setPotrebnoPovabilo(boolean potrebnoPovabilo) {
		this.potrebnoPovabilo = potrebnoPovabilo;
	}

		
}


