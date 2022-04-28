/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.controle;

import java.io.Serializable;
import java.util.Calendar;
import javax.ejb.ApplicationException;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author 20192PF.CC0170
 */
@Named(value = "controleIndex")
//@RequestScoped
//@SessionScoped
@ApplicationScoped
public class ControleIndex implements Serializable {

    private String ola;
    private Calendar dataSO;

    public ControleIndex() {

        System.out.println("Criou o controle index....");
        ola = "Seja bem vindo ao Java Server Faces";
        dataSO = Calendar.getInstance();

    }

    public String sobre() {
        return "sobre?faces-redirect=true";
    }

    public String index() {
        return "index?faces-redirect=true";
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

    /**
     * @return the dataSO
     */
    public Calendar getDataSO() {
        return dataSO;
    }

    /**
     * @param dataSO the dataSO to set
     */
    public void setDataSO(Calendar dataSO) {
        this.dataSO = dataSO;
    }

}
