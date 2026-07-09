import java.util.Scanner;

public class twoSum {

    public static void  calSum(int[] num,int target) {
    
    //Initializing the two indices

    int i1 = 0,i2 = 0;
    for(int i = 0; i < num.length; i++) {

        for(int j = i+1; j < num.length; j++) {

         int sum = num[i] + num[j];

         //If the current sum is matching the target sum then stop the iteration and return the indices...

         if(sum == target){
            i1 = i;
            i2 = j;
            break;
         }
        }
      }
     System.out.println("The two indices are :"+i1 +" and " +i2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        calSum(num,target);
    }
}
