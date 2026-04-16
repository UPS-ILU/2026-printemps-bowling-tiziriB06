package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
    Game game;

    @BeforeEach
    void init() {
        game = new Game(); // On crée une nouvelle partie avant chaque test [cite: 1926, 1928]
    }

    @Test
    void test_aucune_quille() {
        for (int i = 0; i < 20; i++) {
            game.roll(0); // On lance 20 boules dans le caniveau [cite: 1937, 1939]
        }
        assertEquals(0, game.score()); // Le score doit être 0 [cite: 1941]
    }
}