package GameSetup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameSetupTest {
    public static GameSetup setupTest;

    @BeforeEach
    public void setup(){
        setupTest = new GameSetup(3);
        setupTest.addNameToGuessList("Michael Jackson");
        setupTest.addNameToGuessList("Madonna");
        setupTest.addNameToGuessList("Elvis Presley");
    }

    @Test
    void welcome() {
        assertEquals("Welcome to Papelito!", setupTest.welcome(), "should say welcome");
    }

    @Test
    void doesGameProvideRules() {
        assertEquals("Teams of two take turns to guess from a pool of famous people. \n" +
                "There are 3 rounds which vary the type of hints you can provide: \n" +
                "Description: you can only describe the person with words. No gestures or Tones are allowed. \n" +
                "Mimic: you can only use mimic, no sound or lip-reading \n" +
                "One Word: Pretty self explanatory, no compound word EI WarLord. \n" +
                "Each team has 1 minute to get as many guesses as they can. Once all the names have been \n" +
                "guessed, The round finishes, points are tallied and you go to the next round. \n" +
                "Once the 3 round are up, you tally up all the point in the 3 rounds and \n" +
                "the team with more points wins.", setupTest.offerRules('Y'), "Should return the rules");
        assertEquals("", setupTest.offerRules('N'), "Should return N");
        assertEquals("", setupTest.offerRules('1'), "Should default to N");
        assertEquals("", setupTest.offerRules(','), "Should default to N");
    }

    @Test
    void doesGameRequestListOfPeopleToGuess(){
        List<String> testList = Stream.of("Michael Jackson", "Madonna", "Elvis Presley").collect(Collectors.toList());
        assertEquals(testList , setupTest.listOfNamesToGuess, "should show a list of names to guess");
    }

}