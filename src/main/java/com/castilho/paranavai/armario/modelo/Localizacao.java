/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.modelo;

//Importações
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Wesley
 */

@Entity
@Table(name = "tb_localizacao")
public class Localizacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_localizacao", unique = true, nullable = false, length = 100)
    private Integer localizacaoId;
    
    @Column(name = "nome", unique = true, nullable = false, length = 100)
    private String nome;
    
    public Localizacao(){
    }
    
    public Localizacao(String nome){
        this.nome = nome;
    }
    
    public Integer getLocalizacaoId(){
        return localizacaoId;
    }
    
    public void setLocalizacaoId(Integer localizacaoId){
        this.localizacaoId = localizacaoId;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
}
