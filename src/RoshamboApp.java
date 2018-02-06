/*
Abduljabbar Shaamala
Lab Number 12
 */

import java.util.Scanner;

public class RoshamboApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        RockPlayer rockPlayer;
        RandomPlayer randomPlayer;
        Player opponentPlayer;

        //1.Display user prompt
        System.out.println("Please enter your name: ");
        //2.Get user name input
        String name = scan.next();
        //3.Select opponent prompt
        System.out.println("Please select Rock (1) or Random Player(2): ");

        //4.Get user opponent choice
        int playerType = scan.nextInt();
        if (playerType == 1) {
            opponentPlayer = new RockPlayer();
        } else {
            opponentPlayer = new RandomPlayer();
        }
        //5.Display user prompt for rock,paper,scissors
        System.out.println("Please select (R)ock,(P)aper,(S)cissor: ");
        //6.Get user game choice
        String thrown = scan.next();

        HumanPlayer humanPlayer = new HumanPlayer();
        humanPlayer.setName(name);
        humanPlayer.getThrown();





        //7. Display result of match
        System.out.println(gameResult(humanPlayer, opponentPlayer));
        //System.out.println(results);

    }

    public static String gameResult(Player humanPlayer,Player opponentPlayer){
        String results = null;
        if (humanPlayer == opponentPlayer)
            results = " Draw!";

        else if ((humanPlayer .equals(Roshambo.PAPER))&& (opponentPlayer.equals(Roshambo.ROCK))){
            results = humanPlayer.getName() + " Wins";}

        else if ((humanPlayer.equals(Roshambo.PAPER)) && (opponentPlayer.equals(Roshambo.SCISSOR))){
            results = humanPlayer.getName() + " Wins!";}

        else if ((humanPlayer.equals(Roshambo.SCISSOR))&& (opponentPlayer.equals( Roshambo.ROCK))){
            results = humanPlayer.getName() + " Wins";}
            else{
            results = humanPlayer.getName() + " Lose";}


        return results;
    }


}
