import java.util.Scanner;
public class ParseTheTweet{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a tweet below");
        String tweet = input.nextLine();


        int start = tweet.indexOf("#typ");
        int finish = tweet.indexOf(";");
        String type = tweet.substring(start + 4,finish);
        System.out.println("Type:\t\t" + type.trim().toUpperCase());

        tweet = tweet.substring(finish + 1);
        start = tweet.indexOf("#det");
        finish = tweet.indexOf(";");
        String det = tweet.substring(start + 4,finish);
        System.out.println("Detail:\t\t" + det.trim().replace(",","-"));


        tweet = tweet.substring(finish + 1);
        start = tweet.indexOf("#loc");
        finish = tweet.indexOf(";");
        String loc = tweet.substring(start + 4,finish);
        System.out.println("Location:\t" + loc.trim().replace(",","-"));

        tweet = tweet.substring(finish + 1);
        start = tweet.indexOf("#lat");
        finish = tweet.indexOf(";");
        String lat = tweet.substring(start + 4,finish);
        System.out.println("Latitude:\t" + lat.trim());

        tweet = tweet.substring(finish + 1);
        start = tweet.indexOf("#lng");
        finish = tweet.indexOf(";");
        String lon = tweet.substring(start + 4,finish);
        System.out.println("Longitude:\t" + lon.trim());
    }

}