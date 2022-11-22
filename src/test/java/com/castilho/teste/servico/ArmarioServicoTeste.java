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
            Armario armario1 = new Armario("1", true, "armario pequeno");
            Armario armario2 = new Armario("2", true, "armario grande");
            Armario armario3 = new Armario("3", false, "armario médio");
            ArmarioServico.inserir(armario1);
            ArmarioServico.inserir(armario2);
            ArmarioServico.inserir(armario3);
        }
}
