package SnakeAndLadder;

import java.util.HashMap;

public interface Jumper {

     void setPositionMap(HashMap<Integer,Integer> positionMap);
     int giveNextMove(int currentPosition);
}
