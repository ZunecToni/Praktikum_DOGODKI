package com.praktikum.dogodki.converters;


import java.sql.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.praktikum.dogodki.baza.Dogodki;
import com.praktikum.dogodki.entities.Dogodek;

/**
 * Created by jt on 1/10/17.
 */
@Component
public class DogodekToDogodekForm implements Converter<Dogodki, Dogodek> {
    @Override
    public Dogodek convert(Dogodki dogodki) {
    	Dogodek dogodek = new Dogodek();
    	dogodek.setId(dogodki.getId());
    	dogodek.setNaziv(dogodki.getNaziv());
    	dogodek.setOpis(dogodki.getOpis());
    	dogodek.setLokacija(dogodki.getLokacija());
    	dogodek.setZacetek(dogodki.getZacetek());
    	dogodek.setTrajanje(dogodki.getTrajanje());
    	dogodek.setKonecPrijav(dogodki.getKonecPrijav());
    	dogodek.setKonecOdjav(dogodki.getKonecOdjav());
    	dogodek.setMinOseb(dogodki.getMinOseb());
    	dogodek.setMaxOseb(dogodki.getMaxOseb());
    	dogodek.setStatus(dogodki.getStatus());
    	dogodek.setPotrebnoPovabilo(dogodki.getPotrebnoPovabilo());
        return dogodek;
    }
}
 