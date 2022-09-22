/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.teste.servico;

import com.castilho.paranavai.armario.modelo.Localizacao;
import com.castilho.paranavai.armario.servico.LocalizacaoServico;

/**
 *
 * @author Wesley
 */
public class LocalizacaoServicoTeste {
        public static void main(String[] args) {
            Localizacao local = new Localizacao("Biblioteca");
            LocalizacaoServico.excluir(local);
        }
}
