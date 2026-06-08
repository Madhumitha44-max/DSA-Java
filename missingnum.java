import java.util.Scanner;
public class missingnum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
       int[] num=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
       }
       boolean miss=false;
       int k=0;
for (int i = 0; i < num.length; i++) {
   if(num[i]!=(i+1)){
miss=true;
k=i+1;
break;
   }
}
if(miss){
System.out.println("Number missed is "+k);
}else{
    System.out.println("Number missed "+(n+1));
}
    }
}