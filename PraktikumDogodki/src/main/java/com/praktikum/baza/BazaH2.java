package com.praktikum.baza;

import java.sql.Connection;
import java.sql.DriverManager;

public class BazaH2 {
	public Connection getConnection() {
		try {
			Class.forName("org.h2.Driver");

			//DriverManager.getConnection("url");
			return  DriverManager.getConnection("url","username","pass");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}