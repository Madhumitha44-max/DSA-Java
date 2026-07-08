import java.util.Scanner;

public class maxsubarray {

    public static int maxSum(int[] num,int k){

      int left = 0, sum = 0, maxLength = 0;

      for(int right = 0; right < num.length ; right++) {

        sum += num[right];

        //If the current sum exceeds target sum then shrink the array

        while(sum > k) {

            sum -= num[right];
            left++;
        }
       
        //If the current sum of subarray matches the target sum then find it's maximumlength
        
        if(sum == k){

            maxLength = Math.max(maxLength,right-left+1);
        }
      }
      return maxLength;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println("The maximum length of the subarray that has sum k is :"+maxSum(num,k));
    }
    
}
