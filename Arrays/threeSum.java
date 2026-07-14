import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class threeSum {

    public static List<List<Integer>> sum(int[] num) {

        List<List<Integer>> set = new ArrayList<>();
        Arrays.sort(num);
        for(int i = 0; i < num.length-2; i++) {

           if(i>0 && num[i] == num[i-1]) {

             continue;
           }
           int j = i+1, k = num.length-1;
           while(j < k) {
            int sum = num[i]+num[j]+num[k];
           if(sum > 0) {

            k--;

           } else if(sum<0) {

            j++;

           } else {

            set.add(Arrays.asList(num[i],num[j],num[k]));
            k--;
            j++;

            while(j > k && num[j] == num[j-1]) {

             j++;

            }
            while(j > k && num[k] == num[k+1]){
                
                k--;
            }
        }
        }
        }
        return set;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){

            num[i] = sc.nextInt();

        }
        System.out.println(sum(num));
    }
}