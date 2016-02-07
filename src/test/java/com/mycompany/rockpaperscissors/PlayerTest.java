/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rockpaperscissors;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author angelmiralles
 */
public class PlayerTest {
    
    public PlayerTest() {
    }

    /**
     * Test of getRandomChoice method, of class Player.
     */
    @Test
    public void testGetRandomChoice() {
        System.out.println("Test for getRandomChoice.");
        Player player = new Player();
        Choice expResult = null;
        Choice result = player.getRandomChoice();
 
        switch(result){
            case ROCK:
                expResult = Choice.ROCK;
                assertEquals(expResult, result);
                break;
            case PAPER:
                expResult = Choice.PAPER;
                assertEquals(expResult, result);
                break;
            case SCISSORS:
                expResult = Choice.SCISSORS;
                assertEquals(expResult, result);
                break;
        }
        
    }

    /**
     * Test of getSelectedChoice method, of class Player.
     */
    @Test
    public void testGetSelectedChoice() {
        System.out.println("Test for getSelectedChoice");
        Player player = new Player();
        Choice expResult = Choice.ROCK;
        Choice result = player.getSelectedChoice(Choice.ROCK);
        assertEquals(expResult, result);
    }
    
}
