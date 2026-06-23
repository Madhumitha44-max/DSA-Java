import java.util.ArrayList;
import java.util.Scanner;
public class intersection{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of 1st the array");
        int n1=sc.nextInt();
       int[] a=new int[n1];
       System.out.println("Enter the elements of 1st array: ");
       for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
       }
    System.out.println("Enter the size of the 2nd array");
int n2=sc.nextInt();
       int[] b=new int[n2];
       System.out.println("Enter the elements of the 2nd array: ");
       for(int i=0;i<b.length;i++){
        b[i]=sc.nextInt();
       }
int i=0;
int j=0;
ArrayList<Integer>temp=new ArrayList<>();
while(i<n1&&j<n2){
    if(a[i]<b[j]){
        i++;
    }else if(a[i]>b[j]){
        j++;
    }else{
        temp.add(a[i]);
        i++;
        j++;
    }
}
System.out.print("Intersection of two given arrays is "+temp);
    }
}
