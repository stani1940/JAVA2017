import java.util.Scanner;

public class OperatorClass_1 {
    public static void main(String[] args) {
        System.out.println("Напишете израз, който да проверява дали дадено цяло число е четно или нечетно. ");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        boolean EvenNumbers = (number%2 ==0 && number%2 !=1);
        System.out.println(EvenNumbers);

    }
}
