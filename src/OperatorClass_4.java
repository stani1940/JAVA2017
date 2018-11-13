public class OperatorClass_4 {
    public static void main(String[] args) {

        int number = 123;
        int a = number / 100;      // first digit
        int b = (number % 100) / 10; // second digit
        int c = number % 10;      // third digit
        System.out.println(a + b + c);
        System.out.println("" + c + b + a);
        System.out.println("" + c + a + b);
    }
}
