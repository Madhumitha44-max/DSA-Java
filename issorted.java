import java.util.Scanner;
public class issorted{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
       int[] num=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
       boolean sorted=true;
for(int i=0;i<num.length-1;i++){
    if(num[i]>num[i+1]){
sorted=false;
    }
    }
    if(sorted){
System.out.println("Array is sorted");
    }else{
        System.out.println("array is not sorted");
    }
}
}