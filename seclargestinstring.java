import java.util.Scanner;
public class seclargestinstring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
       int max=0;
       int secmax=0;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
       if(Character.isDigit(ch)){
int digit=ch-'0';
if(digit>max){
    secmax=max;
    max=digit;
}else if(digit<max&&digit>secmax){
    secmax=digit;
}
       }
       }
       System.out.println("The second largest in given String is "+secmax);
    }
}