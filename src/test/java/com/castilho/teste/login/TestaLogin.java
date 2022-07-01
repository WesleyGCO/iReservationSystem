/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.teste.login;

/*Importação*/
import com.castilho.paranavai.armario.controle.LoginControlador;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Wesley
 */
public class TestaLogin {
    private String emailInvalido = "olaolaola@ola.com";
    private String emailValido = "admin@admin.com";
    private String senhaInvalida = "11111111111";
    private String senhaValida = "12345";
    
    @Test
    public void autenticacaoOk(){
        String respostaOk = LoginControlador.verifica(emailValido, senhaValida);
        Assert.assertEquals("Sucesso no login", respostaOk);
    }
    
    @Test
    public void emailInvalido(){
        String respostaEmail = LoginControlador.verifica(emailInvalido, senhaValida);
        Assert.assertEquals("E-mail inválido", respostaEmail);
    }
    
    @Test
    public void senhaInvalida(){
        String respostaSenha = LoginControlador.verifica(emailValido, senhaInvalida);
        Assert.assertEquals("Senha inválida", respostaSenha);
    }
}
