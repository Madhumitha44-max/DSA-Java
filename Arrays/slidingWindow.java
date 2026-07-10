import java.util.Scanner;
public class slidingWindow {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int k=sc.nextInt();
       int[] num=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
       int left=0;
       int sum=0;
       int max=0;
       for(int right=0;right<num.length;right++){
        sum+=num[right];
        if(right-left+1==k){
            max=Math.max(sum,max);
            sum-=num[left];
            left++;
        }
       }
       System.out.println("The maximum sum of kth size of subarray is: "+max);
    }
}