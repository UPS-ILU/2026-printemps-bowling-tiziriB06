package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
    Game game;

    @BeforeEach
    void setUp() {
        game = new Game(); 
    }

    
    @Test 
    void niveau1_entree_vide () {
    	assertEquals(0 , game.score());
    }
    
    @Test
    void niveau1_entree_20() {
        for (int i = 0; i < 20; i++) {
            game.roll(0); 
        }
        assertEquals(0, game.score()); 
    }
    

    @Test
    void niveau1_entree_20_sc_20() {
        for (int i = 0; i < 20; i++) {
            game.roll(1); 
        }
        assertEquals(20, game.score()); 
    }
    
    @Test
    void nivea1_scrore_30() {
    	for( int i  = 0 ; i<10 ; i ++) {
    		game.roll(1);
    	}
    	for(int j = 0 ; j < 10 ; j ++) {
    		game.roll(2);
    	}
    	assertEquals(30, game.score());
    }
}