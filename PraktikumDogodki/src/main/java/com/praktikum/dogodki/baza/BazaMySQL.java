package com.praktikum.dogodki.baza;

/*
--Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. 
The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.

--Tue Jun 05 00:18:08 CEST 2018 WARN: Establishing SSL connection without server's identity verification is not recommended. 
According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. 
For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. 
You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.

--java.sql.SQLException: The server time zone value 'Srednjeevropski poletni èas' is unrecognized or represents more than one time zone. 
You must configure either the server or JDBC driver (via the serverTimezone configuration property) to use a more specifc time zone value if you want to utilize time zone support.

*Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. 
*The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
java.sql.SQLNonTransientConnectionException: Could not create connection to database server. Attempted reconnect 3 times. Giving up.

*/

	import java.sql.Connection;
	import java.sql.DriverManager;

	public class BazaMySQL {
		
		public static void main (String [] args) throws Exception {
			getConnection();
		}
		
		
		public static Connection getConnection() throws Exception{
			
			try {
				String driver = "com.mysql.cj.jdbc.Driver";
				String url = "jdbc:mysql://127.0.0.1:3306/dogodki?autoReconnect=true&useSSL=false";
				String username= "ZunecToni";
				String password = "dogodki2018";
				Class.forName(driver);
				
				Connection conn = DriverManager.getConnection(url,username,password);
				System.out.println("Connected");
				return conn;
			}catch(Exception e) {System.out.println(e);}
			
			return null;
		}
	}
