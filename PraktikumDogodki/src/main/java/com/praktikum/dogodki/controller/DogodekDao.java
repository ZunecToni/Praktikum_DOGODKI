package com.praktikum.dogodki.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.praktikum.dogodki.entities.Dogodek;

@Component
public class DogodekDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void addDogodek(String naziv, String opis, String lokacija, Date zacetek, Date trajanje, Date konecPrijav,
			Date konecOdjav, int minOseb, int maxOseb, String status, boolean potrebnoPovabilo) {
		
		
	} 
	
	public List<Dogodek> getVseDogodke(){
		String sql = "SELECT * FROM DOGODEK";
		List<Dogodek> ret = new ArrayList<Dogodek>();
		List<Map<String,Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map row : rows) {
			
			
			 String naziv= (String)row.get("naziv");
			 String opis= (String)row.get("opis");
			 String lokacija= (String)row.get("lokacija");
			 Date zacetek= (Date)row.get("zacetek");
			 Date trajanje= (Date)row.get("trajanje");
			 Date konecPrijav= (Date)row.get("konecPrijav");
			 Date konecOdjav= (Date)row.get("konecOdjav");
			 int minOseb= (int)row.get("minOseb");
			 int maxOseb= (int)row.get("maxOseb");
			 String status= (String)row.get("status");
			 boolean potrebnoPovabilo = (boolean)row.get("potrebnoPovabilo");
			

			ret.add(new Dogodek(naziv, opis, lokacija, zacetek, trajanje, konecPrijav, konecOdjav, minOseb, maxOseb, status, potrebnoPovabilo));
		}
		return ret;
	}

}
