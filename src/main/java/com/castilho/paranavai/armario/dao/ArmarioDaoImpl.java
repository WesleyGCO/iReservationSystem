/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.dao;

import com.castilho.paranavai.armario.conexao.HibernateUtil;
import com.castilho.paranavai.armario.modelo.Armario;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Wesley
 */
public class ArmarioDaoImpl implements ArmarioDao {

    private Session sessao;

    public ArmarioDaoImpl() {
        this.sessao = HibernateUtil.getSession();
    }

    @Override
    public List<Armario> buscarTodos() {
        List<Armario> armarios = null;
        try {
            sessao.beginTransaction();
            armarios = (List<Armario>) this.sessao.createQuery("from Armario").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return armarios;
    }

    @Override
    public Armario buscarPorId(Integer id) {
        Armario armario = null;
        try {
            sessao.beginTransaction();
            armario = (Armario) sessao.get(Armario.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return armario;
    }

    @Override
    public void inserir(Armario armario) {
        try {
            sessao.beginTransaction();
            sessao.persist(armario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Armario armario) {
        try {
            sessao.beginTransaction();
            sessao.update(armario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Armario armario) {
        try {
            sessao.beginTransaction();
            sessao.delete(armario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
