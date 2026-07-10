import java.util.Scanner;
public class maximumconsecutiveones{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
       int[] num=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
int count=0;
int max=0;
for(int i=0;i<num.length;i++){
    if(num[i]==1){
        count++;
        if(count>max){
            max=count;
        }
    }else{
            count=0;
        }
}
System.out.println("The maximun consecutive ones are "+max);
    }
}