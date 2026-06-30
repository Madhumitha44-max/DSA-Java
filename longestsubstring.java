import java.util.*;
public class longestsubstring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
       int left=0;
       int maxlength=0;
       HashSet<Character>set=new HashSet<>();
       for(int right=0;right<s.length();right++){
        char ch=s.charAt(right);
        while(set.contains(ch)){
            set.remove(s.charAt(left));
left++;
        }
        set.add(ch);
        maxlength=Math.max(maxlength,right-left+1);
       }
       System.out.println("The maximum length of longestsubstring is :"+maxlength);
    }
}