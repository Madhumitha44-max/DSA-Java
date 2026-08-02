import java.util.Scanner;

public class searchInsert {

public static int search(int[] num,int target) {
    
    int l = 0,h = num.length-1;
    while(l < h){
        int mid =  l+(l+h)/2;
        if(target == num[mid]) {
            
            return mid;

        }
        else{
            if(target < num[mid]) {
                
                h = mid-1;
            }else {
                l = mid+1;
            }
        }
    }
    return l;
    }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){

            num[i] = sc.nextInt();

        }
        System.out.println(search(num,target));
    }
}
