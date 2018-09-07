//package com.praktikum.dogodki.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.praktikum.dogodki.baza.DogodekDao;
//
//@Controller
//public class DogodekController {
//    
////private  List<Dogodek> dogodek = new ArrayList<Dogodek>();
////	
////	@RequestMapping(value = { "/listDogodek" }, method = RequestMethod.GET)
////	public String dogodek(@RequestParam(value = "ime",required = false) String ime,@RequestParam(value = "priimek",required = false) String priimek , Model model) {
////		boolean obstaja= true;
////		String mail = (ime + "." + priimek + "domenaY.x");
////		Oseba nekdo = new Oseba(ime, priimek, mail);
////		
////		
////		@RequestMapping(value = {"/addDogodek"}, method = RequestMethod.GET)
////		public String dodajDogodek(
////				@RequestParam(value="naziv", required=true)String naziv,
////				@RequestParam(value="opis", required=false)String opis,
////				@RequestParam(value="lokacija", required=true)String lokacija,
////				@RequestParam(value="zacetek", required=true)String zacetek,
////				@RequestParam(value="trajanje", required=true)String trajanje,
////				@RequestParam(value="konecPrijav", required=true)String konecPrijav,
////				@RequestParam(value="konecOdjav", required=true)String konecOdjav,
////				@RequestParam(value="minOseb", required=true)int minOseb,
////				@RequestParam(value="maxOseb", required=false)int maxOseb,
////				@RequestParam(value="status", required=false)String status,
////				@RequestParam(value="potrebnoPovabilo", required=false)boolean potrebnoPovabilo 
////				)
////		{
////			dogodekDao.addDogodek(naziv, opis, lokacija, zacetek, trajanje, konecPrijav, 
////					konecOdjav, minOseb, maxOseb, status, potrebnoPovabilo);
////			return "listDogodek";
////		}
//	
//	
//	@RequestMapping(value = { "listDogodek" }, method = RequestMethod.GET)
//    public String getDogodke(Model model)
//    {
//        model.addAttribute("dogodek",DogodekDao.getVseDogodke());
//        return "listDogodek";
//    }
//    
////
////    private DogodekToDogodekForm dogodekToDogodekForm;
////
////    @Autowired
////    public void setDogodekToDogodekForm(DogodekToDogodekForm dogodekToDogodekForm) {
////        this.dogodekToDogodekForm = dogodekToDogodekForm;
////    }
////
////    @Autowired
////    public void setDogodekServis(DogodekServis dogodekServis) {
////        this.dogodekServis = dogodekServis;
////    }
////
////    @RequestMapping("/")
////    public String redirToList(){
////        return "redirect:/product/list";
////    }
////
////    @RequestMapping({"/product/list", "/product"})
////    public String listProducts(Model model){
////        model.addAttribute("dogodki", dogodekServis.listAll());
////        return "product/list";
////    }
////
////    @RequestMapping("/product/show/{id}")
////    public String getProduct(@PathVariable String id, Model model){
////        model.addAttribute("dogodki", dogodekServis.getById(Long.valueOf(id)));
////        return "product/show";
////    }
////
////    @RequestMapping("product/edit/{id}")
////    public String edit(@PathVariable String id, Model model){
////        Dogodki dogodki = dogodekServis.getById(Long.valueOf(id));
////        Dogodek dogodek = dogodekToDogodekForm.convert(dogodki);
////
////        model.addAttribute("dogodek", dogodek);
////        return "product/productform";
////    }
////
////    @RequestMapping("/product/new")
////    public String newProduct(Model model){
////        model.addAttribute("dogodek", new Dogodek());
////        return "product/productform";
////    }
////
////    @RequestMapping(value = "/product", method = RequestMethod.POST)
////    public String saveOrUpdateProduct(@Valid Dogodek dogodek, BindingResult bindingResult){
////
////        if(bindingResult.hasErrors()){
////            return "product/productform";
////        }
////
////        Dogodki savedProduct =  dogodekServis.saveOrUpdateProductForm(dogodek);
////
////        return "redirect:/product/show/" + savedProduct.getId();
////    }
////
////    @RequestMapping("/product/delete/{id}")
////    public String delete(@PathVariable String id){
////    	dogodekServis.delete(Long.valueOf(id));
////        return "redirect:/product/list";
////    }
//}
