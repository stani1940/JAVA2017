
import java.util.Scanner;

public class FootballClass {

    public static void main(String[] args) {
        System.out.println("Иван тренира футбол. Иван е зает човек. Той тренира футбол само през уикенда. Понякога се прибира в Шумен. Когато е в Шумен той тренира футбол. Aко Иван не е в Шумен през уикенда се среща с други приятели и се напиват.Имате променливите:int day, която може да е 1,2,3,4,5,6,7 1 е понеделник, 7 е неделя boolean inShumen, която ако е true значи Иван е в Шумен Напишете метод,който извежда дали Иван ще играе футбол");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter number between 1 and 7 ");
        int day = input.nextInt();
        System.out.println(ivanPlay(day,false));

    }
    public static boolean ivanPlay(int day,boolean inShumen){

                        if (( day == 6)||( day==7)) {
                            if (inShumen==true){
                                return true;
                            }
                            else return false;
                        }
                            else {

                                return false;
                            }
                        }



        }


