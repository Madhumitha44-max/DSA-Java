import java.util.Scanner;
public class selectionsort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
       int[] num=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
for(int i=0;i<=n-2;i++){
    int min=i;
    for(int j=i;j<=n-1;j++){
        if(num[j]<num[min]){
            int temp=num[min];
            num[min]=num[j];
            num[j]=temp;
        }
    }
}
for(int i=0;i<=n-1;i++){
    System.out.print(num[i]+" ");
}
    }
}