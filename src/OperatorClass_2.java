import java.util.Scanner;

public class OperatorClass_2 {
    public static void main(String[] args) {
        System.out.println("Напишете булев израз, който да проверява дали дадено цяло число се дели на 5 и на 7 без остатък.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        boolean Number = (number%5 == 0 && number%7==0);
        System.out.println(Number);

    }
}

