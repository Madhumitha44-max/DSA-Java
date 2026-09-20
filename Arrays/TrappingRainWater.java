import java.util.Scanner;

public class TrappingRainWater {
    
        public static int trap(int[] height) {

        int l = 0 , r = height.length - 1;
        int leftmax = 0 , rightmax = 0 , ans = 0;
        while( l < r) {

            leftmax = Math.max(leftmax , height[l]);
            rightmax = Math.max(rightmax , height[r]);
            if(rightmax < leftmax) {

                ans  += rightmax - height[r];
                r--;

            }
            else {

                ans += leftmax - height[l];
                l++;

            }
        }
        return ans;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for(int i = 0; i < n; i++){

            height[i] = sc.nextInt();

        }
        System.out.println(trap(height));
    }
}
