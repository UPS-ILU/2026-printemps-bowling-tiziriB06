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
    
    @Test 
    void test_spare() {
         game.roll(7);
    	 game.roll(3);
    	 game.roll(4);
    	for ( int i = 0 ; i < 17 ; i++) { game.roll(0);}
    	assertEquals(18, game.score());
    	
    }
    
    @Test 
    void test_strike () {
    	game.roll(10);
    	game.roll(3);
    	game.roll(4);
    	for ( int i = 0 ; i < 16 ; i ++ ) {
    		game.roll(0);
    	}
    	assertEquals(24, game.score());
    }
    
    @Test 
    void test_cas_gnrl() {
    	int []lancers ={ 1, 2, 10, 0, 10,4, 2, 0, 10, 6, 2, 0, 10,6, 4, 8, 2, 2, 7};
    	
    	for (int nbQuilles : lancers ) {
    		game.roll(nbQuilles);
    	}
    	
    	assertEquals(122, game.score());
    }
    
    @Test
    void test_extension() {
    	int []lancers ={ 1, 2, 10, 0, 10,4, 2, 0, 10, 6, 2, 0, 10, 6, 4, 8, 2, 2, 8, 8};
    	
    	for (int nbQuilles : lancers ) {
    		game.roll(nbQuilles);
    	}
    	
    	assertEquals(131, game.score());
    }
    
    @Test 
    void test_génie() {
    	for( int i = 0 ; i < 12 ; i ++) {
    		game.roll(10);
    	}
    	assertEquals(300, game.score());
    }
}