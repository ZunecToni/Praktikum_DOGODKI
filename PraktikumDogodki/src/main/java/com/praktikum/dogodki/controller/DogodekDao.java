package com.praktikum.dogodki.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DogodekDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

//	public void addDogodek(String naziv, String opis, String lokacija, Date zacetek, Date trajanje, Date konecPrijav,
//			Date konecOdjav, int minOseb, int maxOseb, String status, boolean potrebnoPovabilo) {
//		
//		
//	}

}
