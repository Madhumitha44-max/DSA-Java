
import java.util.Scanner;

public class avg{
    public static float calAvg(int a,int b,int c){
int sum=a+b+c;
float avg=(float)sum/3;
return avg;
    }
    public static void main(String[] args) {
        System.out.println(System.in);
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.err.println(calAvg(a,b,c));
    }
}