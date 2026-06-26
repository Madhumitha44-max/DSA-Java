import java.util.Scanner;
public class missingnumoptimal2{ 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
       int[] num=new int[n-1];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
int x=0;
for(int i=0;i<n-1;i++){
    x^=num[i];
    x^=(i+1);
}
x^=n;
System.out.println("the missing number is "+x);
    }
}
