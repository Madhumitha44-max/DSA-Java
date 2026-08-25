import java.util.*;

public class ThreeSum {

    @SuppressWarnings("UnnecessaryContinue")
    public static List<List<Integer>> find(int[] num) {

        List<List<Integer>> temp = new ArrayList<>();
        Arrays.sort(num);
        for(int i = 0; i < num.length; i++) {

             if(i > 0 && num[i] == num[i - 1]) {

                continue;
                
            }     
            int j = i + 1 , k = num.length - 1;
            while(j < k) {

                int sum = num[i] + num[j] + num[k];
                if(sum > 0) {

                    k--;

                }
                else if(sum < 0) {

                    j++;

                }
                else {

                    temp.add(Arrays.asList(num[i],num[j],num[k]));
                    k--;
                    j++;
                    while(j<k&&num[j]==num[j-1]) {
                        j++;
                    }
                    while(j<k&&num[k]==num[k+1]) {
                        k--;
                    }

                }
            }  
        }
        return temp; 
    }    
    @SuppressWarnings("ImplicitArrayToString")
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
