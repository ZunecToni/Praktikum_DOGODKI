//package com.praktikum.dogodki.servis;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Service;
//
//import com.praktikum.dogodki.baza.Organizatorji;
//import com.praktikum.dogodki.converters.OrganizatorForm;
//import com.praktikum.dogodki.entities.Organizator;
//import com.praktikum.dogodki.repositorij.OrganizatorRepozitorij;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by jt on 1/10/17.
// */
//@Service
//public class OrganizatorServisImpl implements OrganizatorServis {
//
//    private OrganizatorRepozitorij organizatorRepozitorij;
//    private OrganizatorForm organizatorForm;
//
//    @Autowired
//    public OrganizatorServisImpl(OrganizatorServisImpl organizatorServisImpl, OrganizatorForm organizatorForm) {
//        this.organizatorRepozitorij = organizatorRepozitorij;
//        this.organizatorForm = organizatorForm;
//    }
//
//
//    @Override
//    public List<Organizatorji> listAll() {
//        List<Organizatorji> productss = new ArrayList<Organizatorji>();
//        organizatorRepozitorij.findAll().forEach(productss::add); //fun with Java 8
//        return productss;
//    }
//
//    @Override
//    public Organizatorji getById(Long id) {
//        return  organizatorRepozitorij.findById(id).orElse(null);
//    }
//
//    @Override
//    public Organizatorji saveOrUpdate(Organizatorji organizatorji) {
//    	organizatorRepozitorij.save(organizatorji);
//        return organizatorji;
//    }
//
//    @Override
//    public void delete(Long id) {
//    	organizatorRepozitorij.deleteById(id);
//
//    }
//
//
//	@Override
//	public Organizatorji saveOrUpdateProductForm(Organizator organizator) {
//		Organizatorji savedProduct = saveOrUpdate(organizatorForm.convert(organizator));
//        System.out.println("Saved Product Id: " + savedProduct.getId());
//        return savedProduct;
//	}
//
//
//	
//
//}
