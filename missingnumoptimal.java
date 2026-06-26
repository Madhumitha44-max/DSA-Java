import java.util.Scanner;
public class missingnumoptimal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
       int[] num=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
     int s=(n*(n+1))/2;
     int sum=0;
     for(int i=0;i<n;i++){
        sum=sum+num[i];
     }
     System.out.println("The missing number is "+(s-sum));
    }
}