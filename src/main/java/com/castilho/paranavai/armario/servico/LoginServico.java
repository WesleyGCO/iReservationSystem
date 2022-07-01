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
    
    public static String verifica(String email, String senha){
        if(email.equals("admin@admin.com")){
            if(senha.equals("12345")){
                return "Sucesso no login";
            }
            return "Senha inválida";
        }
        return "E-mail inválido";
    }
}
