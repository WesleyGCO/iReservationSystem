/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.dao;

import java.util.List;
import com.castilho.paranavai.armario.modelo.Bibliotecario;

/**
 *
 * @author Wesley
 */
public interface BibliotecarioDao {

    public List<Bibliotecario> buscarTodos();

    public Bibliotecario buscarPorId(Integer id);

    public void inserir(Bibliotecario bibliotecario);

    public void atualizar(Bibliotecario bibliotecario);

    public void excluir(Bibliotecario bibliotecario);
}
