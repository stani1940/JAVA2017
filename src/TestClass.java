import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведи резултат:");

        byte result = input.nextByte();
        boolean isFirst = false;

        boolean graduate = (isFirst || result >= 60);
        System.out.println(graduate);
    }
}
