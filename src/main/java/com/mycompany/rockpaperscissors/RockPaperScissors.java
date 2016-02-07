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
    private int player1Score;
    private int player2Score;
    private int numberOfGames;
    
    public RockPaperScissors(){
        player1 = new Player();
        player2 = new Player();
        player1Score = 0;
        player2Score = 0;
        numberOfGames = 100;
    }
    
    /**
     * Method for comparing the players choices
     * @param player1Choice
     * @param player2Choice
     * @return 
     */
    public int comparesChoices(Choice player1Choice, Choice player2Choice){
        if(player1Choice == player2Choice)
            return 0;
        
        switch(player1Choice){
            case ROCK:
                return (player2Choice == Choice.SCISSORS ? 1 : -1);
            case PAPER:
                return (player2Choice == Choice.ROCK ? 1 : -1);
            case SCISSORS:
                return (player2Choice == Choice.PAPER ? 1 : -1);
        }
        
        return 0;
    }
    
    /**
     * Method for contolling the game
     */
    public void startGame(){
        System.out.println("Start the game");
        
        while(numberOfGames>0){
            
            // Get players choices
            Choice player1Choice = player1.getRandomChoice();
            Choice player2Choice = player2.getSelectedChoice(Choice.ROCK);
            
            // Compare choices
            int comparePlayersChoices =comparesChoices(player1Choice, player2Choice);
            
            // Count for win choices
            switch(comparePlayersChoices){
                case 0:
                    break;
                case 1:
                    player1Score++;
                    break;
                case -1:
                    player2Score++;
                    break;
            }
            
            numberOfGames--;
        }
        
        System.out.println("player1 wins: " + player1Score);
        System.out.println("player2 wins: " + player2Score);
        System.out.println("Tie: " + (100 - player1Score - player2Score));
        
        System.out.println("The game ends");
    }
    
    public static void main(String[] args){
        RockPaperScissors game  = new RockPaperScissors();
        game.startGame();
    }
}