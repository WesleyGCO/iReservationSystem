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
    private String emailAdminValido = "admin@admin.com";
    private String emailAlunoValido = "user@user.com";
    private String senhaInvalida = "11111111111";
    private String senhaAdminValida = "12345";
    private String senhaAlunoValida = "67890";
    
    @Test
    public void autenticacaoAdminOk(){
        String respostaAdminOk = LoginControlador.verificaAdmin(emailAdminValido, senhaAdminValida);
        Assert.assertEquals("Sucesso no login", respostaAdminOk);
    }
    
    @Test
    public void emailAdminInvalido(){
        String respostaEmailAdmin = LoginControlador.verificaAdmin(emailInvalido, senhaAdminValida);
        Assert.assertEquals("E-mail inválido", respostaEmailAdmin);
    }
    
    @Test
    public void senhaAdminInvalida(){
        String respostaSenhaAdmin = LoginControlador.verificaAdmin(emailAdminValido, senhaInvalida);
        Assert.assertEquals("Senha inválida", respostaSenhaAdmin);
    }
    
    @Test
    public void autenticacaoAlunoOk(){
        String respostaAlunoOk = LoginControlador.verificaAluno(emailAlunoValido, senhaAlunoValida);
        Assert.assertEquals("Sucesso no login", respostaAlunoOk);
    }
    
    @Test
    public void emailAlunoInvalido(){
        String respostaEmailAluno = LoginControlador.verificaAluno(emailInvalido, senhaAlunoValida);
        Assert.assertEquals("E-mail inválido", respostaEmailAluno);
    }
    
    @Test
    public void senhaAlunoInvalida(){
        String respostaSenhaAluno = LoginControlador.verificaAluno(emailAlunoValido, senhaInvalida);
        Assert.assertEquals("Senha inválida", respostaSenhaAluno);
    }
    
}
