/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.controle;

import com.castilho.paranavai.armario.visao.EditorLoginAdminGUI;
import com.castilho.paranavai.armario.visao.ListagemEstudanteGUI;
import com.castilho.paranavai.armario.visao.MenuAdminGUI;

/**
 *
 * @author Wesley
 */
public class MenuAdminControladorGUI {
    private final MenuAdminGUI visao;
    
    public MenuAdminControladorGUI(MenuAdminGUI visao){
        this.visao = visao;
    }
    
    public void navegarParaLoginAdmin(){
        EditorLoginAdminGUI abrirLoginAdmin = new EditorLoginAdminGUI();
        abrirLoginAdmin.setVisible(true);
    }
    
    public void navegarParaListarAluno(){
        ListagemEstudanteGUI abrirListagemAluno = new ListagemEstudanteGUI();
        abrirListagemAluno.setVisible(true);
    }
}