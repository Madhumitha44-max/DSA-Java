import java.util.Scanner;
public class movingzerosbruteforce{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
       int[] num=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
      int j=0;
       for(int i=0;i<n;i++){
if(num[i]!=0){
    num[j]=num[i];
    j++;
}
       }
while(j<n){
    num[j]=0;
    j++;
}
   for(j=0;j<n;j++){
    System.out.print(num[j] +" ");
   }    
    }
}