import java.util.Scanner;

public class singleElementInSortedArray {

    public static int find(int[] num) {

        int l=0,h=num.length-1;
        while(l < h) {

            int mid = l  + (h - l)/2;
            if(mid % 2 == 1) {

                mid--;

            }
            if(num[mid] == num[mid+1]) {

                l = mid + 2;

            }
            else {

                h = mid;

            }
        }
        return num[l];
    }
     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){

            num[i] = sc.nextInt();

        }
        System.out.println(find(num));
    
     }
}
