import java.util.Scanner;
public class minarr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int[] num=new int[n];
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
       int max=num[0];
       int min=num[1];
       for(int i=0;i<num.length;i++){
       if(num[i]>max){
max=num[i];
       }
       }
       System.out.println("Maximum element in the array is "+max);
    for(int i=0;i<num.length;i++){
       if(num[i]<min){
       min=num[i];
       }
}
System.out.println("Minimum element in the array is "+min);
}
}