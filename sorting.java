import java.util.Scanner;
public class sorting{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int[] num=new int[n];
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
       for(int i=0;i<num.length-1;i++){
if(num[i]<num[i+1]){
int temp=num[i+1];
num[i+1]=num[i];
num[i]=temp;
}
       }
       System.out.print("sorted array is  ");
       for(int i=num.length-1;i>=1;i--){
System.out.println(num[i]);
       }

    }
}