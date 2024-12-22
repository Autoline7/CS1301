/*
 * RockPaperScissors.java
 * Author: DIEGO SANCHEZ-Carapia
 * Submission Date:  2/21/2024
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
	So in order to add a little more difficulty to myself for this lab I created a constructor
	so I can use the "this." so I can use it inside the "result" method (thats why
	the method is a non-static method). The result class checks what the result was
	between that one match and determines a loser or a winner. Then I ran into the problem of
	updating the score and saving it. So what I did was create 2 new methods that update the
	users score and computer score. I inserted this method inside the result method and then accessed
	these values finally again when printing. The program asks how many points someone needs to
	achieve until someone wins and then keeps score on the game rock, paper, scissors.




 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the School of Computing
 * at the University of Georgia. Any publishing or
 * posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the
 * School of Computing at the University of Georgia.
 */

import java.util.Scanner;

public class RockPaperScissors {
    public int userScore = 0;
    public int computerScore = 0;

    public RockPaperScissors(){
        this.userScore = 0;
        this.computerScore = 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RockPaperScissors game = new RockPaperScissors();

       System.out.print("Points to win: " );
       int pointsToWin = input.nextInt();
       while (game.computerScore < pointsToWin && game.userScore < pointsToWin){
           System.out.print("Rock, paper, or scissors? ");
           String userMove = input.next();
           if(userMove.equalsIgnoreCase("rock") || userMove.equalsIgnoreCase("paper") || userMove.equalsIgnoreCase("scissors")){
               String computerMove = ComputerOpponent.getMove();
               String output = game.result(userMove, computerMove);
               System.out.println("The computer chose " + computerMove + output + "(" + game.getUserScore() + "-" + game.getComputerScore() + ")");

           }
       }
       if (game.computerScore > game.userScore){
           System.out.print("Sorry, you lost. Better luck next time!");
       }
       else{
           System.out.print("Congratulations! You won!");
       }

    }

    public String result(String user, String computer){

        if (user.equalsIgnoreCase("rock") && computer.equalsIgnoreCase("scissors")){
            updateUserScore();
            return ", so you win! ";
        }
        else if (user.equalsIgnoreCase("rock") && computer.equalsIgnoreCase("paper")) {
            updateComputerScore();
            return ", so you lose.";
        } else if (user.equalsIgnoreCase("paper") && computer.equalsIgnoreCase("scissors")) {
            updateComputerScore();
            return ", so you lose.";
        } else if (user.equalsIgnoreCase("paper") && computer.equalsIgnoreCase("rock")) {
            updateUserScore();
            return ", so you win! ";
        } else if (user.equalsIgnoreCase("scissors") && computer.equalsIgnoreCase("rock")) {
            updateComputerScore();
            return ", so you lose.";
        } else if (user.equalsIgnoreCase("scissors") && computer.equalsIgnoreCase("paper")) {
            updateUserScore();
            return ", so you win! ";
        } else {
            return ", so it's a tie." ;
        }

    }

    public int getUserScore(){
        return this.userScore;
    }
    public int getComputerScore(){
        return this.computerScore;
    }
    public int updateComputerScore(){
        this.computerScore++;
        return this.computerScore;
    }
    public int updateUserScore(){
        this.userScore++;
        return this.userScore;
    }



}