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
@Table(name = "tb_armario")
public class Armario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_armario", unique = true, nullable = false)
    private Integer armarioId;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private boolean ativo;

    @Column(nullable = false, length = 250)
    private String observacoes;

    public Armario() {
    }

    public Armario(String numero, boolean ativo, String observacoes) {
        this.numero = numero;
        this.ativo = ativo;
        this.observacoes = observacoes;
    }
}
