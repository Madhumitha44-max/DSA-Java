
import java.util.Scanner;
public class p2{
    public static void calSum(int n){
        int a=0;
        System.out.print(a +" ");
        if(n>1){
            int b=1;
            for(int i=2;i<=n;i++){
                System.out.print(b +" ");
            int temp=b;
            b=a+b;
            a=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
       calSum(n);
    }
}