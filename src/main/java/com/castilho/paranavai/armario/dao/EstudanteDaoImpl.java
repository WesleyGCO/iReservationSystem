/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.dao;

import com.castilho.paranavai.armario.conexao.HibernateUtil;
import com.castilho.paranavai.armario.modelo.Estudante;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Wesley
 */
public class EstudanteDaoImpl implements EstudanteDao {

    private Session sessao;

    public EstudanteDaoImpl() {
        this.sessao = HibernateUtil.getSession();
    }

    @Override
    public List<Estudante> buscarTodos() {
        List<Estudante> estudantes = null;
        try {
            sessao.beginTransaction();
            estudantes = (List<Estudante>) this.sessao.createQuery("from Estudante").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return estudantes;
    }

    @Override
    public Estudante buscarPorId(Integer id) {
        Estudante estudante = null;
        try {
            sessao.beginTransaction();
            estudante = (Estudante) sessao.get(Estudante.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return estudante;
    }

    @Override
    public void inserir(Estudante estudante) {
        try {
            sessao.beginTransaction();
            sessao.persist(estudante);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Estudante estudante) {
        try {
            sessao.beginTransaction();
            sessao.update(estudante);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Estudante estudante) {
        try {
            sessao.beginTransaction();
            sessao.delete(estudante);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
