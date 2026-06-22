import java.util.Scanner;
public class movingzerosoptimal{
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
       int j=-1;
for(int i=0;i<n;i++){
    if(num[i]!=0){
        j=i;
        break;
    }
}
for(int i=j+1;i<n;i++){
    if(num[i]!=0){
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;
        j++;
    }
}
for(int i=0;i<=num.length-1;i++){
            System.out.print(num[i]+" ");
        }
    }
}