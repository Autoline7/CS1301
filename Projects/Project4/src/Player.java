/*
 * Player.java
 * Author: DIEGO SANCHEZ-CARAPIA
 * Submission Date:  4/8/2024
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 What the program does is that it contains the Player class. In which i initialized its
 instance variables and also created getters and setter for all of them so it can be modified as
 needed.
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
public class Player {
    private int xCoordinate;
    private int yCoordinate;
    private Key key;
    private Lamp lamp;

    public Player(){
        this.xCoordinate = 0;
        this.yCoordinate = 0;
    }

    public Player(int xCoordinate, int yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public void setX(int xCoordinate){
        this.xCoordinate = xCoordinate;
    }
    public void setY(int yCoordinate){
        this.yCoordinate = yCoordinate;
    }
    public void setLamp(Lamp l){
        this.lamp = l;
    }
    public void setKey(Key k){
        this.key = k;
    }

    public int getX(){
        return this.xCoordinate;
    }
    public int getY() {
        return this.yCoordinate;
    }
    public Lamp getLamp(){
        return this.lamp;
    }
    public Key getKey(){
        return this.key;
    }
}
