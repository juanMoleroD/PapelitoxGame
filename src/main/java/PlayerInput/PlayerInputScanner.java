package PlayerInput;

import java.util.Scanner;


public class PlayerInputScanner {
    private String output;

    public PlayerInputScanner(){
    }

    public PlayerInputScanner(String output){
        this.output = output;
    }

    public String getSavedPlayerInput() {
        return this.output;
    }

    public void requestAndSavePlayerInput() {
        Scanner scanner = new Scanner(System.in);
        this.output = scanner.nextLine();
    }
}
