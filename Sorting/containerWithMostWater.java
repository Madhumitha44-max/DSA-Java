import java.util.Scanner;

public class containerWithMostWater {

    public static int find(int[] num) {

        int i = 0, j = num.length-1, maxarea = 0;
        while(i < j) {

            int currarea = (j - i) * (Math.min(num[i] , num[j]));
            maxarea = Math.max(maxarea , currarea);
            if(num[i] < num[j]) {

                i++;

            }
            else {

                j--;

            }
        }
        return maxarea;
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
        System.out.println((find(num)));
    }
    
}
