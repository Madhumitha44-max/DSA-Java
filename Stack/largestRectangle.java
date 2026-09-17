import java.util.Scanner;
import java.util.Stack;

public class largestRectangle {
    
    public static int largestRectangleArea(int[] num) {
        Stack <Integer> s = new Stack<>();
        int nextSmaller , prevSmaller , maxarea = 0;
        for(int i = 0; i < num.length; i++) {

            while(!s.isEmpty() && num[s.peek()] > num[i]) {
                
                nextSmaller = i;
                int ele = s.peek();
                s.pop();
                prevSmaller = s.isEmpty() ? -1 : s.peek().intValue();
                maxarea = Math.max(maxarea , num[ele] * (nextSmaller - prevSmaller -1));

            }
            s.push(i);
        }
         while(!s.isEmpty()) {

                nextSmaller = num.length;
                int ele = s.peek();
                s.pop();
                prevSmaller = s.isEmpty() ? -1 : s.peek().intValue();
                maxarea = Math.max(maxarea , (num[ele] * (nextSmaller - prevSmaller -1)));

            }
        return maxarea;
    }

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < num.length; i++) {

            num[i] = sc.nextInt();

        }
        System.out.println((largestRectangleArea(num)));
}
}

