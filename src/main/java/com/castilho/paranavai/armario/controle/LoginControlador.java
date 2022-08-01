/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.controle;

import com.castilho.paranavai.armario.servico.LoginServico;

/**
 *
 * @author Wesley
 */
public class LoginControlador {
    
    public static String verificaAluno(String email, String senha){
        return LoginServico.verificaAluno(email, senha);
    }
    
    public static String verificaAdmin(String email, String senha){
        return LoginServico.verificaAdmin(email, senha);
    }
}
