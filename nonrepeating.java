import java.util.Scanner;
public class nonrepeating{
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
              for(int j=0;j<num.length-1;j++){
if(num[j]>num[j+1]){
int temp=num[j+1];
num[j+1]=num[j];
num[j]=temp;
}
              }
       }
       int count=0;
for(int i=0;i<num.length-1;i++){
if(num[i]==num[i+1]){
count++;
}
}
       for(int i=0;i<num.length;i++){
if(count==1){
System.out.println("The non-repeating number is : "+num[i]);
}
       }

}
}