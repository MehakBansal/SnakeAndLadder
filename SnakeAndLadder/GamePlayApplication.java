package SnakeAndLadder;

import java.util.HashMap;

public class GamePlayApplication {
    public static void main (String args[]){
        HashMap<Integer,Integer> snakeMap=new HashMap<>();
        HashMap<Integer,Integer> ladderMap=new HashMap<>();
        snakeMap.put(24,8);
        snakeMap.put(56,18);
        ladderMap.put(10,40);
        ladderMap.put(32,88);
        SnakeAndLadderInitiator snakeAndLadderInitiator=
                new SnakeAndLadderInitiator(100,snakeMap,ladderMap,4,2);
        snakeAndLadderInitiator.playTurn();
    }
}
