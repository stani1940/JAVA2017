public class TriangleClass {
    public static void main(String[] args) {
        String a ="*";
        for (int i = 0; i <3; i++) {

            for (int j =0; j <3-i; j++) {
                System.out.printf("");

            }
            System.out.printf(""+a);
            for (int k=2;k<=3-i;k++){
                System.out.printf("  "+a);
            }
            System.out.println();
        }

    }
}

