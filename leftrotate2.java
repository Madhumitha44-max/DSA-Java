import java.util.Scanner;
public class leftrotate2{
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
leftrotate(num,d,num.length);
for (int i = 0; i <=num.length-1; i++) {
            System.out.print(num[i]+" ");
        }
    }
    public static void leftrotate(int num[],int d,int n){
reverse(num,0,d-1);
reverse(num,d,n-1);
reverse(num,0,n-1);
    }
    public static void reverse(int num[],int start,int end){
while(start<end){
    int temp=num[end];
    num[end]=num[start];
    num[start]=temp;
    start++;
    end--;
}
    }
}    