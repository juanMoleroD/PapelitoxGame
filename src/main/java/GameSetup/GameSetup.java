package GameSetup;

import PlayerInput.PlayerInputScanner;

import java.util.ArrayList;
import java.util.Locale;

public class GameSetup {

    ArrayList<String> listOfNamesToGuess = new ArrayList<>();
    public int numberOfNamesPerPlayer;
    public char playerWantsRules;
    public String rules = "Teams of two take turns to guess from a pool of famous people. \n" +
            "There are 3 rounds which vary the type of hints you can provide: \n" +
            "Description: you can only describe the person with words. No gestures or Tones are allowed. \n" +
            "Mimic: you can only use mimic, no sound or lip-reading \n" +
            "One Word: Pretty self explanatory, no compound word EI WarLord. \n" +
            "Each team has 1 minute to get as many guesses as they can. Once all the names have been \n" +
            "guessed, The round finishes, points are tallied and you go to the next round. \n" +
            "Once the 3 round are up, you tally up all the point in the 3 rounds and \n" +
            "the team with more points wins.";


    public GameSetup(int numberOfNamesPerPlayer) {
        this.numberOfNamesPerPlayer = numberOfNamesPerPlayer;
    }


    public void setPlayerWantsRules(char playerWantsRules) {
        this.playerWantsRules = playerWantsRules;
    }

    public String welcome(){
        String welcome = "Welcome to Papelito!";
        System.out.println(welcome);
        return welcome;
    }

    public String getRules(){
        return this.rules;
    }

    public void offerRules(){
        System.out.println("Do you want to see the rules of the game? \n Y/N? ");
        updateRulesPreference();
        System.out.println(this.displayRules());
    }
    public String offerRules(char x) {
        System.out.println("Do you want to see the rules of the game? \n Y/N? ");

        updateRulesPreference(x);
        System.out.println(this.displayRules());
        return this.displayRules();
    }

    public void updateRulesPreference(){
        PlayerInputScanner input = new PlayerInputScanner();
        input.requestAndSavePlayerInput();
        char preference = input.getSavedPlayerInput().toUpperCase(Locale.ROOT).charAt(0);

        if (Character.toString(preference).equals("Y"))
            this.setPlayerWantsRules('Y');
        if (Character.toString(preference).equals("N"))
            this.setPlayerWantsRules('N');
    }

    private void updateRulesPreference(char preference){
        this.playerWantsRules = preference;
    }

    public String displayRules() {
        if (this.playerWantsRules == 'Y') { return this.getRules(); }
        else return "";
    }

    public ArrayList<String> getListOfNamesToGuess(){
        return this.listOfNamesToGuess;
    }

    void addNameToGuessList(String name){
        listOfNamesToGuess.add(name);
    }

    private String getNameInput(){
        PlayerInputScanner input = new PlayerInputScanner();
        input.requestAndSavePlayerInput();
        return input.getSavedPlayerInput();
    }

    public void requestNameInputsUntilMax(){
        for (int i = 0; i < this.numberOfNamesPerPlayer; i++) {
            System.out.println("Add a name: ");
            addNameToGuessList(getNameInput());
        }
    }

}

