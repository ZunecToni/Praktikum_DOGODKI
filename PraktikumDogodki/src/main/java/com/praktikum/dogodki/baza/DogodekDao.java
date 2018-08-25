package com.praktikum.dogodki.baza;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.praktikum.dogodki.entities.Dogodek;

@Component
public class DogodekDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public int addDogodek(String naziv, String opis, String lokacija, Date zacetek, Date trajanje, Date konecPrijav,
			Date konecOdjav, int minOseb, int maxOseb, String status, boolean potrebnoPovabilo) {
		
		String sql ="INSERT INTO DOGODEK ( naziv,  opis,  lokacija,  zacetek,  trajanje,  konecPrijav,"
				+ " konecOdjav,  minOseb,  maxOseb,  status,  potrebnoPovabilo) values(?,?,?,?,?,?,?,?,?,?,?)";

		return jdbcTemplate.update(sql, new Object[]{naziv,  opis,  lokacija,  zacetek,  trajanje,  konecPrijav, konecOdjav,  minOseb,  maxOseb,  status,  potrebnoPovabilo});
		
		//https://stackoverflow.com/questions/23702041/failed-to-convert-property-value-of-type-java-lang-string-to-required-type-java
		
	} 	public int addDogodek(String naziv) {
		
		String sql ="INSERT INTO DOGODEK ( naziv) values(?)";

		return jdbcTemplate.update(sql, new Object[]{naziv});
		
		//https://stackoverflow.com/questions/23702041/failed-to-convert-property-value-of-type-java-lang-string-to-required-type-java
		
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
	public Dogodek getDogodek(String naziv, String lokacija) {

        String sql = "SELECT id,ime,priimek FROM oseba WHERE ime = ? and priimek = ?";
        Dogodek os = (Dogodek)jdbcTemplate.queryForObject(sql,new Object[] { naziv, lokacija }, 
                                   new BeanPropertyRowMapper(Dogodek.class));
   return os;
}

	public Dogodek getDogodek(String naziv) {

        String sql = "SELECT id,ime,priimek FROM oseba WHERE ime = ? and priimek = ?";
        Dogodek os = (Dogodek)jdbcTemplate.queryForObject(sql,new Object[] { naziv}, 
                                   new BeanPropertyRowMapper(Dogodek.class));
   return os;
}
	
public Dogodek getOseba(int id) {
        String sql = "SELECT * FROM oseba WHERE id = ?";
        Dogodek o = (Dogodek)jdbcTemplate.queryForObject(sql,new Object[] { id }, 
        new BeanPropertyRowMapper(Dogodek.class));
        return o;
}

public String getById(int id){
        String sql = "SELECT name FROM mojseznam WHERE id = "+id;
        String name = (String)jdbcTemplate.queryForObject(sql, String.class);
        return name;
}



}
