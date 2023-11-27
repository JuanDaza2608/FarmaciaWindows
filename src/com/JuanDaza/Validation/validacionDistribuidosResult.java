/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JuanDaza.Validation;

/**
 *
 * @author juand
 */
public class validacionDistribuidosResult {
    private String distribuidor;
    private boolean errorDis;
    
    public validacionDistribuidosResult(String distribuidor, boolean errorDis) {
        this.distribuidor = distribuidor;
        
        this.errorDis = errorDis;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public boolean getErrorDis() {
        return errorDis;
    }
    
    
}
