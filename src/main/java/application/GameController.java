package application;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class GameController {
    private GameRound round;
    private GameSetup setup;


    private ArrayList<String> listOfNameInTheHat;

    public void startGame(){
        System.out.println("Welcome to Papelitox!");

        getSetup();
        setup.offerRules();
        setup.requestNameInputsUntilMax();
        this.setListOfNameInTheHat(setup.getListOfNamesToPutInHat());

        getRound(this.getListOfNamesInTheHat());

        for (int i = 0; i < 3; i++) round.startRound();

        System.out.println("------------------------------------ \n             That's All Folks!!!");
        System.out.println("             Thanks for playing");

    }


    public ArrayList<String> getListOfNamesInTheHat(){
        return this.listOfNameInTheHat;
    }

    public void setListOfNameInTheHat(ArrayList<String> listOfNameInTheHat) {
        this.listOfNameInTheHat = listOfNameInTheHat;
    }

    public GameRound getRound(ArrayList<String> ListOfNamesInTheHat) {
        return this.round = new GameRound(ListOfNamesInTheHat);
    }

    public void setRound(GameRound round) {
        this.round = round;
    }

    public GameSetup getSetup() {
        return this.setup = new GameSetup(3);
    }

    public void setSetup(GameSetup setup) {
        this.setup = setup;
    }
}
