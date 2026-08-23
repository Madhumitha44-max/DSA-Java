import java.util.Scanner;

public class besttimetoBuyandSell {

    public static int find(int[] num) {

        int min = num[0] , profit = 0;

        for(int i = 1; i < num.length; i++) {

            int cost = num[i] - min;
            profit = Math.max(profit , cost);
            min = Math.min(num[i] , min);
        }
        return profit;
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
        System.out.println(find(num));
    }
}
