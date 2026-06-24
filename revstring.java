
import java.util.Scanner;
public class revstring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
char[] arr=s.toCharArray();
int left=0;
int right=arr.length-1;
while(left<right){
    char temp=arr[right];
    arr[right]=arr[left];
arr[left]=temp;
left++;
right--;
}
System.err.println("The reversed String is "+new String(arr));
    }
}