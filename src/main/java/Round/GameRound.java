package Round;

import java.util.ArrayList;
import java.util.Collections;

public class GameRound {

    ArrayList<String> listOfPeopleToGuess = new ArrayList<>();
    String wordToGuess = "";
    int numberOfWordsToGuess;
    int numberOfWordsToGuessRemaining;
    boolean roundOngoing;

    public GameRound(ArrayList<String> list){
        this.listOfPeopleToGuess = list;
        Collections.shuffle(this.listOfPeopleToGuess);
        this.numberOfWordsToGuess = list.size();
        this.numberOfWordsToGuessRemaining = this.numberOfWordsToGuess;
    }

    String getWordToGuess() {return wordToGuess;}

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
    }





    void startRound() {
        this.roundOngoing = true;
        this.selectWordAndRemoveFromList();
    }



}
