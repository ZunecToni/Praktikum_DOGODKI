package com.praktikum.dogodki.repositorij;

import org.springframework.data.repository.CrudRepository;

import com.praktikum.dogodki.baza.Dogodki;

/**
 * Created by jt on 1/10/17.
 */
public interface DogodekRepositorij extends CrudRepository<Dogodki, Long> {

	Iterable<Dogodki> findAll();

}
