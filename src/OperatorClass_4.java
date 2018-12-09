import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class OperatorClass_4 {
    public static void main(String[] args) {
        System.out.println("Напишете програма, която приема за вход трицифрено число във формат abc и след това извършва следните действия върху него: \n" +
                "Пресмята сбора от цифрите на числото. \n" +
                "Разпечатва на конзолата цифрите в обратен ред: cba. \n" +
                "Поставя последната цифра на първо място: cab. ");

        int number = 123;
        int a = number / 100;      // first digit
        int b = (number % 100) / 10; // second digit
        int c = number % 10;      // third digit
        System.out.println(a + b + c);
        System.out.println("" + c + b + a);
        System.out.println("" + c + a + b);
    }
}
