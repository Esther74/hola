/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hola.controller;

import com.example.hola.model.City;
import com.example.hola.service.ICityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author soporte
 */

@RestController //JSON
//@Controller

@RequestMapping("/showCities")public class MyController {
    
    @Autowired
    private ICityService cityService;
    
    @GetMapping("/todas")
    public List<City> muestraCities(){ //como JSON
    //public String findCities(Model model){    
    
        return cityService.findAll(); //como JSON
       
        //front end
        
        //List<City> cities = cityService.findAll();
        //model.addAttribute("cities", cities);
        //return "todas";
    }
    
    
    @GetMapping("/{id}")
    public City muestraCity(@PathVariable long id) { //JSON
    
        return cityService.findById(id)
          .orElseThrow(CityNotFoundException::new);
    }
    
    
}
