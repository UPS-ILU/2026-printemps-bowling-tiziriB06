package tdd;

public class Game {
	int totalScore = 0 ; 
	
    public void roll(int nbQuilles) {
    	totalScore += nbQuilles;
    }
 

    public int score() {
        return totalScore; 
      }
    } 