import java.util.Scanner;
public class maxconsecutive{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
       int[] num=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
       int count=1;
       int max=1;
for(int i=0;i<num.length-1;i++){
    if(num[i]==num[i+1]){
        count++;
    }else{
        count=1;
    }
}
if(count>max){
max=count;
       }
System.out.println("The maximun consecutive numbers are :" +max);
}
}
