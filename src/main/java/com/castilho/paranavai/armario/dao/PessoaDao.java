/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.dao;

import java.util.List;
import com.castilho.paranavai.armario.modelo.Pessoa;

/**
 *
 * @author Wesley
 */
public interface PessoaDao {

    public List<Pessoa> buscarTodos();

    public Pessoa buscarPorId(Integer id);

    public void inserir(Pessoa pessoa);

    public void atualizar(Pessoa pessoa);

    public void excluir(Pessoa pessoa); 
}
