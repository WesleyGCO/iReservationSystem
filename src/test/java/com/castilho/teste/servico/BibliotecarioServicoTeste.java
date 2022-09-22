/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.teste.servico;

import com.castilho.paranavai.armario.modelo.Bibliotecario;
import com.castilho.paranavai.armario.servico.BibliotecarioServico;

/**
 *
 * @author Wesley
 */
public class BibliotecarioServicoTeste {
        public static void main(String[] args) {
            Bibliotecario local = new Bibliotecario();
            BibliotecarioServico.inserir(local);
        }
}
