package com.praktikum.dogodki.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.praktikum.dogodki.baza.Dogodki;
import com.praktikum.dogodki.baza.Organizatorji;
import com.praktikum.dogodki.entities.Organizator;
import com.praktikum.dogodki.entities.Dogodek;

@Component
public class OrganizatorTo implements Converter<Organizatorji, Organizator> {
	@Override
	public Organizator convert(Organizatorji organizatorji) {
		Organizator organizator = new Organizator();
		organizator.setId(organizatorji.getId());
		organizator.setIme(organizatorji.getIme());
		organizator.setPriimek(organizatorji.getPriimek());
		organizator.setEmail(organizatorji.getEmail());
		return organizator;

	}
}