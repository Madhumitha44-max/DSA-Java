import java.util.Scanner;
public class movingzeros{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
       int[] num=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
for(int i=0;i<num.length;i++){
    for(int j=0;j<(num.length)-1;j++){
    if(num[j]==0){
            int temp=num[j];
            num[j]=num[j+1];
            num[j+1]=temp;
        }
    }
    }
    for(int i=0;i<num.length;i++){
System.out.print(num[i]  +" ");
}
}
}
