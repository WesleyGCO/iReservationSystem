/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.servico;

import com.castilho.paranavai.armario.modelo.Estudante;
import com.castilho.paranavai.armario.dao.EstudanteDao;
import com.castilho.paranavai.armario.dao.EstudanteDaoImpl;
import java.util.List;

/**
 *
 * @author Wesley
 */
public class EstudanteServico {

    private static EstudanteDao dao = new EstudanteDaoImpl();

    public static List<Estudante> buscarTodos() {
        return dao.buscarTodos();
    }

    public static Estudante buscarPorId(Integer id) {
        return dao.buscarPorId(id);
    }

    public static void inserir(Estudante estudante) {
        dao.inserir(estudante);
    }

    public static void atualizar(Estudante estudante) {
        dao.atualizar(estudante);
    }

    public static void excluir(Estudante estudante) {
        dao.excluir(estudante);
    }
}
