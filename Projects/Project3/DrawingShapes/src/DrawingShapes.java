/*
 * DrawingShapes.java
 * Author: DIEGO SANCHEZ-CARAPIA
 * Submission Date:  3/18/2024
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 What the program does is that it asks the user what shape it would like to create
 from the given set, and then based on the response from the user it will create the
 shape and requests length and height for certain items. Then it will print the shape
 with the "*" character.

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

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DrawingShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a shape: r t h o p");
        String shapeGiven = input.nextLine();
        int shapeLength = 0;
        if(shapeGiven.equals("r") || shapeGiven.equals("t") || shapeGiven.equals("h") || shapeGiven.equals("o") || shapeGiven.equals("p")){
            System.out.println("Enter a length");
            shapeLength = Integer.parseInt(input.nextLine());
            if (shapeLength <= 1){
                System.out.print("Length must be greater than 1\nGoodbye!");
                System.exit(0);
            }
        }
        if (shapeGiven.equals("r")){
            System.out.println("Enter a height");
            int shapeHeight = Integer.parseInt(input.nextLine());
            if(shapeHeight <= 1){
                System.out.print("Height must be greater than 1\nGoodbye!");
                System.exit(0);
            }
            System.out.println("Below is a " + shapeLength + " by " + shapeHeight + " rectangle of *");
            rectangle(shapeLength, shapeHeight);
        } else if (shapeGiven.equals("t")) {
            System.out.print("Below is a triangle with two side lengths of " + shapeLength + " *");
            triangle(shapeLength);
        } else if (shapeGiven.equals("h")) {
            hexagon(shapeLength);
        } else if (shapeGiven.equals("o")) {
            octagon(shapeLength);
        } else if (shapeGiven.equals("p")) {
            pentagon(shapeLength);
        } else {
            System.out.print("Invalid shape\nGoodbye!");
        }

    }

    public static void rectangle(int length, int height){
        //System.out.println("Below is a " + length + " by " + 4 + " rectangle of *");
        for (int i = 0; i < height; i ++){
            for (int j = 0; j < length; j ++){
                System.out.print("*");
            }
          System.out.println();
        }
        /*This creates a rectangle. the inner for loop takes care of the length
        Since it prints towards the left for length amount of times then we enter a
        new line once all stars are printed.
         */
    }

    public static void triangle(int length){
        /*decreasing triangle of spaces
        for (int i = 0; i < length; i ++){
            for (int j = i; j < length; j ++){
                System.out.print(" ");
            }

            System.out.println();
        }
        //increasing triangle
        for (int i = 0; i < length; i ++){
            for (int j = 0; j < i; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
         */
        for (int i = 0; i <= length; i ++){
            for (int j = i; j < length; j ++){//decreasing triangle
                System.out.print(" ");
            }
            for (int k = 1; k < i; k ++){ // increasing triangle
                System.out.print("*");
            }
            for (int l = 0; l < i; l ++){ // increasing triangle
                System.out.print("*");
            }
                
            System.out.println("");
        }
    }

    public static void hexagon(int length){
        System.out.println("Below is a hexagon with side lengths of " +  length + " *");
        for(int i = 1; i < length; i++){
            for(int j = i; j < length; j++){//decreasing spaces
                System.out.print(" ");
            }
            for (int k = 0; k < i; k ++){//increasing stars
                System.out.print("*");
            }
            for (int l = 0; l < length-2; l++){//rectangle stars
                System.out.print("*");
            }
            for (int m = 0; m < i; m ++){//increasing stars
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i = 0; i < length; i ++){
            for (int j = 0; j < i; j++){//increasing spaces
                System.out.print(" ");
            }
            for (int k = i; k < length; k ++){//decreasing stars
                System.out.print("*");
            }
            for (int l = 0; l < length-2; l ++){//rectangle stars
                System.out.print("*");
            }
            for (int m = i; m < length; m ++){//decreasing stars
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void octagon(int length){
        System.out.println("Below is a octagon with side lengths of " +  length + " *");
        int count = 0;
        //top trapezoid of the octagon
        for(int i = 1; i < length; i++){
            for(int j = i; j < length; j++){//decreasing spaces
                System.out.print(" ");
            }
            for (int k = 0; k < i; k ++){//increasing stars
                System.out.print("*");
            }
            for (int l = 0; l < length-2; l++){//rectangle stars
                System.out.print("*");
            }
            for (int m = 0; m < i; m ++){//increasing stars
                System.out.print("*");
            }
            System.out.println("");
        }
        rectangle(length * 2 + (length-2), length);//creates the middle rect of octoagon

        //bottom trapezoid
        for(int i = 1; i < length; i ++){
            for (int j = 0; j < i; j++){//increasing spaces
                System.out.print(" ");
            }
            for (int k = i; k < length; k ++){//decreasing stars
                System.out.print("*");
            }
            for (int l = 0; l < length-2; l ++){//rectangle stars
                System.out.print("*");
            }
            for (int m = i; m < length; m ++){//decreasing stars
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pentagon(int length){
        System.out.print("Below is a pentagon with side lengths of " +  length + " *");
        triangle(length);//creates the top part of the equilateral triangle
        rectangle(2 * length -1, length-1);// creates the rec of the pentagon
    }


}