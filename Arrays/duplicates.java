import java.util.Scanner;
public class duplicates{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
       int[] num=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
       int k=duplicate(num,0);
       System.out.println("The size of non-duplicate array is "+k);
       for (int i = 0; i <=num.length-1; i++) {
            System.out.print(num[i]+" ");
        }
    }
       public static int duplicate(int num[],int i){ 
        i=0;
for(int j=1;j<num.length;j++){
    if(num[j]!=num[i]){
        num[i+1]=num[j];
        i++;
    }
}
return (i+1);
       }
}