import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


class GameControllerTest {

    public GameController gameTest;

    @BeforeEach
    public void setup() {
        gameTest = new GameController();
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Michael Jackson", "Madonna", "Elvis Presley"));
        gameTest.setListOfPeopleToGuess(arrayList);
    }

    @Test
    void doesGameRecognizeHowManyRoundsHaveBeenPlayed() {
        gameTest.startGame();
        assertEquals(1, gameTest.getRoundsPlayed());
        gameTest.startGame();
        assertEquals(2, gameTest.getRoundsPlayed());
        gameTest.startGame();
        assertEquals(3, gameTest.getRoundsPlayed());
    }

    @Test
    void doesGameProvideNameToGuessWhenRoundStarts() {



    }


}