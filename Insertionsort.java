import java.util.Scanner;
public class Insertionsort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
       int[] num=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
for(int i=0;i<=n-1;i++){
    int j=i;
    while(j>0&&num[j-1]>num[j]){
        int temp=num[j-1];
        num[j-1]=num[j];
        num[j]=temp;
        j--;
    }
}
for(int i=0;i<=n-1;i++){
    System.out.print(num[i]+" ");
}
    }
}