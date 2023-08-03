/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstplatformer;

import javax.swing.JFrame;

/**
 *
 * @author tanya
 */
public class GameWindow {
    private JFrame jframe;
    
    public GameWindow(GamePanel gamePanel) {
    
        //create jframe object
        jframe = new JFrame();
        
        //set size of jframe
        //400 pixels wide, 400 pixels in height
        jframe.setSize(400, 400);
        
        //make it close when you hit the close button
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //add your game panel
        //needs to be before the set visible is true
        jframe.add(gamePanel);
        
        //spawn the window in the center of our screen
        jframe.setLocationRelativeTo(null);
        
        //make it visible
        //this should be at the bottom
        jframe.setVisible(true);
    }
    
}
