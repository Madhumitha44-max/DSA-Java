import java.util.Scanner;
public class leftrotate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
       int[] num=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
for(int i=0;i<num.length-1;i++){
    int temp=num[i];
    num[i]=num[i+1];
    num[i+1]=temp;
}
for(int i=0;i<num.length;i++){
System.out.print(num[i]  +" ");
}
    }
}