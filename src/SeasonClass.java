import java.util.Scanner;

public class SeasonClass {
    public static void main(String[] args) {
        System.out.println("Enter month");
        Scanner input = new Scanner(System.in);
        byte month = input.nextByte();

        String season;
        if (month >0 && month < 13) {
            if (month > 0 && month <= 3) {
                season = "Winter";
            }
            if (month > 3 && month <= 6) {
                season = "Spring";
            }
            if (month > 6 && month <= 9) {
                season = "Summer";
            }
            if (month > 9 && month <= 12) {
                season = "Spring";

            }

            //System.out.println(season);
        }
    }
}