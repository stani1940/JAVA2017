import java.util.Scanner;

public class HomeworkClass2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter car Age");
        byte age = input.nextByte();
        System.out.println("Please Enter car price");
        int price = input.nextInt();
        boolean yourCar = ((age > 5 && price >20000)||(age<=5 && price > 40000));
        System.out.println(yourCar);
    }
}
