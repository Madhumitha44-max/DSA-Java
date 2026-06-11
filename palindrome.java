import java.util.*;
public class palindrome{
    public static int rev(int n){
        int original=n;
        int revs=0;
        while(n!=0){
            int ld=n%10;
            n=n/10;
            revs=(revs*10)+ld;
        }
         if(original==revs){
            System.out.println("True");
         }else{
            System.out.println("False");
         }
         return revs;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        rev(n);
    }
}