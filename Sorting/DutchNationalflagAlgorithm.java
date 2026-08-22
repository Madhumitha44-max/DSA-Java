import java.util.Scanner;

public class DutchNationalflagAlgorithm {
    
    public static void sort(int[] num) {
       int low = 0;
       int high = num.length-1;
       int mid = 0;
       while (mid <= high) {
           switch (num[mid]) {
               case 0 -> {
                   swap(num, low , mid);
                   mid++;
                   low++;
               }
               case 1 -> mid++;
               default -> {
                   swap(num, mid , high);
                   high--;
               }
           }
       }
    }
    public static void swap(int[] num, int i , int j) {

        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;

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
        sort(num);
        for (int i = 0; i <=num.length-1; i++) {

            System.out.print(num[i]+" ");

        }
    }
}
