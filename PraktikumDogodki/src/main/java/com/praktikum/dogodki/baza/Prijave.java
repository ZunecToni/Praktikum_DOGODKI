
package com.praktikum.dogodki.baza;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.praktikum.dogodki.entities.Prijava; 

@Component
public class Prijave {

	@Autowired
    JdbcTemplate jdbcTemplate;
	
	
	public List<Prijava> getAllDogodke(){
        String sql = "SELECT * FROM Dogodek"; //sql query
        List<Prijava> ret = new ArrayList<Prijava>();
        List<Map<String,Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map row : rows) {
        	
        	String ime = (String) row.get("opis");
        	String priimek = (String) row.get("priimek");
        	String email = (String) row.get("email");
        	int Ocena = (int) row.get("Ocena");
        	String prijava = (String) row.get("prijava");
        	String status = (String) row.get("status");

            ret.add(new Prijava(ime,priimek, email, Ocena, prijava, status));
        }
        return ret;
    }

}