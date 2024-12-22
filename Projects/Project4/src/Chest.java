/*
 * Chest.java
 * Author: DIEGO SANCHEZ-CARAPIA
 * Submission Date:  4/8/2024
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 What the program does is that it contains the Chest class. I was only provided
 a skeleton. I just finished up the class so it can work smoothly with the others.
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
public class Chest {

	/*
	 * Instance variables go here, you're responsible for choosing
	 * which ones are needed and naming them
	 */

	private boolean isChestLocked = true;
	private String contents;
	private Key keyName;

	/**
	 * This method is used by the Map class, you won't need to call it yourself
	 * It should result in this chest being locked and storing which key locked it.
	 */
	public void lock(Key theKey) {
		this.isChestLocked = true;
		this.keyName = theKey;
	}
	
	/**
	 * If theKey is the same key that was used to lock this chest, then
	 * the chest is unlocked.  Otherwise this method does nothing.
	 */
	public void unLock(Key theKey) {
		if(this.keyName == theKey){
			this.isChestLocked = false;
		}
	}
	
	/**
	 * Should return true if the chest is locked, false otherwise
	 */
	public boolean isLocked() {
		return this.isChestLocked;
	}
	
	/**
	 * Return a string describing the contents of the chest.
	 */
	public String getContents() {
		return this.contents;
	}
	
	/**
	 * Set the contents of the chest to this string.  You should not need to call
	 * this method in your program (though you have to implement it anyway).
	 */
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	
	
}
