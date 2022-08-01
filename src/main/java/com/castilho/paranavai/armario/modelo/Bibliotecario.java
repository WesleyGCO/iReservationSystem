/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.modelo;

import java.util.Date;
/**
 *
 * @author Wesley
 */
public class Bibliotecario extends Pessoa{
    private String siape;
    
    public Bibliotecario(){
    }
    
    public Bibliotecario(String siape, String nome, String email, String telefone, String senha, boolean ativo, Date dataAtualizacao, Date dataCriacao){
        super(nome, email, telefone, senha, ativo, dataAtualizacao, dataCriacao);
        this.siape = siape;
    }
}
