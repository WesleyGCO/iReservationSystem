/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.teste.servico;

import com.castilho.paranavai.armario.modelo.Reserva;
import com.castilho.paranavai.armario.servico.ReservaServico;

/**
 *
 * @author Wesley
 */
public class ReservaServicoTeste {
        public static void main(String[] args) {
            Reserva local = new Reserva();
            ReservaServico.inserir(local);
        }
}
