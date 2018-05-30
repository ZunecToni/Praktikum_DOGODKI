package com.praktikum.dogodki.baza;

import org.springframework.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.praktikum.dogodki.entities.Dogodek;

import java.util.*;
import java.util.Date;
import java.sql.*;  
@Component
public class Dogodki {
	
	
	
	
	

	@Autowired
    JdbcTemplate jdbcTemplate;
	
	
	public List<Dogodek> getAllDogodke(){
        String sql = "SELECT * FROM Dogodek"; //sql query
        List<Dogodek> ret = new ArrayList<Dogodek>();
        List<Map<String,Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map row : rows) {
        	
        	String naziv = (String) row.get("naziv");
        	String opis = (String) row.get("opis");
        	String lokacija = (String) row.get("lokacija");
        	Date zacetek = (Date) row.get("zacetek");
        	Date trajanje = (Date) row.get("trajanje");
        	Date konecPrijav = (Date) row.get("konecPrijav");
        	Date konecOdjav = (Date) row.get("konecOdjav");
        	int minOseb = (int) row.get("minOseb");
        	int maxOseb = (int) row.get("maxOseb");
        	String status = (String) row.get("status");
        	Boolean potrebnoPovabilo = (Boolean) row.get("potrebnoPovabilo");

            ret.add(new Dogodek( naziv,  opis,  lokacija, zacetek, trajanje, konecPrijav,
        		 konecOdjav,  minOseb, maxOseb, status, potrebnoPovabilo));
        }
        return ret;
    }
	
	
	
	
	

}
