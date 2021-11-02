/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hola.service;

import com.example.hola.model.City;
import java.util.List;

/**
 *
 * @author soporte
 */
public interface ICityService {
    List<City> findAll();
}
