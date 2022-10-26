/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.teste.servico;

import com.castilho.paranavai.armario.modelo.Estudante;
import com.castilho.paranavai.armario.servico.EstudanteServico;
import java.util.Date;

/**
 *
 * @author Wesley
 */
public class EstudanteServicoTeste {
        public static void main(String[] args) {
            Estudante estudante1 = new Estudante("0000000000000001", "Leonardo Cantor", "user@user.br", "4499999999", "12345678", true, new Date(), new Date());
            Estudante estudante2 = new Estudante("0000000000000002", "Leonardo Cantor Junior", "user2@user.br", "448888888888", "1234", true, new Date(), new Date());
            EstudanteServico.inserir(estudante1);
            EstudanteServico.inserir(estudante2);
        }
}
