import java.util.Scanner;

public class RectangleClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      double x1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y1 = input.nextDouble();
        double y2 = input.nextDouble();
        double x = input.nextDouble();
        double y = input.nextDouble();
        if (x>=x1 && x<=x2 && y>=y1 && y<=y2){
            System.out.println("Inside");
        }
        else{
            System.out.println("Outside");
        }

    }
}
