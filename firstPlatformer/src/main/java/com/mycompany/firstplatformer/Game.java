/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstplatformer;

/**
 *
 * @author tanya
 */
public class Game {
    
    private GameWindow gameWindow;
    private GamePanel gamePanel;
            
    public Game() {
        
        //create the panel before the window
        //create new game panel object
        gamePanel = new GamePanel();
        
        //create game window object
        gameWindow = new GameWindow(gamePanel);
        
        //requests that the input focus
        //when a key is pressed it goes to the jframe
        gamePanel.requestFocus();
    }
    
}
