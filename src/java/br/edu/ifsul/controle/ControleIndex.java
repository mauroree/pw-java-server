/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.controle;

import java.io.Serializable;
import javax.inject.Named;

/**
 *
 * @author 20192PF.CC0170
 */
@Named(value = "controleIndex")
public class ControleIndex implements Serializable {
    
    private String ola;
    
    public ControleIndex () {
       ola = "Seja bem vindo ao Java Server Faces";
        
    }

    /**
     * @return the ola
     */
    public String getOla() {
        return ola;
    }

    /**
     * @param ola the ola to set
     */
    public void setOla(String ola) {
        this.ola = ola;
    }
    
    
}
