/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hola;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author soporte
 */

@RestController
public class HolaController {
    
    @GetMapping("/")
    public String hello(@RequestParam(value="name", defaultValue="mundo") String nombre){
        return String.format("Hola %s", nombre);
        //https://localhost:8080/?name=Esther
    }
    
}
