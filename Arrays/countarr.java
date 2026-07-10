import java.util.Scanner;
public class countarr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int counteven=0;
        int countodd=0;
       int[] num=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
       for(int i=0;i<num.length;i++){
        if(num[i]%2==0){
counteven++;
        }else{
            countodd++;
        }
       }
       System.out.println("Number of even numbers are :"+counteven);
       System.out.println("Number of odd numbers are :"+countodd);
    }
}