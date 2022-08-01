/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.controle;

import com.castilho.paranavai.armario.visao.EditorLoginAlunoGUI;
import com.castilho.paranavai.armario.visao.EfetuarDevolucaoGUI;
import com.castilho.paranavai.armario.visao.EfetuarEmprestimoGUI;
import com.castilho.paranavai.armario.visao.MenuAlunoGUI;

/**
 *
 * @author Wesley
 */
public class MenuAlunoControlador {
    private final MenuAlunoGUI visao;
    
    public MenuAlunoControlador(MenuAlunoGUI visao){
        this.visao = visao;
    }
    
    public void navegarParaLoginAluno(){
        EditorLoginAlunoGUI abrirLoginAluno = new EditorLoginAlunoGUI();
        abrirLoginAluno.setVisible(true);
    }
    
    public void navegarParaEfetuarEmprestimo(){
        EfetuarEmprestimoGUI abrirEmprestimo = new EfetuarEmprestimoGUI();
        abrirEmprestimo.setVisible(true);
    }
    
    public void navegarParaEfetuarDevolucao(){
        EfetuarDevolucaoGUI abrirDevolucao = new EfetuarDevolucaoGUI();
        abrirDevolucao.setVisible(true);
    }
}