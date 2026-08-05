import java.util.Scanner;

public class searchInRotatedArray {

    public static int find(int[] num, int target) {

        int l=0,h=num.length-1;
        while(l<=h) {

            int mid = l+(h-l)/2;
            if(num[mid] == target) {

                return mid;

            }
            if(num[l] <= num[mid]) {

                if(target < num[mid] && num[l] <= target) {

                h=mid-1;

                }
                else {

                    l=mid+1;

                }
            }
            else {
                if(target > num[mid] && target <= num[h]) {

                  l=mid+1;

                }
                else {

                    h=mid-1;
                    
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){

            num[i] = sc.nextInt();

        }
        System.out.println(find(num,target));
    }
    
}
