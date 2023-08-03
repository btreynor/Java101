/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstplatformer;

import com.mycompany.firstplatformer.inputs.KeyboardInputs;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author tanya
 */
public class GamePanel extends JPanel {
    
    //set up your constructor
    //game panel is the picture
    //jframe is the frame
    public GamePanel() {
        
        //adding keyboard inputs
        addKeyListener(new KeyboardInputs());
            
        
    }
    
    //paint component is called when we press play button
    //takes care of any drawing we might 
    //have made but only if we create this method
    //graphics is how you draw
    //we use graphics as input so we can draw
    public void paintComponent(Graphics g) {
        
        //calls superclass jcomponent's paintcomponents
        //we use it so there isnt any glitching
        //its like a cleaning surface so nothing comes over from
        //previous frame
        super.paintComponent(g);
        
        //draw something, like a rectangle
        g.fillRect(100, 100, 200, 50);
    }
    
    
    
}
