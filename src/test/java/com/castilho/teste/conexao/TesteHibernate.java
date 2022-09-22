/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.teste.conexao;

// Importações
import com.castilho.paranavai.armario.conexao.HibernateUtil;
import com.castilho.paranavai.armario.modelo.Localizacao;
import org.hibernate.Session;

/**
 *
 * @author Wesley
 */
public class TesteHibernate {

    public static void main(String[] args) {
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        Localizacao local = new Localizacao("Biblioteca");
        sessao.save(local);
        sessao.getTransaction().commit();
        HibernateUtil.encerraSession();
    }
}
