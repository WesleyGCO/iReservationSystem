/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.modelo;

/**
 *
 * @author Wesley
 */
public class Armario {
    private String numero;
    private boolean ativo;
    private String observacoes;
    
    public Armario(){
    }
    
    public Armario(String numero, boolean ativo, String observacoes){
        this.numero = numero;
        this.ativo = ativo;
        this.observacoes = observacoes;
    }
}
