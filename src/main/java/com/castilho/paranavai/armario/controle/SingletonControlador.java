/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.controle;

/**
 *
 * @author Wesley
 */
public class SingletonControlador {
    private static SingletonControlador singleton;
    
    private SingletonControlador(){
    }
    
    public static SingletonControlador getInstance(){
        
        if(singleton == null){
            singleton = new SingletonControlador();
        }
        
        return singleton;
    }
}
