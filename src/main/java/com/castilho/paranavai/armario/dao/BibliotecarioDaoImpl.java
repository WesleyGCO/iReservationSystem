/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.dao;

import com.castilho.paranavai.armario.conexao.HibernateUtil;
import com.castilho.paranavai.armario.modelo.Bibliotecario;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Wesley
 */
public class BibliotecarioDaoImpl implements BibliotecarioDao {

    private Session sessao;

    public BibliotecarioDaoImpl() {
        this.sessao = HibernateUtil.getSession();
    }

    @Override
    public List<Bibliotecario> buscarTodos() {
        List<Bibliotecario> bibliotecarios = null;
        try {
            sessao.beginTransaction();
            bibliotecarios = (List<Bibliotecario>) this.sessao.createQuery("from Bibliotecario").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bibliotecarios;
    }

    @Override
    public Bibliotecario buscarPorId(Integer id) {
        Bibliotecario bibliotecario = null;
        try {
            sessao.beginTransaction();
            bibliotecario = (Bibliotecario) sessao.get(Bibliotecario.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bibliotecario;
    }

    @Override
    public void inserir(Bibliotecario bibliotecario) {
        try {
            sessao.beginTransaction();
            sessao.persist(bibliotecario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Bibliotecario bibliotecario) {
        try {
            sessao.beginTransaction();
            sessao.update(bibliotecario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Bibliotecario bibliotecario) {
        try {
            sessao.beginTransaction();
            sessao.delete(bibliotecario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
