package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {

    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

    @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

    @Override
    public void display() {
        System.out.println("The house holds: ");
        System.out.println(this.game.getHouseCards().getCards());
        System.out.println("You hold: ");
        System.out.println(this.game.getYourCards().getCards());

        //FIX THIS
    }

    @Override
    public boolean hitMe() {
        //FIX THIS
        System.out.println("Do you want a Card?(y/n)");
        String str = user.nextLine();
        if (str.compareTo("y") == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void gameOver() {
        int houseScore = game.score(game.getHouseCards());
        int userScore = game.score(game.getYourCards());
       
        System.out.println("The house holds: ");
        System.out.println(this.game.getHouseCards().getCards());
        System.out.println("You hold: ");
        System.out.println(this.game.getYourCards().getCards());
        
        System.out.println("Final Score of House: " + Integer.toString(houseScore));
        System.out.println("Your Final Score: " + Integer.toString(userScore));
        if (userScore > 21) {
            System.out.println("You LOSE");
        } else if (userScore == houseScore) {
            System.out.println("You LOSE");
        } else if (houseScore > 21 || userScore > houseScore) {
            System.out.println("You WIN");
        } else {
            System.out.println("You LOSE");
        }
    }

}
