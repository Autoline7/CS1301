/*
 * Lamp.java
 * Author: DIEGO SANCHEZ-CARAPIA
 * Submission Date:  4/8/2024
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 What the program does is that it contains the Lamp class. In which i initialized its only
 instance variable and also created a getter and a setter for all of them, so it can be modified as
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
public class Lamp {

	/*
	 * Instance variables and methods go here, you're responsible for 
	 * choosing and naming them.
	 */
	private boolean lampIsLit;

	public void setIsLit(boolean onOff){
		this.lampIsLit = onOff;
	}

	public boolean getIsLit(){
		return this.lampIsLit;
	}


	
}
