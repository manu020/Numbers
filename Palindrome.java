public class Palindrome {
    public static void main(String[] args) {
        int num=123215;
        int sum = 0, temp = 0;
        int n=num;
        while (num > 0) {
            temp = num % 10;
            sum = (sum * 10) + temp;
            num = num / 10;
        }
        //System.out.println(sum);
         System.out.println((n==sum) ? "palindrome":"not palindrome");
    }
}
