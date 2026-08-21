import java.util.Scanner;

public class countInversions {
    
    public static int mergesort(int [] num, int low , int high) {
        int count=0;
        if(low >= high) {

            return 0;

        }
        int mid = low + (high - low)/2;
        count += mergesort(num , low , mid);
        count += mergesort(num, mid + 1, high);
        count += merge(num , low , mid , high);
        return count;

    }
    public static int merge(int[] num, int low , int mid , int high) {
       
        int left = low;
        int right = mid + 1;
        int[] ans = new int[high - low + 1];
        int k = 0;
        int count = 0;
        while(left <= mid && right <= high) {
            if(num[left] <= num[right]) {

                ans[k++] = num[left++];

            }
            else {

                ans[k++] = num[right++];
                count += mid - left + 1;

            }
        }
        while (left <= mid) {

            ans[k++] = num[left++];

        }
        while (right <= high) {

            ans[k++] = num[right++];

        }
        for(int i = 0; i < ans.length ; i++) {

            num[low + i] = ans[i];
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Arary");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements of the Array");
        for (int i = 0; i <= num.length-1; i++) {

            num[i] = sc.nextInt();

        }
        System.out.println(mergesort(num,0,num.length-1));
    }
}
