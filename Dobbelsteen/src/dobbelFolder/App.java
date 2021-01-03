package dobbelFolder;

import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("oh oh big money, eyes on the prize what will it be");
        loop();
    }

    public static void loop() {
        while (Result != 5) {
            System.out.println("oh oh nog steeds geen 6 lets go again");
            Randomiser();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static Random random = new Random();
    static int Result = random.nextInt(6);

    public static void Randomiser() {

        Result = random.nextInt(6);

        switch (Result) {
            case 0:
                System.out.println("-----");
                System.out.println("|   |");
                System.out.println("| o |");
                System.out.println("|   |");
                System.out.println("-----");
                break;

            case 1:
                System.out.println("-----");
                System.out.println("|o  |");
                System.out.println("|   |");
                System.out.println("|  o|");
                System.out.println("-----");
                break;

            case 2:
                System.out.println("-----");
                System.out.println("|o  |");
                System.out.println("| o |");
                System.out.println("|  o|");
                System.out.println("-----");
                break;

            case 3:
                System.out.println("-----");
                System.out.println("|o o|");
                System.out.println("|   |");
                System.out.println("|o o|");
                System.out.println("-----");
                break;

            case 4:
                System.out.println("-----");
                System.out.println("|o o|");
                System.out.println("| o |");
                System.out.println("|o o|");
                System.out.println("-----");
                break;

            case 5:
                System.out.println("-----");
                System.out.println("|o o|");
                System.out.println("|o o|");
                System.out.println("|o o|");
                System.out.println("-----");
                break;

            default:
                System.out.println("fuck off nerd");

        }
    }
}
