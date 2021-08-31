package Round;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GameRoundTest {

    public static GameRound roundTest;
    public static GameRound roundTestForLongArray;
    ArrayList<String> inputArrayList = new ArrayList<>(Arrays.asList("Michael Jackson", "Madonna", "Elvis Presley"));

    @BeforeEach
    void setup() {
        roundTest = new GameRound(inputArrayList);
        roundTestForLongArray= new GameRound(longArrayList);
    }

    @Test
    void doesRoundGetListOfNamesToGuess() {
        assertNotEquals(0, roundTest.listOfPeopleToGuess.size());
        System.out.println(roundTest.listOfPeopleToGuess);

    }

    @Test
    void doesFunctionRandomizeList() {
        assertEquals(roundTest.listOfPeopleToGuess.size(), inputArrayList.size(), "randomized list should have equal length");
        assertTrue(roundTest.listOfPeopleToGuess.contains(roundTest.listOfPeopleToGuess.get(1)),
                "Original list elements should be contained in new updated list");
    }

    @Test
    void doesRandomizerWordWithLargeArray() {

        assertEquals(roundTestForLongArray.listOfPeopleToGuess.size(), longArrayList.size(),
                "randomized list should have equal length");
        assertTrue(roundTestForLongArray.listOfPeopleToGuess.contains(longArrayList.get(1)),
                "Original list elements should be contained in new updated list");
    }
    @Test
    void doesGameRegisterTheTotalNumberOfWordsAndRemaining() {
        assertEquals(3, roundTest.numberOfWordsToGuess);
        assertEquals(120 ,roundTestForLongArray.numberOfWordsToGuess);
        assertEquals(3, roundTest.numberOfWordsToGuessRemaining);
        assertEquals(120, roundTestForLongArray.numberOfWordsToGuessRemaining);
    }

  /*  @Test
    void doesRoundChoosesWordAndRemovesItFromList() {
        String fistValueFromList = roundTest.listOfPeopleToGuess.get(0);
        roundTest.startRound();
        assertNotSame("", roundTest.getWordToGuess());
        assertEquals(fistValueFromList, roundTest.getWordToGuess() );
        assertTrue(roundTest.roundOngoing);
    }*/


    @Test
    void doesGameRegisterOnceAWordHasBeenGuessed() {

    }

    @Test
    void doesRoundStopOnceNoMoreWordsToGuess() {

    }








    ArrayList<String> longArrayList = new ArrayList<>(Arrays.asList(
            "Michael Jackson", "Madonna", "Elvis Presley", "Michael Jackson", "Madonna", "Elvis Presley",
            "Michael Jackson", "Madonna", "Elvis Presley", "Michael Jackson", "Madonna", "Elvis Presley",
            "Michael Jackson", "Madonna", "Elvis Presley", "Michael Jackson", "Madonna", "Elvis Presley",
            "Michael Jackson", "Madonna", "Elvis Presley", "Michael Jackson", "Madonna", "Elvis Presley",
            "Michael Jackson", "Madonna", "Elvis Presley", "Michael Jackson", "Madonna", "Elvis Presley",
            "Michael Jackson", "Madonna", "Elvis Presley", "Michael Jackson", "Madonna", "Elvis Presley",
            "Michael Jackson", "Madonna", "Elvis Presley", "Michael Jackson", "Madonna", "Elvis Presley",
            "Michael Jackson", "Madonna", "Elvis Presley", "Michael Jackson", "Madonna", "Elvis Presley",
            "Michael Jackson", "Madonna", "Elvis Presley", "Michael Jackson", "Madonna", "Elvis Presley",
            "Michael Jackson", "Madonna", "Elvis Presley", "Michael Jackson", "Madonna", "Elvis Presley",
            "Michael Jackson", "Madonna", "Elvis Presley", "Michael Jackson", "Madonna", "Elvis Presley",
            "Michael Jackson", "Madonna", "Elvis Presley", "Michael Jackson", "Madonna", "Elvis Presley",
            "Michael Jackson", "Madonna", "Elvis Presley", "Michael Jackson", "Madonna", "Elvis Presley",
            "Michael Jackson", "Madonna", "Elvis Presley", "Michael Jackson", "Madonna", "Elvis Presley",
            "Michael Jackson", "Madonna", "Elvis Presley", "Michael Jackson", "Madonna", "Elvis Presley",
            "Michael Jackson", "Madonna", "Elvis Presley", "Michael Jackson", "Madonna", "Elvis Presley",
            "Michael Jackson", "Madonna", "Elvis Presley", "Michael Jackson", "Madonna", "Elvis Presley",
            "Michael Jackson", "Madonna", "Elvis Presley", "Michael Jackson", "Madonna", "Elvis Presley",
            "Michael Jackson", "Madonna", "Elvis Presley", "Michael Jackson", "Madonna", "Elvis Presley",
            "Michael Jackson", "Madonna", "Elvis Presley", "Michael Jackson", "Madonna", "Elvis Presley"));

}