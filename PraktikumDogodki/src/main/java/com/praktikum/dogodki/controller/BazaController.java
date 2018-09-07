package com.praktikum.dogodki.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.praktikum.dogodki.baza.DogodekDao;
import com.praktikum.dogodki.baza.OrganizatorDao;
import com.praktikum.dogodki.entities.Dogodek;

@Controller
public class BazaController {
	

	@Autowired
	DogodekDao dogodekDao;
	
	@RequestMapping(value = {"/addDogodek"}, method = RequestMethod.GET)
	public String dodajDogodek(
			@RequestParam(value="naziv", required=true)String naziv,
			@RequestParam(value="opis", required=false)String opis,
			@RequestParam(value="lokacija", required=true)String lokacija,
			@RequestParam(value="zacetek", required=true)String zacetek,
			@RequestParam(value="trajanje", required=true)String trajanje,
			@RequestParam(value="konecPrijav", required=true)String konecPrijav,
			@RequestParam(value="konecOdjav", required=true)String konecOdjav,
			@RequestParam(value="minOseb", required=true)int minOseb,
			@RequestParam(value="maxOseb", required=false)int maxOseb,
			@RequestParam(value="status", required=false)String status,
			@RequestParam(value="potrebnoPovabilo", required=false)boolean potrebnoPovabilo 
			)
	{
		dogodekDao.addDogodek(naziv, opis, lokacija, zacetek, trajanje, konecPrijav, 
				konecOdjav, minOseb, maxOseb, status, potrebnoPovabilo);
		return "listDogodek";
	}
	
	@RequestMapping(value = { "seznamDogodkov"}, method = RequestMethod.GET)
	public String seznamDogodkov(Model model)
	{
		model.addAttribute("dogodki", dogodekDao.getVseDogodke() );
		return "seznamDogodkov";
	}
	
	@RequestMapping(value = { "index"}, method = RequestMethod.GET)
	public String organizator(Model model)
	{
		model.addAttribute("organizator", OrganizatorDao.getVseOrganizatorje() );
		return "index";
	}
	
	
	
	
	
	
	
}
