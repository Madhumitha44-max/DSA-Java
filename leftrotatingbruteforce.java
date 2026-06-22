import java.util.Scanner;
public class leftrotatingbruteforce{
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
System.out.println("Enter the the number of positions by which array need to be left rotated: ");
int d=sc.nextInt();
//storing in temp array
int[] temp=new int[d];
for(int i=0;i<d;i++){
    temp[i]=num[i];
    }
//shifting
for(int i=d;i<n;i++){
    num[i-d]=num[i];
}
//moving elements to arr from temp
    for(int i=n-d;i<n;i++){
        num[i]=temp[i-(n-d)];
    }
    for (int i = 0; i <=num.length-1; i++) {
            System.out.print(num[i]+" ");
        }
    }
}
