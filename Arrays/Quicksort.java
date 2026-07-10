import java.util.Scanner;
public class Quicksort{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an Array");
    int n=sc.nextInt();
    System.out.println("Enter the elements in an Array");
    int[] num=new int[n];
    for(int i=0;i<=n-1;i++){
        num[i]=sc.nextInt();
    }
        quicksort(num,0,num.length-1);
        for(int i=0;i<=num.length-1;i++){
            System.out.print(num[i]+" ");
        }
}
public static void quicksort(int num[],int low,int high){
    if(low>=high){
return ;
    }
int pe=quick(num,low,high);
quicksort(num,low,pe-1);
quicksort(num,pe+1,high);
}
public static int quick(int num[],int low,int high){
    int i=low;
    int j=high;
    int pivot=num[low];
while(i<j){
while(num[i]<=pivot&&i<=high-1){
    i++;
}
while(num[j]>pivot&&j>=low+1){
    j--;
}
if(i<j){
    int temp=num[j];
    num[j]=num[i];
    num[i]=temp;
}
}
int temp=num[low];
num[low]=num[j];
num[j]=temp;
return j;
}
}