/*
 * Circle.java
 * Author: DIEGO SANCHEZ-CARAPIA
 * Submission Date:  3/27/2024
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 What the program does is that its a class named circle which hold all
 the methods of the circle class. i had to write them with getters and setters
 and set the instance to variables to private to avoid other classes from
 messing with them. This will all run in the main method in the Circle Tester class.
 because it has the main method.

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
//*******************************************************
// Circle.java
//
//
//*******************************************************
public class Circle {

    private String name;       // declare the private String instance  name
    private double x;       // declare the private double instance  radius
    private double y;       // declare the private double instance  x
    private double radius;       // declare the private double instance  y

    //Used to compare doubles.  Remember, don't compare doubles directly using ==
    public static final double THRESHOLD = 0.000000001;

    //----------------------------------------------
    // getName - returns the value of name
    //----------------------------------------------
    public String getName() {
        return this.name;
    }

    //----------------------------------------------
    // getX - returns the value of x
    //----------------------------------------------
    public double getX() {
        return this.x;
    }


    //----------------------------------------------
    // getY - returns the value of y
    //----------------------------------------------
    public double getY() {
        return this.y;
    }

    //----------------------------------------------
    // getRadius - returns the value of radius
    //----------------------------------------------
    public double getRadius() {
        return this.radius;
    }

    //----------------------------------------------
    // setName - assigns a new value to name
    //----------------------------------------------
    public void setName(String name) {
        this.name = name;
    }

    //----------------------------------------------
    // setX - assigns a new value to x
    //----------------------------------------------
    public void setX(double x) {
        this.x = x;
    }

    //----------------------------------------------
    // setY - assigns a new value to y
    //----------------------------------------------
    public void setY(double y) {
        this.y = y;
    }


    //----------------------------------------------
    // setRadius - assigns a new value to radius
    //----------------------------------------------
    public void setRadius(double radius) {
        if(radius >= 0){
            this.radius = radius;
        }
    }

    //--------------------------------------------------------
    // area - returns the area of the circle
    //--------------------------------------------------------
    public double area() {
        return this.radius * this.radius * Math.PI;
    }

    //--------------------------------------------------------
    // perimeter - returns the perimeter of the circle
    //--------------------------------------------------------
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    //--------------------------------------------------------
    // diameter - calculates the diameter of the circle
    //--------------------------------------------------------
    public double diameter() {
        return radius * 2;
    }


    //--------------------------------------------------------
    // isUnitCircle - return true if the radius of this circle
    //                is 1 and its center is (0,0) and false
    //      	      otherwise.
    //--------------------------------------------------------
    public boolean isUnitCircle() {
        if(Math.abs(this.radius - 1.0) < THRESHOLD && Math.abs(this.x - 0.0) < THRESHOLD && Math.abs(this.y - 0.0) < THRESHOLD){
            return true;
        }
        return false;
    }

    public boolean equals(Circle anotherCircle){
        if(Math.abs(this.radius-anotherCircle.radius) < THRESHOLD && Math.abs(this.x-anotherCircle.x) < THRESHOLD && Math.abs(this.y-anotherCircle.y) < THRESHOLD){
            return true;
        }
        return false;
    }

    public double distance(Circle anotherCircle){
        return Math.sqrt(Math.pow(this.x-anotherCircle.x,2) + Math.pow(this.y-anotherCircle.y,2));
    }

    public boolean isSmaller(Circle anotherCircle){
        if(this.diameter() - anotherCircle.diameter() < -THRESHOLD){
            return true;
        }
        return false;
    }
    public int compareTo(Circle anotherCircle){
        if(isSmaller(anotherCircle)){
            return -1;
        }
        if(this.diameter() - anotherCircle.diameter() > THRESHOLD){
            return 1;
        }
        return 0;
    }

    public boolean intersects(Circle anotherCircle){
        if(this.distance(anotherCircle) <= this.radius + anotherCircle.radius){
            return true;
        }
        return false;
    }




    //--------------------------------------------------------
    // toString - return a String representation of
    //            this circle in the following format:
    //			  name: name
    //            center:(x,y)
    //            radius: r
    //--------------------------------------------------------
    public String toString() {
        return "name: " + this.name + "\ncenter: (" + this.x + ", " + this.y + ")\nradius: " + this.radius;
    }

}
