package com.praktikum.dogodki.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.praktikum.dogodki.baza.DogodekDao;
import com.praktikum.dogodki.entities.Dogodek;

@Controller
public class BazaController {
	

	@Autowired
	DogodekDao dogodekDao;
	
	@RequestMapping(value = {"/addDogodek"}, method = RequestMethod.POST)
	public String dodajDogodek(
			@RequestParam(value="naziv")String naziv,
			@RequestParam(value="opis")String opis,
			@RequestParam(value="lokacija", required = false) String lokacija,
			@RequestParam(value="zacetek", required = false)Date zacetek,
			@RequestParam(value="trajanje", required = false)Date trajanje,
			@RequestParam(value="konecPrijav", required = false)Date konecPrijav,
			@RequestParam(value="konecOdjav", required = false)Date konecOdjav,
			@RequestParam(value="minOseb", required = false)int minOseb,
			@RequestParam(value="maxOseb", required = false)int maxOseb,
			@RequestParam(value="status", required = false)String status,
			@RequestParam(value="potrebnoPovabilo", required = false)boolean potrebnoPovabilo 
			)
	{
		dogodekDao.addDogodek(naziv, opis, lokacija, zacetek, trajanje, konecPrijav, 
				konecOdjav, minOseb, maxOseb, status, potrebnoPovabilo);
		return "redirect:/listDogodkov";
	}
	

    @RequestMapping(value = { "/listDogodek" }, method = RequestMethod.GET)
    public String seznamDogodkov(Model model)
    {
        model.addAttribute("dogodki",DogodekDao.getVseDogodke());
        return "listDogodek";
    }
    
}
