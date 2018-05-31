//package com.praktikum.dogodki.baza;
//
//
//
//	import java.sql.Connection;
//	import java.sql.DriverManager;
//
//	public class BazaMySQL {
//		
//		public static void main (String [] args) throws Exception {
//			getConnection();
//		}
//		
//		
//		public static Connection getConnection() throws Exception{
//			
//			try {
//				String driver = "com.mysql.jdbc.Driver";
//				String url = "jdbc:127.0.0.1:3306/baza";
//				String username= "ZunecToni";
//				String password = "dogodki2018";
//				Class.forName(driver);
//				
//				Connection conn = DriverManager.getConnection(url,username,password);
//				System.out.println("Connected");
//				return conn;
//			}catch(Exception e) {System.out.println(e);}
//			
//			return null;
//		}
//	}
