//package com.praktikum.dogodki.baza;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//
//import com.praktikum.dogodki.entities.Organizator;
//	
//	@Component
//	public class RegistracijaOrganizator {
//		
//		Object ime;
//		Object priimek;
//		Object email;
//		
//		@Autowired
//		static
//		JdbcTemplate jdbcTemplate;
//
//		public void addOrganizator(String ime, String priimek, String email) {
//			
//			
//		} 
//		
//		public int addOrganizator(String naziv) {
//			
//			String sql ="INSERT INTO ORGANIZATOR (IME, PRIIMEK, EMAIL) values(?,?,?)";
//
//			
//			return jdbcTemplate.update(sql, new Object[]{ime, priimek, email});
//			
//			//https://stackoverflow.com/questions/23702041/failed-to-convert-property-value-of-type-java-lang-string-to-required-type-java
//			
//		} 
//		
//		public static List<Organizator> getVseOrganizatorje(){
//			String sql = "SELECT * FROM ORGANIZATOR";
//			List<Organizator> ret = new ArrayList<Organizator>();
//			List<Map<String,Object>> rows = jdbcTemplate.queryForList(sql);
//			for (Map row : rows) {
//				
//				
//				 String ime= (String)row.get("ime");
//				 String priimek= (String)row.get("priimek");
//				 String email= (String)row.get("email");
//				 
//				
//
//				ret.add(new Organizator(ime, priimek, email));
//			}
//			return ret;
//		}
//
//	}
//
//
