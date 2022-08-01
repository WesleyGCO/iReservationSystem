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
public class Reserva {
    private Pessoa pessoa;
    private Armario armario;
    private Date dataHoraDevolucao;
    private Date dataHoraEmprestimo;
    
    public Reserva(){
    }
    
    public Reserva(Pessoa pessoa, Armario armario, Date dataHoraDevolucao, Date dataHoraEmprestimo){
        this.pessoa = pessoa;
        this.armario = armario;
        this.dataHoraDevolucao = dataHoraDevolucao;
        this.dataHoraEmprestimo = dataHoraEmprestimo;
    }
}
