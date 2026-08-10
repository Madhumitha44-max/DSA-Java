import java.util.Scanner;

public class searchInRotatedArraytwo {

    public static boolean find(int[] num , int target) {

        int l=0, h=num.length - 1;
        while(l <= h) {
            
            int mid = l + (h - l)/2;
            if(target == num[mid]) {

                 return true;

            }
            else {

            }
            if(num[l] == num[mid] && num[mid] == num[h]) {

                l++;
                h--;
                continue;

            }
            if(num[l] <= num[mid]) {
               
                if(target >= num[l] && target < num[mid]) {

                    h = mid - 1;

                }
                else {

                    l = mid + 1;

                }
            }
            else {
                 if(target > num[mid]  && target <= num[h]) {

                    l = mid + 1;

                 }
                 else {

                    h = mid - 1;

                 }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){

            num[i] = sc.nextInt();

        }
        if(find(num, target)) {

            System.out.println("true");

        }
        else {

            System.out.println("false");

        }
}
}
