import java.util.Scanner;

public class nextPermutation {

    public static void find(int[] num) {
        int n = num.length;
        int k = -1;
        for(int i = n-2; i >= 0; i--) {

            if(num[i] < num[i+1]){
                k = i;
               break;
            }

        }
        if(k != -1) {

        for(int j = n-1; j >= 0; j--) {

            if(num[k] < num[j]) {
                swap(num, k , j);
                break;
            }

        }
        reverse(num, k+1 ,n-1);
    }
    else{

        reverse(num, 0 , n-1);

    }
        for (int i = 0; i < num.length; i++) {

            System.out.print(num[i]+" ");

        }
    }
    public static void swap(int[] num,int k,int j) {

        int temp = num[k];
        num[k] = num[j];
        num[j] = temp;

    }
    public  static void reverse(int[] num,int l,int r) {

        while(l < r) {
            swap(num,l,r);
            l ++;
            r --;
        }

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){

            num[i] = sc.nextInt();

        }
        find(num);
    }
}
