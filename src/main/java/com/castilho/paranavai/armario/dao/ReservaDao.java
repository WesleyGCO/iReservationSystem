/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.dao;

import java.util.List;
import com.castilho.paranavai.armario.modelo.Reserva;

/**
 *
 * @author Wesley
 */
public interface ReservaDao {

    public List<Reserva> buscarTodos();

    public Reserva buscarPorId(Integer id);

    public void inserir(Reserva reserva);

    public void atualizar(Reserva reserva);

    public void excluir(Reserva reserva);
}
