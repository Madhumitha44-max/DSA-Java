import java.util.Scanner;
public class sorting{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int[] num=new int[n];
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
       for(int i=0;i<num.length;i++){
              for(int j=0;j<num.length-1;j++){
if(num[j]>num[j+1]){
int temp=num[j+1];
num[j+1]=num[j];
num[j]=temp;
}
              }
       }
       System.out.print("sorted array is  ");
       for(int i=0;i<num.length;i++){
System.out.println(num[i] +" ");
       }

    }
}