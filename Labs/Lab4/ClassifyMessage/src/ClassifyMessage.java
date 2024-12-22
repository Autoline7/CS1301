/*
 * ClassifyMessage.java
 * Author: DIEGO SANCHEZ-CARAPIA
 * Submission Date:  2/6/2024
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 What the program does is that is uses the users input inorder to correctly output the given values such as
 raw cat, message, latitude, longitude, and in range. In order to get the catString variable I used the .indexOf() method to
 find the first instance of a " ". I used this integer value to use the .substring() method to get the catString which would be the
 first word. Then, after I kept shrinking the method to avoid the indexOf() method from using the first " ". I used
 .substring with the length of the word + 1 to accurately get the value. I did this to find the values for latitude and longitude.
 then once the payload was completely shrunk that was what was outputted for the message. Then for the inRange I used the given
 expression and joint them to one line to make it make sense.

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

public class ClassifyMessage {
    enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String catString;
        String payload;
        double latitude;
        double longitude;
        boolean isInRange = false;
        MessageCategory Category;
        double south = 39.882343; //lat
        double north = 40.231315; //lat
        double west = -105.743511;//long
        double east = -104.907864;//long
        System.out.println("Please enter a formatted message:");
        payload = input.nextLine();
        catString = payload.substring(0,payload.indexOf(" "));

        payload = payload.substring(catString.length()+1);

        String lat = payload.substring(0, payload.indexOf(" "));
        latitude = Double.parseDouble(lat);
        payload = payload.substring(lat.length()+1);
        String lon = payload.substring(0, payload.indexOf(" "));
        longitude = Double.parseDouble(lon);
        payload = payload.substring(lon.length()+1);
        if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")){
            Category = MessageCategory.ALERT;
        }
        else if (catString.equalsIgnoreCase("need")){
            Category = MessageCategory.NEED;
        }
        else if (catString.equalsIgnoreCase("offer")){
            Category = MessageCategory.OFFER;
        }
        else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")){
            Category = MessageCategory.INFO;
        }
        else{
            Category = MessageCategory.UNKNOWN;
        }

        if ((latitude >= south && latitude <= north) && (longitude >= west && longitude <= east)){
            isInRange = true;
        }

        System.out.println("Category:\t" + Category);
        System.out.println("Raw Cat:\t" + catString.trim());
        System.out.println("Message:\t" + payload.trim());
        System.out.println("Latitude:\t" + latitude);
        System.out.println("Longitude:\t" + longitude);
        System.out.println("In Range:\t" + isInRange);


    }
}