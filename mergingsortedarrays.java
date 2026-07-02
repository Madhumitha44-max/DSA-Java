import java.util.Scanner;
public class mergingsortedarrays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int n1=sc.nextInt();
       int[] num1=new int[n1];
       System.out.println("Enter the elements of the first array: ");
       for(int i=0;i<num1.length;i++){
        num1[i]=sc.nextInt();
       }
System.out.println("Enter the size of the 2nd array");
        int n2=sc.nextInt();
       int[] num2=new int[n2];
       System.out.println("Enter the elements of the 2nd array: ");
       for(int j=0;j<num2.length;j++){
        num2[j]=sc.nextInt();
       }
       sc.close();
       int i=n1-1;
       int j=n2-1;
       int k=n1+n2-1;
       while(i>=0&&j>0){
        if(num1[i]>num2[j]){
            num1[k]=num1[i];
            i--;
        }else{
            num1[k]=num2[j];
            j--;
        }
        k--;
       }
       while(j>=0){
        num1[k]=num2[j];
        j--;
        k--;
       }
       for(int x:num1){
        System.out.println(x+" ");
       }
    }
}