import java.util.Scanner;

public class buyandsell {

    public static int stock(int[] num) {

     int min = num[0], profit = 0;
     for(int i = 1; i < num.length; i++) {

        int cost = num[i] - min;
        profit = Math.max(profit,cost);
        min = Math.min(min,num[i]);
        
     }
     return profit;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){

            num[i] = sc.nextInt();

        }
        System.out.println("The maximun profit that can be obtained is :"+stock(num));
    }
}
