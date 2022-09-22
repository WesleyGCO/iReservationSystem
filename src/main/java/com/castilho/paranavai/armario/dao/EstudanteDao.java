/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.dao;

import java.util.List;
import com.castilho.paranavai.armario.modelo.Estudante;

/**
 *
 * @author Wesley
 */
public interface EstudanteDao {

    public List<Estudante> buscarTodos();

    public Estudante buscarPorId(Integer id);

    public void atualizar(Estudante estudante);

    public void inserir(Estudante estudante);

    public void excluir(Estudante estudante);
}
