import java.util.HashMap;
import java.util.Scanner;

public class contiguosArray {

    public static int findMaxLength(int[] nums) {
       HashMap<Integer , Integer> map = new HashMap<>();
       map.put(0,-1);
       int sum = 0 , count = 0;
       for(int i =0; i < nums.length; i++) {

        if(nums[i] == 0) {

            nums[i] = -1;

        }
        else {

            nums[i] = 1;

        }
        sum += nums[i];
        if(map.containsKey(sum)) {

         count = Math.max(count , i - map.get(sum));

        }
        else{
     map.put(sum ,i); 
        }  
        }
        return count;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n]; 
        for(int i = 0; i < nums.length; i++) {

            nums[i] = sc.nextInt();

        }
        System.out.println(findMaxLength(nums));
    }

}
