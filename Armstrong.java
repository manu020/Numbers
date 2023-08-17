public class Armstrong{
    public static void main(String[] args) {
        int num = 1634;    
    int sum=0,temp=0;
    int n=num; int number=num;
    while(num>0){
       num=num/10;
       sum=sum+1;
    }
   
     while(number>0){
       int last =number%10;
        temp=(int) (temp+(Math.pow(last,sum)));
        number=number/10;
     }
     System.out.println((n==temp)?"Armstrong number":"Not Armstrong number");
     
    }
}