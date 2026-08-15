import java.util.Scanner;

public class kokobanana {
    
    public static int find(int[] num, int hours) {

        int max=-1;

        for(int i = 0; i < num.length - 1; i++) {

            max=Math.max(max,num[i]);

        }
        int l = 1, h = max;
        while( l<= h ) {

            int mid = l + (h - l)/2;
            int th = 0;

            for(int nums : num) {

                th+=(nums+mid-1)/mid;

            }

            if( th <= hours) {

                h = mid - 1;

            }
            else {

                l = mid + 1;

            }
        }
        return l;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){

            num[i] = sc.nextInt();

        }
        System.out.println(find(num,hours));
    }
    
}
