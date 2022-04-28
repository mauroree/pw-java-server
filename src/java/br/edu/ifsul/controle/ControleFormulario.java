/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.controle;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author 20192PF.CC0170
 */
@Named(value = "controleFormulario")
@RequestScoped
public class ControleFormulario implements Serializable {

    private String nome;
    private String funcao;
    private String ativo;

    public ControleFormulario() {

    }

    public String formulario() {

        return "formulario?faces-redirect=true";
    }

    public String processar() {

        return "dados?faces-redirect=true";
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     * @return the ativo
     */
    public String getAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

}
