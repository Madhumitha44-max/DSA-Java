import java.util.Scanner;

public class sumOfSubarrayMin {
    
    public static int numSubarraysWithSum(int[] nums, int goal) {

         return Sum(nums , goal) - Sum(nums,  goal - 1) ;

        }
        public static int Sum(int[] nums , int goal) {

        if(goal < 0) {

            return 0;

        }
        int l = 0 , r = 0 , sum = 0 , count = 0;
        while(r < nums.length) {

            sum = sum + nums[r];
            while(sum > goal) {

                sum -= nums[l];
                l++;

            }
            count += (r - l + 1);
            r++;
        }
        return count;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int goal = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            
            nums[i] = sc.nextInt();
            numSubarraysWithSum(nums , goal);
        }

    }
}

