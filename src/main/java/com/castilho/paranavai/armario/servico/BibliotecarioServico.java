/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.servico;

import com.castilho.paranavai.armario.modelo.Bibliotecario;
import com.castilho.paranavai.armario.dao.BibliotecarioDao;
import com.castilho.paranavai.armario.dao.BibliotecarioDaoImpl;
import java.util.List;

/**
 *
 * @author Wesley
 */

public class BibliotecarioServico {
	
	private static BibliotecarioDao dao = new BibliotecarioDaoImpl();
	
	public static List<Bibliotecario> buscarTodos() {
		return dao.buscarTodos();
	}
	
	public static Bibliotecario buscarPorId(Integer id) {
		return dao.buscarPorId(id);
	}
	
	public static void inserir(Bibliotecario bibliotecario){
		dao.inserir(bibliotecario);
	}
	
	public static void atualizar(Bibliotecario bibliotecario){
		dao.atualizar(bibliotecario);
	}
	
	public static void excluir(Bibliotecario bibliotecario) {
		dao.excluir(bibliotecario);
	}
}
