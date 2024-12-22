/*
 * StringFun.java
 * Author: DIEGO SANCHEZ-CARAPIA
 * Submission Date:  3/14/2024
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 What the program does is that it takes in a String from the user, then the user has
 a few different options what it can do then i created methods to make the program
 a lot more organized. Each method was a non-static method so i had to make an instantiation
 to use then methods and then use for loops and if statement to successfully make the method
 run currently.

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
public class StringFun{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringFun word = new StringFun();
        boolean isRunning = true;
        System.out.println("Enter the string to be manipulated");
        String origialString = input.nextLine();
        while (isRunning){
            System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
            String command = input.nextLine();
            if (command.equalsIgnoreCase("reverse")){
                String  ans = word.reverse(origialString);
                origialString = ans;
                System.out.println("The new sentence is: " + ans);
            }
            else if (command.equalsIgnoreCase("replace first") || command.equalsIgnoreCase("replace last")){
                System.out.println("Enter the character to replace");
                String oldLetter = input.nextLine();
                System.out.println("Enter the new character");
                String newLetter = input.nextLine();
                if (command.equalsIgnoreCase("replace first")){
                    origialString = word.replaceFirst(origialString, oldLetter, newLetter);
                } else {
                    origialString = word.replaceLast(origialString, oldLetter, newLetter);
                }

            }
            else if (command.equalsIgnoreCase("remove all")){
                System.out.println("Enter the character to remove");
                String rem = input.nextLine();
                origialString = word.removeAll(origialString, rem);
            }
            else if (command.equalsIgnoreCase("remove")){
                System.out.println("Enter the character to remove");
                String rem = input.nextLine();
                System.out.println("Enter the " + rem + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
                int posToDelete = Integer.parseInt(input.nextLine());
                origialString = word.remove(origialString, rem, posToDelete);
            }
            else if (command.equalsIgnoreCase("quit")){
                isRunning = false;
                System.exit(0);
            }
            else {
                System.out.println("Command invalid. Try again");
            }
        }



    }

    public String reverse(String str){
        String ans = "";
        for(int i = str.length(); i > 0; i --){
            ans += str.substring(i-1, i);
        }
        return ans;
    }

    public String replaceFirst(String str, String oldChar, String newChar){
        String ans = "";
        for(int i = 0; i < str.length(); i ++){
            if(str.substring(i,i +1).equals(oldChar)){
                ans += newChar + str.substring(i + 1);
                System.out.println("The new sentence is: " + ans);
                return ans;
            }
            else {
                ans += str.substring(i,i+1);
            }
            ;
        }
        System.out.println("The letter was not found in the word");
        return str;

    }

    public String replaceLast(String str, String oldChar, String newChar){
        for (int i = str.length()-1; i > 0; i --){
            if (str.substring(i,i +1).equalsIgnoreCase(oldChar)){
                str = str.substring(0,i) + newChar + str.substring(i + 1);
                System.out.println("The new sentence is: " + str);
                return str;
            }
        }
        return "not found";
    }

    public String removeAll(String str, String rem){
        String ans = "";
        for (int i = 0; i < str.length(); i ++){
            if (!str.substring(i,i +1).equalsIgnoreCase(rem)){
                ans += str.substring(i, i+1);
            }

        }
        System.out.println("The new sentence is: " + ans);
        return ans;
    }

    public String remove(String str, String rem, int pos){
        int count = 0;
        for (int i = 0; i < str.length(); i ++){ //count num for letter
            if(str.substring(i,i +1).equalsIgnoreCase(rem)){
                count++;
            }
        }
        if (count < pos ) {
            System.out.println("Error: the letter you are trying to remove does not exist");
        }
        count = 0;
        for (int i = 0; i < str.length(); i ++){
            if(str.substring(i,i +1).equalsIgnoreCase(rem)){
                count ++;
            }
            if (count == pos){
                str = str.substring(0, i) + str.substring(i+1);
                System.out.println("The new sentence is: " + str );
                return str;
            }
        }
        return str;
    }



}