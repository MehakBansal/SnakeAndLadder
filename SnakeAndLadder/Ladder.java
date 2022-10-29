package SnakeAndLadder;

import java.util.HashMap;

public class Ladder implements Jumper{
    HashMap<Integer, Integer> positionMap;

    @Override
    public void setPositionMap(HashMap<Integer, Integer> positionMap) {
        this.positionMap=positionMap;
    }

    @Override
    public int giveNextMove(int currentPosition) {
        if(this.positionMap.containsKey(currentPosition)){
            return this.positionMap.get(currentPosition);
        }
        return -1;
    }
}
