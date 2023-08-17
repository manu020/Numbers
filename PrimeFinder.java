public class PrimeFinder {
    public static void isPrime(int num){
        boolean prime=true;
        for(int i=2;i<num;i++){
            if(num % i==0){
                prime=false;
                break;
            }
        }
        System.out.println(prime);
    }
    
    public static void main(String[] args) {
        isPrime(17);
        isPrime(24);
    }
}
