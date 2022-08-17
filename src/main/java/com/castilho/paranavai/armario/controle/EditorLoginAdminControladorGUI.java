/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.controle;

import com.castilho.paranavai.armario.visao.EditorLoginAdminGUI;
import com.castilho.paranavai.armario.visao.EditorPrincipalGUI;
import com.castilho.paranavai.armario.visao.MenuAdminGUI;

/**
 *
 * @author Wesley
 */
public class EditorLoginAdminControladorGUI {
    private final EditorLoginAdminGUI visao;
    
    public EditorLoginAdminControladorGUI(EditorLoginAdminGUI visao){
        this.visao = visao;
    }
    
    public void navegarParaMenuAdmin(){
        MenuAdminGUI abrirMenuAdmin = new MenuAdminGUI();
        abrirMenuAdmin.setVisible(true);
    }
    
    public void navegarParaPrincipal(){
        EditorPrincipalGUI abrirPrincipal = new EditorPrincipalGUI();
        abrirPrincipal.setVisible(true);
    }
}