/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.controle;

import com.castilho.paranavai.armario.visao.EfetuarEmprestimoGUI;
import com.castilho.paranavai.armario.visao.MenuAlunoGUI;

/**
 *
 * @author Wesley
 */
public class EfetuarEmprestimoControladorGUI {
    private final EfetuarEmprestimoGUI visao;
    
    public EfetuarEmprestimoControladorGUI(EfetuarEmprestimoGUI visao){
        this.visao = visao;
    }
    
    public void navegarParaEmprestimoNovamente(){
        EfetuarEmprestimoGUI abrirEmprestimoNovamente = new EfetuarEmprestimoGUI();
        abrirEmprestimoNovamente.setVisible(true);
    }
}