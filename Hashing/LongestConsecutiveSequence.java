import java.util.*;

public class LongestConsecutiveSequence {
    
    public static int longestConsecutive(int[] nums) {
        int maxcount = 0;
        HashSet <Integer> set = new HashSet<>();
        if(nums.length==0) {

            return 0;

        }
        for(int num : nums) {

            set.add(num);
        }
        for(int num : set) {
            if(!set.contains(num - 1)) {

                int curr = num;
                int count = 1;

                while(set.contains(curr + 1)) {

                    curr += 1;
                    count ++;
    
                }
            maxcount = Math.max(maxcount , count);
            }
        }
        return maxcount;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++) {

            nums[i] = sc.nextInt();

        }
        System.out.println(longestConsecutive(nums));
    }
}

