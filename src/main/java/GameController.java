import GameSetup.GameSetup;
import Round.GameRound;

import java.util.ArrayList;


public class GameController {

    public GameController() {
    }

    ArrayList<String> listOfPeopleToGuess = new ArrayList<String>();
    int roundsPlayed = 0;

    int getRoundsPlayed() { return roundsPlayed; }
    void addOneRoundPlayed() { roundsPlayed++; }

    void setListOfPeopleToGuess(ArrayList<String> peopleToGuess) {
        this.listOfPeopleToGuess = peopleToGuess;
    }

    void startGame() {
        System.out.println("Type anything to start the game");

        addOneRoundPlayed();
        GameRound round = new GameRound(this.listOfPeopleToGuess);

    }



    // ______________MAIN_____________

    public static void main(String[] args) {
        GameController game = new GameController();
        GameSetup setup = new GameSetup(3);

        setup.welcome();
        setup.offerRules();
        setup.requestNameInputsUntilMax();
        game.setListOfPeopleToGuess(setup.getListOfNamesToGuess());
        game.startGame();

        GameRound round = new GameRound(game.listOfPeopleToGuess);

        //round.startRound();






    }



}
