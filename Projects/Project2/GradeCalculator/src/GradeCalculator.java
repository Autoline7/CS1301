/*
 * GradeCalculator.java
 * Author: DIEGO SANCHEZ-CARAPIA
 * Submission Date:  2/11/2024
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 What the program does is that it determines what the users current grade
 is and if not all scores are available can let the user know what they will
 need to pass the class with a certain grade. Also, if any inputs are invalid
 it will end the program and let the user know.

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
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Grading Scale:\nA\t90 - 100" +
                "\nB\t80 - 89\nC\t70 - 79\nD\t60 - 69\nF\tbelow 60" +
                "\nWhat letter grade do you want to achieve for the course?");
        String wantedGrade = input.nextLine();
        if(!wantedGrade.equalsIgnoreCase("a") && !wantedGrade.equalsIgnoreCase("b") && !wantedGrade.equalsIgnoreCase("c") && !wantedGrade.equalsIgnoreCase("d") && !wantedGrade.equalsIgnoreCase("f")){
            System.out.println("This input is invalid.");
            System.exit(0);
        }
        System.out.print("Enter percentage weights below.\nExam 1:\t\t\t\t");
        int exOnePer = input.nextInt();
        System.out.print("Exam 2:\t\t\t\t");
        int exTwoPer = input.nextInt();
        System.out.print("Final Exam:\t\t\t");
        int finalPer = input.nextInt();
        System.out.print("Labs:\t\t\t\t");
        int labPer = input.nextInt();
        System.out.print("Projects:\t\t\t");
        int projPer = input.nextInt();
        System.out.print("Participation:\t\t");
        int partPer = input.nextInt();
        System.out.print("Quizzes:\t\t\t");
        int quizPer = input.nextInt();

        if(exOnePer+exTwoPer+finalPer+labPer+projPer+partPer+quizPer != 100){
            System.out.println("Weights don’t add up to 100, program exiting...");
            System.exit(0);
        }
        System.out.print("Do you know your exam 1 score?");
        String exOneAns = input.next();

        double exOneScore = 0;
        int exOneScoreGiven = 0;
        double exTwoScore = 0;
        int exTwoScoreGiven = 0;
        double finalScore = 0;
        int finalScoreGiven = 0;
        double labScore = 0;
        int labScoreGiven = 0;
        double projScore = 0;
        int projScoreGiven = 0;
        double partScore = 0;
        int partScoreGiven = 0;
        double quizScore = 0;
        int quizScoreGiven = 0;
        if (exOneAns.equalsIgnoreCase("y") || exOneAns.equalsIgnoreCase("yes")){
            exOneScoreGiven ++;
            System.out.print("Score received on exam 1:");
            exOneScore = input.nextDouble();
            System.out.print("Do you know your exam 2 score?");
            String exTwoAns = input.next();

            if (exTwoAns.equalsIgnoreCase("y") || exTwoAns.equalsIgnoreCase("yes")) {
                exTwoScoreGiven++;
                System.out.print("Score received on exam 2:");
                exTwoScore = input.nextDouble();
                System.out.print("Do you know your final exam score?");
                String finalAns = input.next();
                if(finalAns.equalsIgnoreCase("y") || finalAns.equalsIgnoreCase("yes")){
                    finalScoreGiven++;
                    System.out.print("Score received on final exam:");
                    finalScore = input.nextDouble();
                }
            }
        }
        System.out.print("Do you know your lab average?");
        String labsAns = input.next();
        if(labsAns.equalsIgnoreCase("y") || labsAns.equalsIgnoreCase("yes")){
            labScoreGiven++;
            System.out.print("Average lab grade:");
            labScore = input.nextDouble();
        }

        System.out.print("Do you know your project average?");
        String projAns = input.next();
        if(projAns.equalsIgnoreCase("y") || projAns.equalsIgnoreCase("yes")){
            projScoreGiven++;
            System.out.print("Average project grade:");
            projScore = input.nextDouble();
        }
        System.out.print("Do you know your participation average?");
        String partAns = input.next();
        if(partAns.equalsIgnoreCase("y") || partAns.equalsIgnoreCase("yes")){
            partScoreGiven++;
            System.out.print("Average participation grade:");
            partScore = input.nextDouble();
        }

        System.out.print("Do you know your quiz average?");
        String quizAns = input.next();
        if(quizAns.equalsIgnoreCase("y") || quizAns.equalsIgnoreCase("yes")){
            quizScoreGiven++;
            System.out.print("Average quiz grade:");
            quizScore = input.nextDouble();
        }
        double currentGradeTop = (exOnePer * exOneScore + exTwoPer * exTwoScore + finalPer * finalScore + labPer * labScore + projPer * projScore + partPer * partScore + quizPer * quizScore);
        double currentGradeBottom = (exOnePer * exOneScoreGiven + exTwoPer * exTwoScoreGiven + finalPer * finalScoreGiven + labScoreGiven * labPer + projPer * projScoreGiven + partPer * partScoreGiven + quizPer * quizScoreGiven);
        double currentGrade = currentGradeTop/currentGradeBottom;
        System.out.printf("Current grade score:" + "%.2f", currentGrade);
        String gradeScore = "";
        if(currentGrade >= 90) {
            gradeScore = "A";
        } else if (currentGrade >=80) {
            gradeScore = "B";
        } else if (currentGrade >=70) {
            gradeScore = "C";
        } else if (currentGrade >= 60) {
            gradeScore = "D";
        }else {
            gradeScore = "F";
        }

        int wantedGradeAsNum = 0;
        if (wantedGrade.equalsIgnoreCase("A")){
            wantedGradeAsNum = 90;
        } else if (wantedGrade.equalsIgnoreCase("B")) {
            wantedGradeAsNum = 80;
        } else if (wantedGrade.equalsIgnoreCase("C")){
            wantedGradeAsNum = 70;
        } else if (wantedGrade.equalsIgnoreCase("D")) {
            wantedGradeAsNum = 60;
        }

        System.out.println("\nYour current letter grade:" + gradeScore);
        if(currentGradeBottom == 100) {
            if (wantedGrade.equalsIgnoreCase(gradeScore)){
                System.out.print("Congratulations! You received the " + wantedGrade.toUpperCase() + " that you wanted!");
            }
            else {
                System.out.print("Unfortunately, a grade of " + wantedGrade.toUpperCase() + " is not possible.");
            }
        }
        else {
            double avgToFinalGrade = (100 * wantedGradeAsNum - currentGradeTop) / (100 - currentGradeBottom);
            if (avgToFinalGrade <= 100 && avgToFinalGrade > 0){
                System.out.printf("In order to receive a grade of " + wantedGrade.toUpperCase() + ",\n" + "you need to score an average greater than" + "\nor equal to " + "%.2f" , avgToFinalGrade);
                System.out.print(" in the rest of the grade items.");
            } else if (avgToFinalGrade <= 0) {
                System.out.print("You will receive at least a grade of " + wantedGrade +".");
            } else {
                System.out.print("Unfortunately, a grade of " + wantedGrade.toUpperCase() + " is not possible.");
            }

        }


    }
}