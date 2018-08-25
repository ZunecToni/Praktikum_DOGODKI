package com.praktikum.dogodki.servis;


import java.util.List;

import com.praktikum.dogodki.baza.Organizatorji;
import com.praktikum.dogodki.entities.Organizator;

/**
 * Created by jt on 1/10/17.
 */
public interface OrganizatorServis {

    List<Organizatorji> listAll();

    Organizatorji getById(Long id);

    Organizatorji saveOrUpdate(Organizatorji organizatorji);

    void delete(Long id);

    Organizatorji saveOrUpdateProductForm(Organizator organizator);

}
