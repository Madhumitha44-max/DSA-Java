import java.util.Scanner;

public class majorityelement {

    public static int find(int[] num){

      int count = 0, element = 0;

      for(int i =0 ; i < num.length; i++) {

        if(count == 0) {

           element = num[i];
           count = 1;

        }
        else if(num[i] == element) {

           count ++;

        }
        else{

            count --;

        }
      }
      for(int i = 0; i < num.length; i++) {

        if(num[i] == element) {
            
            count ++;
        }
        if(count > (num.length)/2) {

        }
      }
      return element;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){

            num[i] = s.nextInt();

        }
        s.close();
        System.out.println(find(num));

    }
}
