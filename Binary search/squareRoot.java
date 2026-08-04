import java.util.Scanner;

public class squareRoot {
    
    public static int find(int t) {
      int l = 1, h = t;
      while(l <= h) {

        int mid = l+(h-l)/2;
        int k = mid*mid;
        if(t < 2) {

            return t;
        }
        if(t == k) {

            return mid;

        }
        else {

            if(t>k) {

                l=mid+1;

            }
            else {
                h=mid-1;
                
            }
        }
      }
      return h;
    }
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println(find(t));
     }
}
