/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.servico;

import com.castilho.paranavai.armario.modelo.Reserva;
import com.castilho.paranavai.armario.dao.ReservaDao;
import com.castilho.paranavai.armario.dao.ReservaDaoImpl;
import java.util.List;

/**
 *
 * @author Wesley
 */
public class ReservaServico {

    private static ReservaDao dao = new ReservaDaoImpl();

    public static List<Reserva> buscarTodos() {
        return dao.buscarTodos();
    }

    public static Reserva buscarPorId(Integer id) {
        return dao.buscarPorId(id);
    }

    public static void inserir(Reserva reserva) {
        dao.inserir(reserva);
    }

    public static void atualizar(Reserva reserva) {
        dao.atualizar(reserva);
    }

    public static void excluir(Reserva reserva) {
        dao.excluir(reserva);
    }
}
