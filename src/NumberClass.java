import java.util.Scanner;

public class NumberClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        if (number >=2 && number<=6){
            if (number ==2){
                System.out.println("2");
            }else if (number ==3){
                System.out.println("3");
            }
            else if ( number ==4){
                System.out.println("4");
            }
            else if ( number ==5){
                System.out.println("5");
            }
            else {
                System.out.println("6");
            }

        }else{
            System.out.println("Please enter between 2 dnd 6");
        }
    }
}
