import java.util.Scanner;

public class OddClass {



        public static void main(String[] args) {
            System.out.println("Напишете израз, който да проверява дали дадено цяло число е четно или нечетно. ");

            Scanner input = new Scanner(System.in);
            System.out.println("Enter number");
            int number = input.nextInt();
            if (number%2 ==0 && number%2 !=1){
                System.out.println(number +" is Even");
            }
            else{
                System.out.println(number +" is Odd");
            }


        }
    }


