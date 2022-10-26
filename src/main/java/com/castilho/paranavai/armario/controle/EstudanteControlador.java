/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.controle;

import com.castilho.paranavai.armario.modelo.Estudante;
import com.castilho.paranavai.armario.servico.EstudanteServico;
import java.util.List;

/**
 *
 * @author Wesley
 */
public class EstudanteControlador {
    public static List<Estudante> listarTodosEstudantes(){
        return EstudanteServico.buscarTodos();
    }
}
