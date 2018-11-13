import java.util.Scanner;

public class HomeworkClass4 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter a ");
            int a = input.nextInt();
            System.out.println("Please Enter b ");
            int b = input.nextInt();
            System.out.println("Please Enter c ");
            int c = input.nextInt();
            int d = b+c;
            int e = a+c;
            int f = a+b;
            boolean isTriangle = ((a>0 && b >0 && c>0)&&(a<d && b<e && c<f));
            System.out.println(isTriangle);
        }
    }

