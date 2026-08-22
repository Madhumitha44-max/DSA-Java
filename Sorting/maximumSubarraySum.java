import java.util.Scanner;

public class maximumSubarraySum {

     public static int find(int[] num) {

        int sum = num[0] , maxSum = num[0];
        for(int i = 1; i < num.length; i++) {

            sum += num[i];
            maxSum = Math.max(sum , maxSum);
            if(sum < 0) {

                sum = 0;
                
            }

        }
        return maxSum;
     }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Arary");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements of the Array");
        for (int i = 0; i <= num.length-1; i++) {

            num[i] = sc.nextInt();

        }
        System.out.println(find(num));
    }
}
