import java.util.Random;
import java.util.Scanner;

public class GuessableClass {
    public static void main(String[] args) {
        System.out.println("Enter number between 1 and 20");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        interval(number);

    }

    public static void interval(int number) {
        if (number < 1 || number > 20) {
            System.out.println(number+" is not a valid number");
        } else {
            guessNumber(number);
        }
    }

    public static void guessNumber(int number) {
        System.out.println("Отгатни числото");
        Random rand = new Random();
        int n = rand.nextInt(20) + 1;
        Scanner input = new Scanner(System.in);


        int k = 1;
        while (n != number) {
            System.out.println("You don`t guess! The number is:" + n);
            System.out.println("Enter number between 1 and 20");
            number = input.nextInt();
            n = rand.nextInt(20) + 1;
            k++;
        }

        System.out.println(" You Guess! The number of attempts is: " + k);
    }

}



