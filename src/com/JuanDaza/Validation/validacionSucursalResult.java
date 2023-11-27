/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JuanDaza.Validation;

/**
 *
 * @author juand
 */
public class validacionSucursalResult {
    private String sucursal;
    private boolean errorSuc;

    public validacionSucursalResult(String sucursal, boolean errorSuc) {
        this.sucursal = sucursal;
        this.errorSuc = errorSuc;
    }

    public String getSucursal() {
        return sucursal;
    }

    public boolean getErrorSuc() {
        return errorSuc;
    }
    
    
}
