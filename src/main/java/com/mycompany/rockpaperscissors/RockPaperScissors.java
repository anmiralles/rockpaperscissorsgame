/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rockpaperscissors;

/**
 *
 * @author angelmiralles
 */
public class RockPaperScissors {
    
    // Instances variables
    private Player player1;
    private Player player2;
    private int playerScore1;
    private int playerScore2;
    private int numberOfGames;
    
    public RockPaperScissors(){
        player1 = new Player();
        player2 = new Player();
        playerScore1 = 0;
        playerScore2 = 0;
        numberOfGames = 100;
    }
    
    public int comparesChoices(Choice player1Choice, Choice player2Choice){
        return 0;
    }
    
    public void startGame(){
        System.out.println("Start the game");
    }
    
    public static void main(String[] args){
        RockPaperScissors game  = new RockPaperScissors();
        game.startGame();
    }
}