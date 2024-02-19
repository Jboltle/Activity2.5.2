package Activity242.java.src;

import java.util.Scanner;

import javax.sound.sampled.Line;

public class Player
{
    public String player (String playerName ) {
        return playerName; 
    }
    public int setPoints(Integer points) {
        poits = 0;

    }
    public void getPoints (Integer points) {
         System.out.println(points);
    }
    public String getName(String inputName){
        return inputName;
    }
    public void setName(String inputName){
        System.out.println(inputName);
    }

    public Player(){


        System.out.println("Enter Player Name: ");
        Scanner sc = new Scanner(System.in);
        String newName = sc.nextLine();
        name = newName;
        System.out.println("Hello and welcome to the game, "  + name);
       }
       public Player (String inputName){
        String name = inputName;
        int points = 0;

       }
       
  /* your code here - attributes */

  /* your code here - constructor(s) */ 

  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}