public class EvenOrOdd {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return !isEven(num);
    }

    public static void main(String[] args) {
        System.out.println(isEven(12));
        System.out.println(isOdd(45));
        System.out.println(isEven(75));
        System.out.println(isOdd(44));
    }
}