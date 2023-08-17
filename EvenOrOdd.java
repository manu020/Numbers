public class EvenOrOdd {

    public static boolean isEven(int num) {
        if (num % 2 == 0)
            return true;
        else
            return false;
    }

    public static boolean isOdd(int num) {
        if (num % 2 != 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isEven(12));
        System.out.println(isOdd(45));
        System.out.println(isEven(75));
        System.out.println(isOdd(44));
    }
}