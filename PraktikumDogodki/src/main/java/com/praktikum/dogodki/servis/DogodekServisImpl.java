package com.praktikum.dogodki.servis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.praktikum.dogodki.baza.Dogodki;
import com.praktikum.dogodki.converters.DogodekFormToDogodek;
import com.praktikum.dogodki.entities.Dogodek;
import com.praktikum.dogodki.repositorij.DogodekRepositorij;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
@Service
public class DogodekServisImpl implements DogodekServis {

    private DogodekRepositorij dogodekRepositorij;
    private DogodekFormToDogodek dogodekFormToDogodek;

    @Autowired
    public DogodekServisImpl(DogodekRepositorij dogodekRepositorij, DogodekFormToDogodek dogodekFormToDogodek) {
        this.dogodekRepositorij = dogodekRepositorij;
        this.dogodekFormToDogodek = dogodekFormToDogodek;
    }


    @Override
    public List<Dogodki> listAll() {
        List<Dogodki> products = new ArrayList<Dogodki>();
        dogodekRepositorij.findAll().forEach(products::add); //fun with Java 8
        return products;
    }

    @Override
    public Dogodki getById(Long id) {
        return  dogodekRepositorij.findById(id).orElse(null);
    }

    @Override
    public Dogodki saveOrUpdate(Dogodki dogodki) {
    	dogodekRepositorij.save(dogodki);
        return dogodki;
    }

    @Override
    public void delete(Long id) {
    	dogodekRepositorij.deleteById(id);

    }


	@Override
	public Dogodki saveOrUpdateProductForm(Dogodek dogodek) {
    	Dogodki savedProduct = saveOrUpdate(dogodekFormToDogodek.convert(dogodek));
        System.out.println("Saved Product Id: " + savedProduct.getId());
        return savedProduct;
	}

	

}
