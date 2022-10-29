package SnakeAndLadder;

import java.util.*;

public class SnakeAndLadderInitiator {

    Jumper snake;
    Jumper ladder;
    List<Integer> gameboard;
    Queue<Player> players;
    Dice dice;

    public SnakeAndLadderInitiator(int size, HashMap<Integer,Integer> snake,
                                   HashMap<Integer,Integer> ladder,int numOfPlayers,int numOfDice){
        this.gameboard=new ArrayList<>();
        for(int i=1;i<=size;i++){
            this.gameboard.add(i);
        }
        this.snake=new Snake();
        this.ladder=new Ladder();
        this.snake.setPositionMap(snake);
        this.ladder.setPositionMap(ladder);
        this.players=new LinkedList<>();
        for(int i=1;i<=numOfPlayers;i++){
            this.players.add(new Player(i,1));
        }
        this.dice=new Dice(numOfDice);
    }

    public void playTurn(){
        while(true){
            Player currentPlayer=this.players.peek();
            int nextMove=currentPlayer.currentPosition+this.dice.rollDice();
            if(nextMove==this.gameboard.size()){
                System.out.println("player "+currentPlayer.id+"has won the game,position-->"+nextMove);
                break;
            }
            else if(nextMove>this.gameboard.size()){
                System.out.println("player can not move,move position-->"+nextMove);
            }
            else{
                if(this.snake.giveNextMove(nextMove)!=-1){
                    currentPlayer.setCurrentPosition(snake.giveNextMove(nextMove));
                    System.out.println("snake eats ,player--->"+currentPlayer.id +"moved to-->"+currentPlayer.getCurrentPosition());
                }
                else if(this.ladder.giveNextMove(nextMove)!=-1){
                    currentPlayer.setCurrentPosition(ladder.giveNextMove(nextMove));
                    System.out.println("ladder jump,player--->"+currentPlayer.id +"moved to-->"+currentPlayer.getCurrentPosition());
                }
                else{
                    currentPlayer.setCurrentPosition(nextMove);
                    System.out.println("player--->"+currentPlayer.id +"moved to-->"+currentPlayer.getCurrentPosition());
                }
            }
            this.players.poll();
            this.players.add(currentPlayer);
        }


    }

}
