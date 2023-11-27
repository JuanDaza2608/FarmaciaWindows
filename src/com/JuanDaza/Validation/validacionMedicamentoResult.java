/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JuanDaza.Validation;

/**
 *
 * @author juand
 */
public class validacionMedicamentoResult {
    
    private String medicamento;
    private boolean errorMed;
    
    public validacionMedicamentoResult(String medicamento, boolean errorMed) {
            this.medicamento = medicamento;
            this.errorMed = errorMed;
        }

        public String getMedicamento() {
            return medicamento;
        }

        public boolean getErrorMed() {
            return errorMed;
        }
    
}

