package com.praktikum.dogodki.converters;
import java.sql.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.praktikum.dogodki.baza.Organizatorji;
import com.praktikum.dogodki.entities.Organizator;

@Component
public class OrganizatorForm implements Converter<Organizator, Organizatorji> {

	@Override
    public Organizatorji convert(Organizator organizator) {
        Organizatorji organizatorji = new Organizatorji();
        if (organizator.getId() != null  && !StringUtils.isEmpty(organizator.getId())) {
            organizatorji.setId(new Long(organizator.getId()));
        }
		organizatorji.setIme(organizator.getIme());
		organizatorji.setPriimek(organizator.getPriimek());
		organizatorji.setEmail(organizator.getEmail());
		return organizatorji;
	}

	public Organizator convert(Organizatorji organizatorji) {
		// TODO Auto-generated method stub
		return null;
	}


}
