package tdd;

public class Game {
	int totalScore = 0 ; 
	private int [] rolls = new int [21];
	int currentScore = 0 ;
	
    public void roll(int nbQuilles) {
    	rolls[currentScore++] += nbQuilles;
    }
 

    public int score() {
       int totalScore = 0 ;
       int i = 0 ;
        for ( int manche = 0 ; manche < 10 ; manche ++) {
        	if( strike(i)) {
        		totalScore += 10 + rolls[i+1] + rolls[i+2];
        		i += 1;
        	}else if(spare(i)) {
        		totalScore += 10 + rolls[i+2];
        		i += 2;
        	}else  {
        		totalScore += rolls[i] + rolls[i+1];
            		i += 2;
        	}
        }
		return totalScore;
      }
    
    
    
    public boolean spare( int i ) {
    	return rolls[i] + rolls[i+ 1] == 10 ;
    }
    
    public boolean strike ( int i ) {
    	return rolls[i] == 10;
    }
    } 