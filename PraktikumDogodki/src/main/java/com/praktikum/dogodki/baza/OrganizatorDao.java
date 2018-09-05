package com.praktikum.dogodki.baza;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.praktikum.dogodki.entities.Dogodek;
import com.praktikum.dogodki.entities.Organizator;

@Component
public class OrganizatorDao {
	
	@Autowired
	static
	
	JdbcTemplate jdbcTemplate;

	public void addOrganizator(String ime, String priimek, String email) {
		
		
	} 
	
	public static List<Organizator> getVseOrganizatorje(){
		String sql = "SELECT * FROM ORGANIZATOR";
		List<Organizator> ret = new ArrayList<Organizator>();
		List<Map<String,Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map row : rows) {
			
			int id = (Integer) row.get("id");
			 String ime= (String)row.get("ime");
			 String priimek= (String)row.get("priimek");
			 String email= (String)row.get("email");
			 
			

			ret.add(new Organizator(id,ime, priimek, email));
		}
		return ret;
	}

}