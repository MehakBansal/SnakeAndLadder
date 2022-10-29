package SnakeAndLadder;// of java.lang.Math.random() method
import java.lang.Math;

class Dice {

     int numberOfDice;
    // driver code
   public Dice(int numberOfDice){
       this.numberOfDice=numberOfDice;
   }

   public int rollDice() {
//       for(int i=0;i<6;i++ ){
//           System.out.println( (int)(Math.random()*numberOfDice*6-Math.random()*numberOfDice*1)+1);
//       }
       return (int)(Math.random()*numberOfDice*6-Math.random()*numberOfDice*1)+1;
   }
}
