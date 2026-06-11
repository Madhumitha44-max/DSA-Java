import java.util.*;
public class Amstrongnum{
    public static int rev(int n){
        int sum=0;
        int original=n;
        while(n!=0){
            int ld=n%10;
            sum=sum+(ld*ld*ld);
            n=n/10;
        }
         if(original==sum){
            System.out.println("Given number is an Amstrong number");
         }else{
            System.out.println("Given number is not an Amstrong number");
         }
         return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        rev(n);
    }
}