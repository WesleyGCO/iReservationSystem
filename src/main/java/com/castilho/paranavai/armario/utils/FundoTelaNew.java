/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.castilho.paranavai.armario.utils;

import com.castilho.paranavai.armario.visao.IndexGUI;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Wesley
 */
public class FundoTelaNew extends JPanel{
    private Image img;
    
    public FundoTelaNew(String img){
        this.img = new ImageIcon(img).getImage();
    }
    
    public void paintComponent(Graphics g){
        System.out.println(IndexGUI.class.getResource("/assets/biblioteca.jpg")); 
        Image img = Toolkit.getDefaultToolkit().getImage(IndexGUI.class.getResource("/assets/biblioteca.jpg")); 
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
}