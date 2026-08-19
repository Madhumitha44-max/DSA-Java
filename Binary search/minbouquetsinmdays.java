import java.util.Scanner;

public class minbouquetsinmdays {

    public static int find(int[] bloomDay, int k, int m) {
         int l = 0, h = 0;
         for(int num : bloomDay) {

            l = Math.min(l , num);
            h = Math.max( h , num);

         }
        int ans = h;
        while ( l <= h) {

            int mid = l + (h - l)/2;
            if(k * m > bloomDay.length) {

                return -1;

            }
            if(split(bloomDay, k , m , mid)) {

                ans = mid;
                h = mid - 1;

            }
            else {

                l = mid + 1;

            }
        }
        return ans;
    }
    public static boolean split(int[] bloomDay, int k, int m , int mid) {

        int currflower = 0;
        int currbouquet = 0;

        for(int num : bloomDay) {

            if(mid >= num) {

                currflower ++;

                if(currflower == k) {

                    currbouquet ++;
                    currflower = 0;

                }
                if(currbouquet == m) {

                    return true;

                }
            }
            else {

                currflower = 0;

            }
        }
        return false;
    }
    
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] bloomDay = new int[n];
        for(int i = 0; i < n; i++){

            bloomDay[i] = sc.nextInt();

        }
        System.out.println(find(bloomDay,k,m));
     }
}