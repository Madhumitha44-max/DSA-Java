import java.util.Scanner;
public class reversing{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
       int[] num=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
int start=0;
int end=num.length-1;
while(start<end){
    int temp=num[start];
    num[start]=num[end];
    num[end]=temp;
    start++;
    end--;
}
for(int i=0;i<num.length;i++){
    System.out.print(num[i]+" ");
}
}
}