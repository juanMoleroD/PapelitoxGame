package application;

import java.util.ArrayList;
import java.util.Collections;

public class GameRound {

    public ArrayList<String> getListOfPeopleToGuess() {
        return listOfPeopleToGuess;
    }

    public ArrayList<String> getListOfNamesInTheHat() {
        return listOfNamesInTheHat;
    }

    ArrayList<String> listOfPeopleToGuess;
    ArrayList<String> listOfNamesInTheHat;

    public GameRound(ArrayList<String> list){
        this.listOfPeopleToGuess = list;
    }

    public void setListOfNamesInTheHat(ArrayList<String> list){
        this.listOfNamesInTheHat = listOfPeopleToGuess;
    }

    public void shuffleHat(){
        Collections.shuffle(this.listOfNamesInTheHat);
    }

    void setListOfPeopleToGuess(ArrayList<String> listOfPeopleToGuess) {
        this.listOfPeopleToGuess = listOfPeopleToGuess;}



    public void startRound() {
        System.out.println("\n\n\n" + "Round Starting! \n");
        setListOfNamesInTheHat(listOfPeopleToGuess);
        shuffleHat();
        System.out.println("-------------------------------------------- "+ this.listOfNamesInTheHat);
        for (int i = 0; i < listOfNamesInTheHat.size(); i++) {
            System.out.println("Name on Papelito:\n" + listOfNamesInTheHat.get(i));
            System.out.println("\n" + "PRESS ENTER FOR NEXT");

            PlayerInputScanner input = new PlayerInputScanner();
            input.getInput();
        }

        System.out.println("Round finished!");

    }






}





