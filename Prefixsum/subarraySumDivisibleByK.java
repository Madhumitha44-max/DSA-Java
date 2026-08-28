import java.util.HashMap;
import java.util.Scanner;

public class subarraySumDivisibleByK {

    public static int subarraysDivByK(int[] nums, int k) {
       HashMap<Integer , Integer> map = new HashMap<>();
       map.put(0 , 1);
       int sum = 0 , count = 0;
       for(int num : nums) {

        sum += num;
        int p = (sum % k + k) % k;
        if(map.containsKey(p)) {

            count += map.get(p);
        }
       map.put(p , map.getOrDefault(p , 0) + 1);
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
        System.out.println(subarraysDivByK(nums , k));
    }
}
