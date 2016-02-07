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
public class RockPaperScissorsTest {
    
    public RockPaperScissorsTest() {
    }

    /**
     * Test of comparesChoices method, of class RockPaperScissors.
     */
    @Test
    public void testComparesChoices() {
        System.out.println("test for comparesChoices method");
        
        // Tie
        Choice player1Choice = Choice.PAPER;
        Choice player2Choice = Choice.PAPER;
        RockPaperScissors game = new RockPaperScissors();
        int expResult = 0;
        int result = game.comparesChoices(player1Choice, player2Choice);
        assertEquals(expResult, result);
        
        // Loose
        player1Choice = Choice.ROCK;
        expResult = -1;
        result = game.comparesChoices(player1Choice, player2Choice);
        assertEquals(expResult, result);
        
        // Win
        player2Choice = Choice.SCISSORS;
        expResult = 1;
        result = game.comparesChoices(player1Choice, player2Choice);
        assertEquals(expResult, result);
    }

    /**
     * Test of startGame method, of class RockPaperScissors.
     */
    @Test
    public void testStartGame() {
        System.out.println("Test for startGame method");
        RockPaperScissors game = new RockPaperScissors();
        game.startGame();
    }

    /**
     * Test of main method, of class RockPaperScissors.
     */
    @Test
    public void testMain() {
        System.out.println("Test for main method");
        String[] args = null;
        RockPaperScissors.main(args);
    }
    
}
