import java.util.Scanner;
public class maximumsubarray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
       int[] num=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
      int currsum=num[0];
      int maxsum=num[0];
      for(int i=1;i<n;i++){
        currsum=Integer.max(num[i],currsum+num[i]);
        maxsum=Integer.max(maxsum,currsum);
      }
      System.out.println("The maximun sum of a subarray is: "+maxsum);
    }
}