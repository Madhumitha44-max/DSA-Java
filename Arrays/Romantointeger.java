import java.util.HashMap;
import java.util.Scanner;
public class Romantointeger{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
HashMap<Character,Integer>map=new HashMap<>();
map.put('I',1);
map.put('V',5);
map.put('X',10);
map.put('L',50);
map.put('C',100);
map.put('D',500);
map.put('M',1000);
int result=0;
for(int i=0;i<s.length();i++){
char curr=s.charAt(i);
if(i+1<s.length()&&map.get(curr)<map.get(s.charAt(i+1))){
    result-=map.get(curr);
}else{
    result=+map.get(curr);
}
System.err.println(result);
}
    }
}