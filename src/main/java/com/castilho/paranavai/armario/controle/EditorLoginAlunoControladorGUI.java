/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.controle;

import com.castilho.paranavai.armario.visao.EditorLoginAlunoGUI;
import com.castilho.paranavai.armario.visao.EditorPrincipalGUI;
import com.castilho.paranavai.armario.visao.MenuAlunoGUI;

/**
 *
 * @author Wesley
 */
public class EditorLoginAlunoControladorGUI {
    private final EditorLoginAlunoGUI visao;
    
    public EditorLoginAlunoControladorGUI(EditorLoginAlunoGUI visao){
        this.visao = visao;
    }
    
    public void navegarParaMenuAluno(){
        MenuAlunoGUI abrirMenuAluno = new MenuAlunoGUI();
        abrirMenuAluno.setVisible(true);
    }
    
    public void navegarParaPrincipal(){
        EditorPrincipalGUI abrirPrincipal = new EditorPrincipalGUI();
        abrirPrincipal.setVisible(true);
    }
}