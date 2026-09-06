import java.util.*;

public class NextgreatestElement {
     
    public static int[] nextGreaterElements(int[] nums) {
        int[] a = new int[nums.length];
        Stack <Integer> stack = new Stack<>();
        Arrays.fill(a,-1);
        for(int i = 0; i < 2*nums.length; i++) {

            int l = i % nums.length;
            while(!stack.isEmpty() && nums[stack.peek()] < nums[l]) {

                int k = stack.pop();
                a[k] = nums[l];

            }
                if( i < nums.length ) {

                    stack.push(i);

            }
    }
    return a;
}

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < num.length; i++) {

            num[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(nextGreaterElements(num)));
}
}
