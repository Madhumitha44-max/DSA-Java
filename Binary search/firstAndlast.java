import java.util.Scanner;

public class firstAndlast {
     
     public static int findFirst(int[] num,int target) {

      int first = -1, l = 0, h = num.length-1;
      while(l <= h) {

        int mid = l+(h-l)/2;
        if(target == num[mid]) { 

            first = mid;
            h = mid-1;

        }
        else {
            if(target < num[mid]) {

                h = mid-1;

            }
            else {

                l = mid+1;
                
            }
        }
      }
      return first;
     }
     public static int findLast(int[] num,int target) {

      int last = -1, l = 0, h = num.length-1;
      while(l <= h) {

        int mid = l+(h-l)/2;
        if(target == num[mid]) {

            last = mid;
            l = mid+1;

        }
        else {

            if(target < num[mid]) {

                h = mid-1;

            }
            else {

                l = mid+1;

            }
        }
      }
      return last;
     }
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){

            num[i] = sc.nextInt();

        }
        System.out.println(findFirst(num,target));
        System.out.println(findLast(num,target));
     }
}
