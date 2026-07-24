import java.util.Scanner;

public class productofarray {

    public static void product(int[] num) {

        int[] a = new int[num.length];
        a[0] = 1;
        for(int i = 1; i < num.length; i++) {

            a[i] = a[i-1]*num[i-1];

        }
        int rp = 1;
        for(int i = 1; i < num.length; i++) {

            a[i] *= rp;
            rp *= num[i];

        }

        System.out.println("The product of the array is :");
        for (int i = 0; i < num.length; i++) {

            System.out.print(a[i]+" ");

        }
    }
        public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){

            num[i] = sc.nextInt();

        }
        product(num);
    }
}
