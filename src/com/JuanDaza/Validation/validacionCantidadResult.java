/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JuanDaza.Validation;

/**
 *
 * @author juand
 */
public class validacionCantidadResult {
    private String cantidad;
    private boolean errorCan;
        
    // se crea el constructor
    public validacionCantidadResult(String cantidad, boolean errorCan) {
        this.cantidad = cantidad;
        this.errorCan = errorCan;
    }
        
    //se crea el get de cada una de las variables
    public String getCantidad() {
        return cantidad;
    }
    public boolean getErrorCan() {
        return errorCan;
    }
}
