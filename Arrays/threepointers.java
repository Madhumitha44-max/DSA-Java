import java.util.Scanner;

public class threepointers {

    public static void sum(int[] arr) {

        int start = 0, mid = 0, end = arr.length-1;
        while(mid < end) {

            if(arr[mid] == 0) {

                int temp = arr[mid];
                arr[mid] = arr[start];
                arr[start] = temp;
                start ++;
                mid  ++;
                
            } 
            else if(arr[mid] == 2) {

                int temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;
                end --;

            }
            else {

                mid++;

            }
        }
        for(int num : arr) {

            System.out.print(num+" ");
            
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){

            arr[i] = sc.nextInt();

        }
        sum(arr);
    }
}
