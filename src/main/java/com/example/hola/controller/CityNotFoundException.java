/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hola.controller;

/**
 *
 * @author soporte
 */
public class CityNotFoundException extends RuntimeException{
    public CityNotFoundException() {
        super();
    }

    public CityNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public CityNotFoundException(final String message) {
        super(message);
    }

    public CityNotFoundException(final Throwable cause) {
        super(cause);
    }
    
}
