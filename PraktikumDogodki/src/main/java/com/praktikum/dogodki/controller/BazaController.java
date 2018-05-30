package com.praktikum.dogodki.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
}
