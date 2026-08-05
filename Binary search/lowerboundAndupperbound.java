import java.util.Scanner;

public class lowerboundAndupperbound {
      
    public static int lowerbound(int[] num,int target) {
     int l = 0,h = num.length-1;
     while(l <= h) {

        int mid = l+(h-l)/2;
        if(num[mid] >= target) {

            h = mid-1;

        }
        else {

            l = mid+1;

        }
     }
     return l;
    }
    public static int upperbound(int[] num,int target) {
    int l = 0, h = num.length-1;
     while(l <= h) {

        int mid = l+(h-l)/2;
        if(num[mid] > target) {

            h = mid-1;

        }
        else {

            l = mid+1;
            
        }
     }
     return l;
    }

     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){

            num[i] = sc.nextInt();

        }
        System.out.println(lowerbound(num,target));
        System.out.println(upperbound(num,target));
     }
    }
