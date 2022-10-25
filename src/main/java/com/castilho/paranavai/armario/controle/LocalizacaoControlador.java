/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.controle;

import com.castilho.paranavai.armario.modelo.Localizacao;
import com.castilho.paranavai.armario.servico.LocalizacaoServico;
import java.util.List;

/**
 *
 * @author Wesley
 */
public class LocalizacaoControlador {
    public static List<Localizacao> listarTodasLocalizacoes(){
        return LocalizacaoServico.buscarTodos();
    }
}
