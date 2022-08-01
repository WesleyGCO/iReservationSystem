package com.castilho.paranavai.armario.utils;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Wesley
 */
public class FundoTelaOld extends JFrame{
    
    Image bImage;
    
    public FundoTelaOld(String path){
        this.bImage = this.createImage(path);
        this.initComponents();
    }
    
    public void initComponents(){
        super.setContentPane(new NewContentPane());
        super.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    private Image createImage(String path){
        return Toolkit.getDefaultToolkit().createImage(path);
    }
    
    private class NewContentPane extends JPanel{
        @Override
        protected void paintComponent(final Graphics g){
        super.paintComponent(g);
        g.drawImage(bImage, 0, 0, this);
        }
    }
    
}