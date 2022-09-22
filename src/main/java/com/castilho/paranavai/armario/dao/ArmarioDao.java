/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.dao;

import com.castilho.paranavai.armario.modelo.Armario;
import java.util.List;

/**
 *
 * @author Wesley
 */
public interface ArmarioDao {

    public List<Armario> buscarTodos();

    public Armario buscarPorId(Integer id);

    public void atualizar(Armario armario);

    public void excluir(Armario armario);

    public void inserir(Armario armario);
}
