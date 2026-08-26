import java.util.Scanner;

public class Minimumsizesubarraysum {

    public static int find(int[] nums , int target) {

        int l = 0, minlength = Integer.MAX_VALUE, sum = 0, s = 0;
        for(int num : nums) {

            s += num;

        }
        if(s < target) {

            return 0;

        }
        else {
        for(int i =0; i < nums.length; i++) {

            sum += nums[i];
            while(sum >= target) {

                minlength=Math.min(minlength,i-l+1);
                sum-=nums[l];
                l++;

            }

        }

        }
        return minlength;
        
    }

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println("Enter the size of the Arary");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements of the Array");
        for (int i = 0; i <= num.length-1; i++) {

            num[i] = sc.nextInt();

        }
        System.out.println((find(num,target)));
    }
    
}
