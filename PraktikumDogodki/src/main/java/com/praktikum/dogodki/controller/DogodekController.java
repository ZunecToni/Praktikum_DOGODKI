package com.praktikum.dogodki.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.praktikum.dogodki.baza.Dogodki;
import com.praktikum.dogodki.converters.DogodekToDogodekForm;
import com.praktikum.dogodki.entities.Dogodek;
import com.praktikum.dogodki.servis.DogodekServis;

import javax.validation.Valid;

/**
 * Created by jt on 1/10/17.
 */
@Controller
public class DogodekController {
    private DogodekServis dogodekServis;

    private DogodekToDogodekForm dogodekToDogodekForm;

    @Autowired
    public void setDogodekToDogodekForm(DogodekToDogodekForm dogodekToDogodekForm) {
        this.dogodekToDogodekForm = dogodekToDogodekForm;
    }

    @Autowired
    public void setDogodekServis(DogodekServis dogodekServis) {
        this.dogodekServis = dogodekServis;
    }

    @RequestMapping("/")
    public String redirToList(){
        return "redirect:/product/list";
    }

    @RequestMapping({"/product/list", "/product"})
    public String listProducts(Model model){
        model.addAttribute("dogodki", dogodekServis.listAll());
        return "product/list";
    }

    @RequestMapping("/product/show/{id}")
    public String getProduct(@PathVariable String id, Model model){
        model.addAttribute("dogodki", dogodekServis.getById(Long.valueOf(id)));
        return "product/show";
    }

    @RequestMapping("product/edit/{id}")
    public String edit(@PathVariable String id, Model model){
        Dogodki dogodki = dogodekServis.getById(Long.valueOf(id));
        Dogodek dogodek = dogodekToDogodekForm.convert(dogodki);

        model.addAttribute("dogodek", dogodek);
        return "product/productform";
    }

    @RequestMapping("/product/new")
    public String newProduct(Model model){
        model.addAttribute("dogodek", new Dogodek());
        return "product/productform";
    }

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public String saveOrUpdateProduct(@Valid Dogodek dogodek, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "product/productform";
        }

        Dogodki savedProduct =  dogodekServis.saveOrUpdateProductForm(dogodek);

        return "redirect:/product/show/" + savedProduct.getId();
    }

    @RequestMapping("/product/delete/{id}")
    public String delete(@PathVariable String id){
    	dogodekServis.delete(Long.valueOf(id));
        return "redirect:/product/list";
    }
}
