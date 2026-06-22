import java.util.Scanner;
public class movingzerosbruteforce{
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
       int[] num=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
       //Adding non-zero elements to temporary array
       System.out.println("Enter the number of zeros on given array");
       int k=sc.nextInt();
       k=n-k;
       int[] temp=new int[k];
for(int i=0;i<k;i++){
    if(num[i]!=0){
        temp[i]=num[i];
    }
}
for(int i=k-1;i<n;i++){
    num[i]=0;
}
for(int i=0;i<=num.length-1;i++){
            System.out.print(num[i]+" ");
        }
    }
}