/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.servico;

import com.castilho.paranavai.armario.modelo.Pessoa;
import com.castilho.paranavai.armario.dao.PessoaDao;
import com.castilho.paranavai.armario.dao.PessoaDaoImpl;
import java.util.List;

/**
 *
 * @author Wesley
 */
public class PessoaServico {

    private static PessoaDao dao = new PessoaDaoImpl();

    public static List<Pessoa> buscarTodos() {
        return dao.buscarTodos();
    }

    public static Pessoa buscarPorId(Integer id) {
        return dao.buscarPorId(id);
    }

    public static void inserir(Pessoa pessoa) {
        dao.inserir(pessoa);
    }

    public static void atualizar(Pessoa pessoa) {
        dao.atualizar(pessoa);
    }

    public static void excluir(Pessoa pessoa) {
        dao.excluir(pessoa);
    }
}
