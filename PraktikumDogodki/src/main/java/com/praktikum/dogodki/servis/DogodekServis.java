package com.praktikum.dogodki.servis;


import java.util.List;

import com.praktikum.dogodki.baza.Dogodki;
import com.praktikum.dogodki.entities.Dogodek;

/**
 * Created by jt on 1/10/17.
 */
public interface DogodekServis {

    List<Dogodki> listAll();

    Dogodki getById(Long id);

    Dogodki saveOrUpdate(Dogodki dogodki);

    void delete(Long id);

    Dogodki saveOrUpdateProductForm(Dogodek dogodek);

}
