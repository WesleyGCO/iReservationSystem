/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.servico;

import com.castilho.paranavai.armario.modelo.Localizacao;
import com.castilho.paranavai.armario.dao.LocalizacaoDao;
import com.castilho.paranavai.armario.dao.LocalizacaoDaoImpl;
import java.util.List;

/**
 *
 * @author Wesley
 */
public class LocalizacaoServico {

    private static LocalizacaoDao dao = new LocalizacaoDaoImpl();

    public static List<Localizacao> buscarTodos() {
        return dao.buscarTodos();
    }

    public static Localizacao buscarPorId(Integer id) {
        return dao.buscarPorId(id);
    }

    public static void inserir(Localizacao localizacao) {
        dao.inserir(localizacao);
    }

    public static void atualizar(Localizacao localizacao) {
        dao.atualizar(localizacao);
    }

    public static void excluir(Localizacao localizacao) {
        dao.excluir(localizacao);
    }
}
