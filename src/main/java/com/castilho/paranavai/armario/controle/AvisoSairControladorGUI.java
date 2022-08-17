
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.controle;

import com.castilho.paranavai.armario.visao.AvisoSairGUI;

/**
 *
 * @author Wesley
 */
public class AvisoSairControladorGUI {
    private final AvisoSairGUI visao;
    
    public AvisoSairControladorGUI(AvisoSairGUI visao){
        this.visao = visao;
    }
    
    public void abrirTelaAviso(){
        AvisoSairGUI abrirAviso = new AvisoSairGUI();
        abrirAviso.setVisible(true);
    }
    
    public void fecharTelaAviso(){
        AvisoSairGUI fecharAviso = new AvisoSairGUI();
        fecharAviso.setVisible(false);
    }
}
