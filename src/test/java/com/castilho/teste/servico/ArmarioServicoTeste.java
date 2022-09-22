/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.teste.servico;

import com.castilho.paranavai.armario.modelo.Armario;
import com.castilho.paranavai.armario.servico.ArmarioServico;

/**
 *
 * @author Wesley
 */
public class ArmarioServicoTeste {
        public static void main(String[] args) {
            Armario local = new Armario("1", true, "armario pequeno");
            ArmarioServico.inserir(local);
        }
}
