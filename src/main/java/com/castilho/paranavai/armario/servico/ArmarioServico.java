/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.servico;

import com.castilho.paranavai.armario.modelo.Armario;
import com.castilho.paranavai.armario.dao.ArmarioDao;
import com.castilho.paranavai.armario.dao.ArmarioDaoImpl;
import java.util.List;

/**
 *
 * @author Wesley
 */
public class ArmarioServico {

    private static ArmarioDao dao = new ArmarioDaoImpl();

    public static List<Armario> buscarTodos() {
        return dao.buscarTodos();
    }

    public static Armario buscarPorId(Integer id) {
        return dao.buscarPorId(id);
    }

    public static void inserir(Armario armario) {
        dao.inserir(armario);
    }

    public static void atualizar(Armario armario) {
        dao.atualizar(armario);
    }

    public static void excluir(Armario armario) {
        dao.excluir(armario);
    }
}
