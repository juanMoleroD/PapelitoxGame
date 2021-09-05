package application;

import java.util.Scanner;

public class PlayerInputScanner {

    private Scanner scanner;

    public PlayerInputScanner(){
        this.scanner = new Scanner(System.in);
    }

    public String getInput(){
        return scanner.nextLine();
    }
}
