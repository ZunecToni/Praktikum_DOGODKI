//package com.praktikum.dogodki;
//
//import javax.sql.DataSource;
// 
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
// 
//import com.praktikum.dogodki.baza.DogodekRepository;
// 
//@SpringBootApplication
//@EnableJpaRepositories("com.praktikum.dogodki.baza")
//@EntityScan("com.praktikum.dogodki.entities")
//public class PraktikumDogodkiApplication {
//	 @Autowired
//	    DataSource dataSource;
//	 
//	    @Autowired
//	    DogodekRepository DogodekRepository;
//
//	public static void main(String[] args) {
//		SpringApplication.run(PraktikumDogodkiApplication.class, args);
//	}
//	
//
//    public void run(String[] args) throws Exception {
//        System.out.println("Our DataSource is = " + dataSource);
//        Iterable<com.praktikum.dogodki.baza.Dogodki> systemlist = DogodekRepository.findAll();
//        for(com.praktikum.dogodki.baza.Dogodki systemmodel:systemlist){
//            System.out.println("Here is a system: " + systemmodel.toString());
//        }
//    }
//}





package com.praktikum.dogodki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraktikumDogodkiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PraktikumDogodkiApplication.class, args);
	}
}
