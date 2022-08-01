/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.controle;

import com.castilho.paranavai.armario.visao.EditorPrincipalGUI;
import com.castilho.paranavai.armario.visao.IndexGUI;

/**
 *
 * @author Wesley
 */
public class IndexControlador {
    private final IndexGUI visao;
    
    public IndexControlador(IndexGUI visao){
        this.visao = visao;
    }
    
    public void navegarParaEditorPrincipal(){
        EditorPrincipalGUI abrirPrincipal = new EditorPrincipalGUI();
        abrirPrincipal.setVisible(true);
    }
    
    
}