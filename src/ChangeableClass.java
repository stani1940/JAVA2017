public class ChangeableClass {
    public static void main(String[] args) {
        System.out.println("Имате две променливи: \n" +
                "int a = 5; \n" +
                "int b = 11; \n" +
                "Напишете програма с която да размените стойностите им, т.е. \n" +
                "System.out.print(a) дава 11, а System.out.print(b) дава 5.");
        int a = 5;
        int b= 11;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
