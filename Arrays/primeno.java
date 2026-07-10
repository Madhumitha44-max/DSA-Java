import java.util.*;
public class primeno{
    public static void rev(int n){
        int count=0;
        for(int i=1;i<=n;i++){
if(n%i==0){
    count++;
}
        }
if(count==2){
    System.out.println("Not a prime number");
}else{
    System.out.println("Given number is a prime number");
}
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        rev(n);
    }
}