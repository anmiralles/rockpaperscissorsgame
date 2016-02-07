/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rockpaperscissors;

import java.util.Random;

/**
 *
 * @author angelmiralles
 */
public class Player {

    /**
     * Method for player random choice
     * @return 
     */
    public Choice getRandomChoice(){
        Choice[] choices = Choice.values();
        Random randomChoice = new Random();
        int index = randomChoice.nextInt(choices.length);
        return choices[index];
     }
    
    /**
     * Method for player selected choice
     * @param selectedChoice
     * @return 
     */
    public Choice getSelectedChoice(Choice selectedChoice){
        return selectedChoice;
    }
}
