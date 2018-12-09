

public class TobitClass {

    public static void main(String[] args) {

        int a = 34;
        System.out.println(isSet(a, 2));
    }

    public static boolean isSet(int flags, int bit) {

        int mask = (1 << bit);
        return (flags & mask) == mask;
    }

}





