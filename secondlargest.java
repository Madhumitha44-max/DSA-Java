import java.util.Scanner;
public class secondlargest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
       int[] num=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
       int largest=Integer.MIN_VALUE;
       int seclargest=Integer.MIN_VALUE;
       for(int i=0;i<num.length;i++){
        if(num[i]>largest){
            largest=num[i];
        }
       }
       for(int i=0;i<num.length;i++){
if(num[i]>seclargest&&num[i]<largest){
    seclargest=num[i];
}
        }
       System.out.println("The second largest number in an array is :"+seclargest);
    }
}