/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.teste.servico;

import com.castilho.paranavai.armario.modelo.Pessoa;
import com.castilho.paranavai.armario.servico.PessoaServico;

/**
 *
 * @author Wesley
 */
public class PessoaServicoTeste {
        public static void main(String[] args) {
            Pessoa local = new Pessoa();
            PessoaServico.inserir(local);
        }
}
