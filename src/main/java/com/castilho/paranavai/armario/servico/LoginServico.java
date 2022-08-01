/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.servico;

/**
 *
 * @author Wesley
 */
public class LoginServico {
    
    public static String verificaAdmin(String email, String senha){
        if(email.equals("admin@admin.com")){
            if(senha.equals("12345")){
                return "Sucesso no login";
            }
            return "Senha inválida";
        }
        return "E-mail inválido";
    }
    
    public static String verificaAluno(String email, String senha){
        if(email.equals("user@user.com")){
            if(senha.equals("67890")){
                return "Sucesso no login";
            }
            return "Senha inválida";
        }
        return "E-mail inválido";
    }
}
