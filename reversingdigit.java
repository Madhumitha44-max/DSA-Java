import java.util.*;
public class reversingdigit{
    public static int rev(int n){
        int revs=0;
        while(n!=0){
            int ld=n%10;
            n=n/10;
            revs=(revs*10)+ld;
        }
        return revs;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=rev(n);
        System.out.print(k);
    }
}