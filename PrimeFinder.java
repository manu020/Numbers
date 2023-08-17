public class PrimeFinder {
    public static void isPrime(int num){
        boolean prime=true;
        for(int i=0;i<num;i++){
            if(num % i==0){
                prime=false;
                break;
            }
        }
        System.out.println(prime);
    }
    
}
