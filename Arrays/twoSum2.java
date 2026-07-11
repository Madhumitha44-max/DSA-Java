import java.util.HashMap;
import java.util.Scanner;

public class twoSum2 {

    public static void calSum(int[] num,int target){

        HashMap <Integer,Integer> map = new HashMap <> ();
        for(int i = 0; i < num.length; i++) {
            int complement = target-num[i];
            if(map.containsKey(complement)) {

             System.out.println("The two indices are :"+  map.get(complement)+" and "+i);
               return;

            }
            map.put(num[i],i);
        }
        System.out.println("No solution found!!");
    }
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
       calSum(num,target);
      }
}
