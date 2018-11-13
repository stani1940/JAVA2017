
import java.util.Scanner;

public class HomeworkClass1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your area");
        int area = input.nextInt();

        String  isGoodLocation = "worse";
        boolean yourImot = (isGoodLocation == "good" && area >100);
        System.out.println(yourImot);
    }
}
