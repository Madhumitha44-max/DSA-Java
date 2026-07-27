import java.util.ArrayList;
import java.util.Scanner;
public class leadersinarray {

     public static void findLeader(int[] num) {
      int max=Integer.MIN_VALUE;
      ArrayList<Integer> temp=new ArrayList<>();
      for(int i=num.length-1;i>=0;i--) {
        if(num[i]>=max) {
            temp.add(num[i]);
            max=num[i];
        }
      }
      System.out.println(temp);
     }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){

            num[i] = sc.nextInt();

        }
        findLeader(num);
     }
}
