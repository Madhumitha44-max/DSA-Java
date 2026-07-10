import java.util.Scanner;
public class Bubblesort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
       int[] num=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
for(int i=n-1;i>=1;i--){
    for(int j=0;j<=i-1;j++){
        if(num[j]>num[j+1]){
            int temp=num[j];
            num[j]=num[j+1];
            num[j+1]=temp;
        }
    }
}
for(int i=0;i<=n-1;i++){
    System.out.print(num[i]+" ");
}
    }
}