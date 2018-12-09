import java.util.Scanner;

public class ModuleClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int x = input.nextInt();
        System.out.println(Math.abs(x));
        if (x>0){

            System.out.println(x);
        }
        else{
            System.out.println(-x);
        }
    }
}

