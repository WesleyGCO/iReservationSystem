/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.dao;

import java.util.List;
import com.castilho.paranavai.armario.modelo.Localizacao;

/**
 *
 * @author Wesley
 */
public interface LocalizacaoDao {
    public List<Localizacao> buscarTodos();
    
    public Localizacao buscarPorId(Integer id);
    
    public void atualizar(Localizacao localizacao);
    
    public void excluir(Localizacao localizacao);
    
    public void inserir(Localizacao localizacao);
}
