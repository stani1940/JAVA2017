public class LastdClass {
    public static void main(String[] args) {
        int number =386;
        int lastDigit = number % 10; // последна цифра
        int beforeLastDigit = (number % 100) / 10; // предпоследна цифра
        System.out.println("Last Digit: " + lastDigit);
        System.out.println("Before Last Digit: " + beforeLastDigit);


    }

}
