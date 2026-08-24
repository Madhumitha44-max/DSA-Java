import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

    public static int[] find(int[] num, int target) {

        int i = 0, j = num.length - 1;
        int[] a = new int[2];
        while(i < j) {

            int sum = num[i] + num[j];
            if(target > sum) {

                i++;

            }
            else if (sum > target) {

                j--;

            }
            else {

                break;

            }
        }
        a[0] = i + 1;
        a[1] = j + 1;
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println("Enter the size of the Arary");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements of the Array");
        for (int i = 0; i <= num.length-1; i++) {

            num[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(find(num,target)));
    }
    
}
