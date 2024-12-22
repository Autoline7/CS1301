/*
 * Adventure.java
 * Author: DIEGO SANCHEZ-CARAPIA
 * Submission Date:  4/8/2024
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 What the program does is that it contains the main method to start this program.
 First I started by creating a player and a map object to create the game
 I set up a while loop to continue the game until the player lost(eaten or finds a treasure)
 I used many of the methods created in the other classes to make this game work as expected.
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
public class Adventure {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Player p1 = new Player();
        Map map1 = new Map();
        System.out.println("Welcome to UGA Adventures: Episode I\n" +
                "The Adventure of the Cave of Redundancy Adventure\n" +
                "By: Diego Sanchez-Carapia\n");

        boolean eaten = false;
        System.out.println(map1.getRoom(p1.getX(), p1.getY()).getDescription());
        while(!eaten){
            String res = input.nextLine();
            if(res.equalsIgnoreCase("Get Lamp")){
                if(map1.getRoom(p1.getX(), p1.getY()).getLamp() != null){
                    p1.setLamp(map1.getRoom(p1.getX(), p1.getY()).getLamp());
                    System.out.println("OK");
                    map1.getRoom(p1.getX(), p1.getY()).clearLamp();
                }
                else{
                    System.out.println("No lamp present");
                }
            }
            else if(res.equalsIgnoreCase("Light Lamp")){
                if(p1.getLamp() != null){
                    p1.getLamp().setIsLit(true);
                    System.out.println("OK");
                }
                else{
                    System.out.println("You don't have the lamp to light");
                }
            }
            else if(res.equalsIgnoreCase("North") || res.equalsIgnoreCase("South") || res.equalsIgnoreCase("East") || res.equalsIgnoreCase("West")) {
                if (map1.getRoom(p1.getX(), p1.getY()).isDark() && ( p1.getLamp() == null || (p1.getLamp() != null && !p1.getLamp().getIsLit()))) {
                    System.out.println("You have stumbled into a passing grue, and have been eaten");
                    eaten = true;
                    System.exit(0);
                }
                if (res.equalsIgnoreCase("North")) {
                    if (!map1.getRoom(p1.getX(), p1.getY()).canGoNorth()) {
                        System.out.println("Can't go that way");
                    } else {
                        p1.setX(p1.getX() - 1);
                        p1.setY(p1.getY());
                        if (map1.getRoom(p1.getX(), p1.getY()).isDark() && ( p1.getLamp() == null || (p1.getLamp() != null && !p1.getLamp().getIsLit()))) {
                            System.out.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
                        } else {
                            System.out.println(map1.getRoom(p1.getX(), p1.getY()).getDescription());
                        }
                    }
                }
                if (res.equalsIgnoreCase("South")) {
                    if (!map1.getRoom(p1.getX(), p1.getY()).canGoSouth()) {
                        System.out.println("Can't go that way");
                    } else {
                        p1.setX(p1.getX() +1);
                        p1.setY(p1.getY());
                        if (map1.getRoom(p1.getX(), p1.getY()).isDark() && ( p1.getLamp() == null || (p1.getLamp() != null && !p1.getLamp().getIsLit()))) {
                            System.out.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
                        } else {
                            System.out.println(map1.getRoom(p1.getX(), p1.getY()).getDescription());
                        }

                    }
                }
                if (res.equalsIgnoreCase("East")) {
                    if (!map1.getRoom(p1.getX(), p1.getY()).canGoEast()) {
                        System.out.println("Can't go that way");
                    } else {
                        p1.setX(p1.getX());
                        p1.setY(p1.getY()+1);
                        if (map1.getRoom(p1.getX(), p1.getY()).isDark() && ( p1.getLamp() == null || (p1.getLamp() != null && !p1.getLamp().getIsLit()))) {
                            System.out.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
                        } else {
                            System.out.println(map1.getRoom(p1.getX(), p1.getY()).getDescription());
                        }
                    }
                }
                if (res.equalsIgnoreCase("West")) {
                    if (!map1.getRoom(p1.getX(), p1.getY()).canGoEast()) {
                        System.out.println("Can't go that way");
                    } else {
                        p1.setX(p1.getX());
                        p1.setY(p1.getY()-1);
                        if (map1.getRoom(p1.getX(), p1.getY()).isDark() && ( p1.getLamp() == null || (p1.getLamp() != null && !p1.getLamp().getIsLit()))) {
                            System.out.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
                        } else {
                            System.out.println(map1.getRoom(p1.getX(), p1.getY()).getDescription());
                        }
                    }
                }


            }
            else if (res.equalsIgnoreCase("Look")){
                if((map1.getRoom(p1.getX(), p1.getY()).isDark() && p1.getLamp() == null) ||  (p1.getLamp() != null && !p1.getLamp().getIsLit())){
                    System.out.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
                }
                else{
                    System.out.println(map1.getRoom(p1.getX(), p1.getY()).getDescription());
                    if(map1.getRoom(p1.getX(), p1.getY()).getLamp()!= null) {
                        System.out.println("There is an old oil lamp that was made long ago here.");
                    }
                    if (map1.getRoom(p1.getX(), p1.getY()).getKey() != null){
                        System.out.println("You see the outline of a key on a dusty shelf that's covered in dust.");
                    }
                    if (map1.getRoom(p1.getX(), p1.getY()).getChest() != null){
                        System.out.println("There is a large, wooden, massive, oaken chest here with the word “CHEST” carved into it");
                    }
                }
                if(map1.getRoom(p1.getX(), p1.getY()).canGoNorth() || map1.getRoom(p1.getX(), p1.getY()).canGoSouth() || map1.getRoom(p1.getX(), p1.getY()).canGoEast() || map1.getRoom(p1.getX(), p1.getY()).canGoWest()){
                    System.out.print("Exits are: ");
                }
                if(map1.getRoom(p1.getX(), p1.getY()).canGoNorth()){
                    System.out.println("north");
                }
                if(map1.getRoom(p1.getX(), p1.getY()).canGoSouth()){
                    System.out.println("south");
                }
                if(map1.getRoom(p1.getX(), p1.getY()).canGoEast()){
                    System.out.println("east");
                }
                if(map1.getRoom(p1.getX(), p1.getY()).canGoWest()){
                    System.out.println("west");
                }
            }
            else if(res.equalsIgnoreCase("Get Key")){
                if(map1.getRoom(p1.getX(), p1.getY()).getKey() != null){
                    p1.setKey(map1.getRoom(p1.getX(), p1.getY()).getKey());
                    map1.getRoom(p1.getX(), p1.getY()).clearKey();
                    System.out.println("OK");
                }
                else {
                    System.out.println("No key present");
                }
            }
            else if(res.equalsIgnoreCase("Open Chest")){
                if(map1.getRoom(p1.getX(), p1.getY()).getChest() != null && !map1.getRoom(p1.getX(), p1.getY()).getChest().isLocked()){
                    System.out.println(map1.getRoom(p1.getX(), p1.getY()).getChest().getContents());
                    System.exit(0);
                }
                else if (map1.getRoom(p1.getX(), p1.getY()).getChest() != null){
                    System.out.println("The chest is locked");
                }
                else {
                    System.out.println("No chest present");
                }
            }
            else if (res.equalsIgnoreCase("Unlock Chest")){
                if(p1.getKey() != null){
                    p1.getKey().use(map1.getRoom(p1.getX(), p1.getY()).getChest());
                    System.out.println("OK");
                }
                else if (p1.getKey() == null){
                    System.out.println("Need a key to do any unlocking!");
                }
                else if (map1.getRoom(p1.getX(), p1.getY()).getChest() == null){
                    System.out.println("No chest to unlock");
                }
            }
            else {
                System.out.println("I'm sorry I don't know how to do that.");
            }


        }

    }
}
