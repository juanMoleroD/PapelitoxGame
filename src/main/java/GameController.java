import GameSetup.GameSetup;
import PlayerInput.PlayerInputScanner;
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

        PlayerInputScanner waitToStart = new PlayerInputScanner();
        waitToStart.requestAndSavePlayerInput();
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

        while (game.roundsPlayed < 3) {
            GameRound round = new GameRound(game.listOfPeopleToGuess);
            round.startRound();
            game.addOneRoundPlayed();
            System.out.println("end of loop:  " + game.roundsPlayed);
        }






    }



}
