
import java.util.Scanner;
public class missingbettersol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of 1st the array");
        int n1=sc.nextInt();
       int[] a=new int[n1];
       System.out.println("Enter the elements of 1st array: ");
       for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
       }

    }
}