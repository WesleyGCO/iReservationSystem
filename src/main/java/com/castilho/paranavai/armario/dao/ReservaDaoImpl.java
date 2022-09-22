/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.dao;

import com.castilho.paranavai.armario.conexao.HibernateUtil;
import com.castilho.paranavai.armario.modelo.Reserva;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Wesley
 */
public class ReservaDaoImpl implements ReservaDao {

    private Session sessao;

    public ReservaDaoImpl() {
        this.sessao = HibernateUtil.getSession();
    }

    @Override
    public List<Reserva> buscarTodos() {
        List<Reserva> reservas = null;
        try {
            sessao.beginTransaction();
            reservas = (List<Reserva>) this.sessao.createQuery("from Reserva").list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reservas;
    }

    @Override
    public Reserva buscarPorId(Integer id) {
        Reserva reserva = null;
        try {
            sessao.beginTransaction();
            reserva = (Reserva) sessao.get(Reserva.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reserva;
    }

    @Override
    public void inserir(Reserva reserva) {
        try {
            sessao.beginTransaction();
            sessao.persist(reserva);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Reserva reserva) {
        try {
            sessao.beginTransaction();
            sessao.update(reserva);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Reserva reserva) {
        try {
            sessao.beginTransaction();
            sessao.delete(reserva);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
