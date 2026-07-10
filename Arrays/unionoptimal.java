import java.util.ArrayList;
import java.util.Scanner;
public class unionoptimal{
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
    if(temp.isEmpty()||temp.get(temp.size()-1)!=a[i]){
        temp.add(a[i]);
    }
    i++;
}else{
    if(temp.isEmpty()||temp.get(temp.size()-1)!=b[j]){
        temp.add(b[j]);
    }
    j++;
}
}
while(i<n1){
    if(temp.isEmpty()||temp.get(temp.size()-1)!=a[i]){
        temp.add(a[i]);
    }
    i++;
}
while(j<n2){
        if(temp.isEmpty()||temp.get(temp.size()-1)!=b[j]){
        temp.add(b[j]);
    }
    j++;
}
System.out.println("Union of the given Arrays is "+temp);
    }
}