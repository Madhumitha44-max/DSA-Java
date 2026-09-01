import java.util.*;

public class NextwarmDay {
    
    public static int[] find(int[] num) {

        Stack<Integer> stack = new Stack<>();
        int[] a = new int[num.length];
        for(int i =0; i < num.length; i++) {

            while(!stack.isEmpty() && num[i] > num[stack.peek()]) {

                int h = stack.pop();
                a[h] = i - h;
            }
            stack.push(i);
        }
        return a;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < num.length; i++) {

            num[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(find(num)));
    }
}