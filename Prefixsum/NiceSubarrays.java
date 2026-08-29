import java.util.HashMap;
import java.util.Scanner;

public class NiceSubarrays {
    
    public static int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0 , count = 0;
        for(int i = 0; i < nums.length; i++) {

            if(nums[i] % 2 == 0) {

                nums[i] = 0;

            }
            else {

                nums[i] = 1;

            }
            sum += nums[i];
            int ans = sum - k;
            if(map.containsKey(ans)) {

                count += map.get(ans);

            }
            map.put(sum , map.getOrDefault(sum , 0) + 1);
        }
        if(sum == 0) {

            return 0;

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
        System.out.println(numberOfSubarrays(nums , k));
    }
}
