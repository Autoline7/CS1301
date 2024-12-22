/*
 * CircleTester.java
 * Author: DIEGO SANCHEZ-CARAPIA
 * Submission Date:  3/18/2024
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 What the program does is that it holds the main method and calls upon
 the circle class since we created circle objects.At the end I made my own
 test cases to see if the methods created worked correctly.I also printed some of
 the methods when i was requested for the values.

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
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle. Use the default constructor
//  in the Circle class to create Circle objects. 
// 
//*******************************************************
public class CircleTester{
	public static final double THRESHOLD = 0.000000001;
	
	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(); 
		circle1.setName("Circle 1");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		circle2.setName("Circle 2");
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		
		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); 
		
		//This is a unit test.  It is best to have tests output pass or fail instead of just a bunch of values.
		//Notice how the double comparison is done
		if(Math.abs(2-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		
		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);
		
		
		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		System.out.println(circle1);
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println(circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("\nCircle 1\nDiameter: " + circle1.diameter() + "\nArea: " + circle1.area() + "\nPerimeter: " + circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("\nCircle 2\nDiameter: " + circle2.diameter() + "\nArea: " + circle2.area() + "\nPerimeter: " + circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("\nCircle 1\nIs it in the unit circle?: " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("\nCircle 2\nIs it in the unit circle?: " + circle2.isUnitCircle());
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.


		circle1.setX(5);
		circle1.setY(5);
		circle1.setRadius(1);
		circle2.setX(5.0);
		circle2.setY(5.000000000000000001);
		circle2.setRadius(1);
		//1.Tests this method
		if(circle1.equals(circle2)){
			System.out.println("Passed Test 1 (case 1)");
		}

		circle1.setX(5);
		circle1.setY(6);
		if(!circle1.equals(circle2)){
			System.out.println("Passed Test 1 (case 2)");
		}
		circle1.setX(5);
		circle1.setY(5);
		circle1.setRadius(1);
		circle2.setX(5.0);
		circle2.setY(5.000000000000000001);
		circle2.setRadius(2);
		if(!circle1.equals(circle2)){
			System.out.println("Passed Test 1 (case 3)");
		}

		//2.Tests this method
		circle1.setX(0);
		circle1.setY(0);
		circle2.setX(1);
		circle2.setY(1);
		if(Math.abs(circle1.distance(circle2)-Math.sqrt(2)) < THRESHOLD){
			System.out.println("Passed Test 2 (case 1)");
		}
		circle1.setX(0);
		circle1.setY(0);
		circle2.setX(10);
		circle2.setY(10);
		if(Math.abs(circle1.distance(circle2)-Math.sqrt(200)) < THRESHOLD){
			System.out.println("Passed Test 2 (case 2)");
		}
		circle1.setX(0);
		circle1.setY(0);
		circle2.setX(5);
		circle2.setY(10);
		if(Math.abs(circle1.distance(circle2)-Math.sqrt(125)) < THRESHOLD){
			System.out.println("Passed Test 2 (case 3)");
		}


		//3. Tests this method
		circle1.setRadius(1);
		circle2.setRadius(2);
		if(circle1.isSmaller(circle2)){
			System.out.println("Passed Test 3 (case 1)");
		}
		circle1.setRadius(2);
		circle2.setRadius(2);
		if(!circle1.isSmaller(circle2)){
			System.out.println("Passed Test 3 (case 2)");
		}
		circle1.setRadius(3);
		circle2.setRadius(2);
		if(!circle1.isSmaller(circle2)){
			System.out.println("Passed Test 3 (case 3)");
		}


		//4. Tests this method
		circle1.setRadius(2);//equal
		circle2.setRadius(2);

		Circle circle3 = new Circle();
		circle3.setRadius(1);//is smaller than


		if(circle1.compareTo(circle2) == 0){
			System.out.println("Passed Test 4 (equals)(case 1)");
		}
		if(circle3.compareTo(circle1) == -1){
			System.out.println("Passed Test 4 (smaller than) (case 2)");
		}
		if(circle1.compareTo(circle3) == 1){
			System.out.println("Passed Test 4 (larger than) (case 3)");
		}



		circle1.setX(1);
		circle1.setY(1);
		circle1.setRadius(5);
		circle2.setX(1.5);
		circle2.setY(1.5);
		circle2.setRadius(0.001);
		//5. Tests this method
		if(circle1.intersects(circle2)){//circ1 croses over circ2
			System.out.println("Passed Test 5 (case 1)");
		}
		circle1.setX(1);
		circle1.setY(1);
		circle1.setRadius(0.001);
		circle2.setX(1.5);
		circle2.setY(1.5);
		circle2.setRadius(5);
		if(circle1.intersects(circle2)){//circ2 croses over circ1
			System.out.println("Passed Test 5 (case 2)");
		}
		circle1.setX(1);
		circle1.setY(1);
		circle1.setRadius(0.001);
		circle2.setX(10);
		circle2.setY(10);
		circle2.setRadius(.001);
		if(!circle1.intersects(circle2)){//circ2 croses over circ1
			System.out.println("Passed Test 5 (case 3)");
		}




				
	}
	
}
