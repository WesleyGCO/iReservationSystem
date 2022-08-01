/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.controle;

import com.castilho.paranavai.armario.visao.EditorLoginAdminGUI;
import com.castilho.paranavai.armario.visao.EditorLoginAlunoGUI;
import com.castilho.paranavai.armario.visao.EditorPrincipalGUI;

/**
 *
 * @author Wesley
 */
public class EditorPrincipalControlador {
    private final EditorPrincipalGUI visao;
    
    public EditorPrincipalControlador(EditorPrincipalGUI visao){
        this.visao = visao;
    }
    
    public void navegarParaLoginAluno(){
        EditorLoginAlunoGUI abrirLoginAluno = new EditorLoginAlunoGUI();
        abrirLoginAluno.setVisible(true);
    }
    
    public void navegarParaLoginAdmin(){
        EditorLoginAdminGUI abrirLoginAdmin = new EditorLoginAdminGUI();
        abrirLoginAdmin.setVisible(true);
    }
}