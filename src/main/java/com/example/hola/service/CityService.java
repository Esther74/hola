/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hola.service;

import com.example.hola.model.City;
import com.example.hola.repository.CityRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author soporte
 */

@Service
public class CityService implements ICityService{
    @Autowired
    private CityRepository repository;
    
    @Override
    public List<City> findAll(){
        List<City> cities = (List<City>) repository.findAll();
        return cities;
    }

    @Override
    public Optional<City> findById(Long id) {
        //throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
        Optional<City> city = repository.findById(id);
        return city;
    }
}
