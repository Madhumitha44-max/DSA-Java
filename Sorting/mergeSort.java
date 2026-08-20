import java.util.ArrayList;
import java.util.Scanner;

public class mergeSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Arary");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements of the Array");
        for (int i = 0; i <= num.length-1; i++) {

            num[i] = sc.nextInt();

        }
        mergesort(num,0,num.length-1);
        for (int i = 0; i <=num.length-1; i++) {

            System.out.print(num[i]+" ");

        }
    }
        public static void mergesort(int num[],int low,int high){

            if(low >= high){

                return;

            }

            int mid=(low+high)/2;
            mergesort(num,low,mid);
            mergesort(num,mid+1,high);
            merge(num,low,mid,high);

        }
        public static void merge(int num[],int low,int mid,int high){

            ArrayList <Integer> temp = new ArrayList<>();
            int left = low;
            int right = mid+1;
            while(left <= mid && right <= high){

                if(num[left] < num[right]){

                   temp.add(num[left]);
                   left++;

                }
                else{

                    temp.add(num[right]);
                    right++;

                }
            }
            while(left<=mid){

                temp.add(num[left]);
                left++;

            }
            while(right<=high){

                temp.add(num[right]);
                right++;

            }
            for(int i=low;i<=high;i++){

                num[i]=temp.get(i-low);

            }
        }
}
