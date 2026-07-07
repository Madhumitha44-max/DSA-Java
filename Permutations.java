import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations {
    
    public static List<List<Integer>> permute (int[] num) {
       List<List<Integer>> set = new ArrayList<>();
       boolean[] used = new boolean[num.length];
       backtracking(num,used,set,new ArrayList<>());
       return set;
    }
    public static void backtracking(int[] num, boolean[] used, List<List<Integer>>set, List<Integer>list) {

        if(list.size() == num.length) {

            set.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0 ; i < num.length ; i++) {

        if(used[i])
         continue;

        //choosing the element
        used[i] = true;
        list.add(num[i]);

        //Exploring...
        backtracking(num, used, set, list);

        //Backtrack
        list.remove(list.size() - 1);
        used[i] = false;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0 ; i < n ; i++){
            num[i] = sc.nextInt();
        }
       System.out.println( permute(num) );
    }
}
