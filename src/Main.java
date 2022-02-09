
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);


        System.out.println("Hello World");
        System.out.println("please enter your name: ");
        String name = myScanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Would you like to start the twinkle little star song 'Y/N'?");
        String choice = myScanner.nextLine();

        switch (choice.toLowerCase()) {
            case "y" -> startSong();
            case "n" -> System.out.println("Quitting...");
        }


    }

    private static void startSong() {
        System.out.println("Starting Song...");
        System.out.println("Twinkle, twinkle, little star");
        System.out.println("How I wonder what you are");
        System.out.println("Up above the world so high");
        System.out.println("Like a diamond in the sky");

        System.out.println("etc...");
        System.out.println("........");
        System.out.println("........");
    }
}
