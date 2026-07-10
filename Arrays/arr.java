import java.util.Scanner;
public class arr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the size of the array");
int n=sc.nextInt();
int[] num=new int[n];
System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search");
int x=sc.nextInt();
        for(int i=0;i<num.length;i++){
            if(num[i]==x){
            System.out.println("Element found at" +i);
            }
        }
    }
}