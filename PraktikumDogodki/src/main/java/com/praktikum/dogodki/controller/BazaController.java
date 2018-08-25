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
			@RequestParam(value="naziv")String naziv,
			@RequestParam(value="opis")String opis,
			@RequestParam(value="lokacija")String lokacija,
			@RequestParam(value="zacetek")Date zacetek,
			@RequestParam(value="trajanje")Date trajanje,
			@RequestParam(value="konecPrijav")Date konecPrijav,
			@RequestParam(value="konecOdjav")Date konecOdjav,
			@RequestParam(value="minOseb")int minOseb,
			@RequestParam(value="maxOseb")int maxOseb,
			@RequestParam(value="status")String status,
			@RequestParam(value="potrebnoPovabilo")boolean potrebnoPovabilo 
			)
	{
		dogodekDao.addDogodek(naziv, opis, lokacija, zacetek, trajanje, konecPrijav, 
				konecOdjav, minOseb, maxOseb, status, potrebnoPovabilo);
		return "redirect:/listDogodkov";
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
