import java.util.Scanner;
public class sumarr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
       int[] num=new int[n];
       System.out.println("Enter the elements of the array: ");
       int sum=0;
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
for(int i=0;i<num.length;i++){
sum=sum+num[i];
}
System.out.println("sum of the elements in an array is:");
    System.out.println(sum);
    }
}