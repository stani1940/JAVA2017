import java.util.Scanner;

public class OperatorClass_3 {
    public static void main(String[] args) {
            System.out.println(" Напишете програма, която по дадени дължина и ширина на правоъгълник, изкарват на конзолата неговият периметър и лице.");
            Scanner input = new Scanner(System.in);
            System.out.println("Enter length");
            System.out.println("Enter width");
            int length = input.nextInt();
            int width = input.nextInt();

            int p = length*2+width*2;
            System.out.println("Обиколката е:"+p);
            int area = length*width;
            System.out.println("Лицето на правоъгълник е:"+area);
    }
}
