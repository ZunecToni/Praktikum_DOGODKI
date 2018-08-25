//package com.praktikum.dogodki.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.praktikum.dogodki.baza.Organizatorji;
//import com.praktikum.dogodki.converters.OrganizatorForm;
//import com.praktikum.dogodki.entities.Organizator;
//import com.praktikum.dogodki.servis.OrganizatorServis;
//import com.praktikum.dogodki.servis.OrganizatorServis;
//
//import javax.validation.Valid;
//
///**
// * Created by jt on 1/10/17.
// */
//@Controller
//public class OrganizatorController {
//    private OrganizatorServis organizatorServis;
//    private OrganizatorForm organizatorForm;
//
//    @Autowired
//    public void setOrganizatorForm(OrganizatorForm organizatorForm) {
//        this.organizatorForm = organizatorForm;
//    }
//
//    @Autowired
//    public void setOrganizatorServis(OrganizatorServis organizatorServis) {
//        this.organizatorServis = organizatorServis;
//    }
//
//    @RequestMapping({"/organizator/listO", "/organizator"})
//    public String listOProducts(Model model){
//        model.addAttribute("organizatorji", organizatorServis.listAll());
//        return "organizator/listO";
//    }
//
//    @RequestMapping("/organizator/showw/{id}")
//    public String getProduct(@PathVariable String id, Model model){
//        model.addAttribute("organizatorji", organizatorServis.getById(Long.valueOf(id)));
//        return "organizator/showw";
//    }
//
//    @RequestMapping("organizator/edit/{id}")
//    public String edit(@PathVariable String id, Model model){
//        Organizatorji organizatorji = organizatorServis.getById(Long.valueOf(id));
//        Organizator organizator = organizatorForm.convert(organizatorji);
//
//        model.addAttribute("organizator", organizator);
//        return "organizator/organizatorform";
//    }
//
//    @RequestMapping("/organizator/new")
//    public String newProduct(Model model){
//        model.addAttribute("organizator", new Organizator());
//        return "organizator/organizatorform";
//    }
//
//    @RequestMapping(value = "/organizator", method = RequestMethod.POST)
//    public String saveOrUpdateProduct(@Valid Organizator organizator, BindingResult bindingResult){
//
//        if(bindingResult.hasErrors()){
//            return "organizator/organizatorform";
//        }
//
//        Organizatorji savedProduct =  organizatorServis.saveOrUpdateProductForm(organizator);
//
//        return "redirect:/organizator/showw/" + savedProduct.getId();
//    }
//
//    @RequestMapping("/organizator/delete/{id}")
//    public String delete(@PathVariable String id){
//    	organizatorServis.delete(Long.valueOf(id));
//        return "redirect:/organizator/listO";
//    }
//}
