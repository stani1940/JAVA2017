public class LastdClass {
    public static void main(String[] args) {
        System.out.println(lastDigit(257));

    }
    public static boolean lastDigit(int number) {
        int lastDigit = number % 10;
        if (lastDigit==7){
            return true;
        }
        else{
            return false;
        }
    }
}
