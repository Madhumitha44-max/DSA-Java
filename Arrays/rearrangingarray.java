import java.util.*;

public class rearrangingarray {

    public static void arrange(int[] num) {

      int p = 0,n = 0;
      for(int i = 0; i < num.length; i++) {

           if(num[i] > 0) {
            p++;
           } 
           else {
            n++;           
        }
    }
        int[] pos = new int[p];
        int[] neg = new int[n];
        int pi = 0, ni = 0;
        for(int i = 0; i < num.length; i++) {
           if(num[i] > 0) {
            pos[pi++] = num[i];
           } else {
            neg[ni++] = num[i];           
        }
    }
      if(pos.length > neg.length) {

          for(int i = 0; i < neg.length; i++) {

            num[2*i] = pos[i];
            num[2*i+1] = neg[i];

          }
          int index = neg.length*2;
          for(int i = neg.length; i < pos.length; i++) {

            num[index] = pos[i];
            index++;

          }

      } 
      else {
        for(int i=0;i<pos.length;i++) {

            num[2*i]=pos[i];
            num[2*i+1]=neg[i];

          }
          int index=pos.length*2;
          for(int i=pos.length;i<neg.length;i++) {

            num[index]=neg[i];
            index++;
            
          }
      }
      for (int i = 0; i < num.length; i++) {

            System.out.print(num[i]+" ");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){

            num[i] = sc.nextInt();

        }
        arrange(num);
    }
}
