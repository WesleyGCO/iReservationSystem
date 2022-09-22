/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.teste.servico;

import com.castilho.paranavai.armario.modelo.Estudante;
import com.castilho.paranavai.armario.servico.EstudanteServico;

/**
 *
 * @author Wesley
 */
public class EstudanteServicoTeste {
        public static void main(String[] args) {
            Estudante local = new Estudante();
            EstudanteServico.inserir(local);
        }
}
