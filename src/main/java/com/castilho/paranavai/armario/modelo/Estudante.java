/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.modelo;

//Importações
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Wesley
 */
@Entity
@Table(name = "tb_estudante")
@PrimaryKeyJoinColumn(name = "pessoaId")
public class Estudante extends Pessoa {

    private Integer estudanteId;

    @Column(unique = true, nullable = false)
    private String ra;

    public Estudante() {
    }

    public Estudante(String ra, String nome, String email, String telefone, String senha, boolean ativo, Date dataAtualizacao, Date dataCriacao) {
        super(nome, email, telefone, senha, ativo, dataAtualizacao, dataCriacao);
        this.ra = ra;
    }

    public Integer getEstudanteId() {
        return estudanteId;
    }

    public void setEstudanteId(Integer estudanteId) {
        this.estudanteId = estudanteId;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    
    
}
