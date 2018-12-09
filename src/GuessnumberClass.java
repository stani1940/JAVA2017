import java.util.Random;
import java.util.Scanner;

public class GuessnumberClass {
    public static void main(String[] args) {
        System.out.println("Отгатни числото");
        Random rand = new Random();
        int n =rand.nextInt(20) + 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number between 1 and 20");
        int number = input.nextInt();
        int k=1;
            while (n!=number){
                System.out.println("You don`t guess! The number is:"+n);
                System.out.println("Enter number between 1 and 20");
                number =input.nextInt();
                n = rand.nextInt(20) + 1;
                k++;
            }

        System.out.println("Number of attempts is: "+k);

    }
}