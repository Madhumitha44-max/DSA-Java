import java.util.HashMap;
import java.util.Scanner;

public class subarrayaWithSumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        HashMap <Integer , Integer> map = new HashMap<>();
        map.put(0 , 1);
        int prefixSum = 0 , count = 0;
        for(int num : nums) {

            prefixSum += num;
            int ans = prefixSum - k;
            if(map.containsKey(ans)) {

                count += map.get(ans);

            }
            map.put(prefixSum , map.getOrDefault(prefixSum , 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[n]; 
        for(int i = 0; i < nums.length; i++) {

            nums[i] = sc.nextInt();

        }
        System.out.println(subarraySum(nums , k));
    }
    
}
