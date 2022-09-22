/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.dao;

import com.castilho.paranavai.armario.conexao.HibernateUtil;
import com.castilho.paranavai.armario.modelo.Pessoa;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Wesley
 */
public class PessoaDaoImpl implements PessoaDao {

    private Session sessao;

    public PessoaDaoImpl() {
        this.sessao = HibernateUtil.getSession();
    }

    @Override
    public List<Pessoa> buscarTodos() {
        List<Pessoa> pessoas = null;
        try {
            sessao.beginTransaction();
            pessoas = (List<Pessoa>) this.sessao.createQuery("from Pessoa").list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pessoas;
    }

    @Override
    public Pessoa buscarPorId(Integer id) {
        Pessoa pessoa = null;
        try {
            sessao.beginTransaction();
            pessoa = (Pessoa) sessao.get(Pessoa.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pessoa;
    }

    @Override
    public void inserir(Pessoa pessoa) {
        try {
            sessao.beginTransaction();
            sessao.persist(pessoa);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Pessoa pessoa) {
        try {
            sessao.beginTransaction();
            sessao.update(pessoa);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Pessoa pessoa) {
        try {
            sessao.beginTransaction();
            sessao.delete(pessoa);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
