import java.util.Scanner;
public class maxconstraint{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
       int[] num=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
       int max=0;
for(int i=0;i<num.length;i++){
    for(int j=num.length-1;j>=0;j--){
        if(num[i]<=num[j]){
            if((j-i)>max){
                max=j-i;
            }
        }
    }
}
System.out.println(max);
    }
}