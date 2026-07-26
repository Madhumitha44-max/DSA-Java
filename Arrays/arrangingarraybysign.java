import java.util.Scanner;

public class arrangingarraybysign {
    
    public static void rearrange(int[] num) {
        int[] ans=new int[num.length];
        int p=0,n=1;
      for(int i=0;i<num.length;i++) {

        if(num[i]>0) {
            ans[p]=num[i];
            p+=2;
        }
        else {
            ans[n]=num[i];
            n+=2;
        }
      }
      for (int i = 0; i < num.length; i++) {

            System.out.print(ans[i]+" ");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){

            num[i] = sc.nextInt();

        }
        rearrange(num);
    }
}
