import java.util.Scanner;

public class ArraySplitLargestsum {

    public static int find(int[] num, int k) {

        int l = 0,h = 0;
        for(int nums : num) {

            l = Math.max(l , nums);
            h += nums;

        }
        int ans = h;
        while( l<= h) {
            int mid = l + (h - l)/2;
            if(split(num, k ,mid)) {
               
                ans  = mid;
                h = mid - 1;

            }
            else {

                l = mid + 1;

            }
        }
        return ans;
    }
    public static boolean split(int[] num, int k , int maxsubarraysum) {

        int subarrayCount = 1;
        int currsubarraysum = 0;
        for(int nums : num) {

            if(currsubarraysum + nums > maxsubarraysum) {

                subarrayCount ++;
                currsubarraysum = nums;

                if(subarrayCount > k) {

                    return false;

                }
            }
            else {

                currsubarraysum += nums;

            }
        }
        return true;
    }
     
     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){

            num[i] = sc.nextInt();

        }
        System.out.println(find(num,k));
     }
}