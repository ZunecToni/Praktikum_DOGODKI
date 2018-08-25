package com.praktikum.dogodki.converters;


import java.sql.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.praktikum.dogodki.baza.DogodekDao;
import com.praktikum.dogodki.baza.Dogodki;
import com.praktikum.dogodki.entities.Dogodek;

/**
 * Created by jt on 1/10/17.
 */
@Component
public class DogodekFormToDogodek implements Converter<Dogodek, Dogodki> {

    @Override
    public Dogodki convert(Dogodek dogodek) {
        Dogodki dogodki = new Dogodki();
        if (dogodek.getId() != null  && !StringUtils.isEmpty(dogodek.getId())) {
            dogodki.setId(new Long(dogodek.getId()));
        }
        dogodki.setNaziv(dogodek.getNaziv());
//        product.setPrice(productForm.getPrice());
//        product.setImageUrl(productForm.getImageUrl());

        dogodki.setOpis(dogodek.getOpis());
        dogodki.setLokacija(dogodek.getLokacija());
        dogodki.setMinOseb(dogodek.getMinOseb());
        dogodki.setMaxOseb(dogodek.getMaxOseb());
        dogodki.setStatus(dogodek.getStatus());
        dogodki.setPotrebnoPovabilo(dogodek.getPotrebnoPovabilo());
        

        dogodki.setZacetek(dogodek.getZacetek());
        dogodki.setTrajanje(dogodek.getTrajanje());
        dogodki.setKonecPrijav((Date) dogodek.getKonecPrijav());
        dogodki.setKonecOdjav(dogodek.getKonecOdjav());
        return dogodki;
    }

}
