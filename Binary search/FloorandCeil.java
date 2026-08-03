import java.util.Scanner;

public class FloorandCeil {

     public static void find(int[] num , int target) {

          int l = 0,h =  num.length-1;
          while(l <= h) {

            int mid = l+(h-l)/2;
            if(target == num[mid]) {

            System.out.println("Floor is :"+num[mid]+"and Ceil is :"+num[mid]);
            return;

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
          if (target < num[0]) {

            System.out.println("Floor doesn't exist"+" Ceil is :"+num[l]);

          }
          else if(target > num[num.length-1]) {

            System.out.println("Floor is :"+num[l-1]+" Ceil doesn't exist");

          }
          else {

          System.out.println("Floor is :"+num[l-1]+" and Ceil is :"+num[l]);

          }
     }
     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){

            num[i] = sc.nextInt();

        }
        find(num,target);
    
     }
}