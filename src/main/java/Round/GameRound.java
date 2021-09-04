package Round;

import PlayerInput.PlayerInputScanner;

import java.util.ArrayList;
import java.util.Collections;

public class GameRound {

    ArrayList<String> listOfPeopleToGuess;
    String wordToGuess = "";
    int numberOfWordsToGuess;
    int numberOfRemainingWordsToGuess;
    boolean roundOngoing;

    public GameRound(ArrayList<String> list){
        this.listOfPeopleToGuess = list;
        Collections.shuffle(this.listOfPeopleToGuess);
        this.numberOfWordsToGuess = list.size();
        this.numberOfRemainingWordsToGuess = this.numberOfWordsToGuess;
    }

    String getWordToGuess() {return wordToGuess;}

    public void updateNumberOfRemainingWordsToGuess() {
        this.numberOfRemainingWordsToGuess = listOfPeopleToGuess.size(); }

    void setListOfPeopleToGuess(ArrayList<String> listOfPeopleToGuess) {
        this.listOfPeopleToGuess = listOfPeopleToGuess;}

    void setWordToGuess(String wordToGuess) {
        this.wordToGuess = wordToGuess; }

    String getTopWordFromList() {
       return this.listOfPeopleToGuess.get(0);
    }

    void removeTopWordFromList() {
        this.listOfPeopleToGuess.remove(0);
    }

    void selectWordAndRemoveFromList() {
        setWordToGuess(getTopWordFromList());
        removeTopWordFromList();
        updateNumberOfRemainingWordsToGuess();
    }



    public void startRound() {
        System.out.println("remaining Names To Guess:  " + this.numberOfRemainingWordsToGuess);
        this.roundOngoing = true;

        while (this.numberOfRemainingWordsToGuess >= 1){
            this.selectWordAndRemoveFromList();

            System.out.println("Name to guess: " + this.getWordToGuess());
            System.out.println("Type anything for next Name");

            PlayerInputScanner input = new PlayerInputScanner();
            input.requestAndSavePlayerInput();
        }

        System.out.println("That's the end of the round! ");

        this.roundOngoing = false;
    }




}
