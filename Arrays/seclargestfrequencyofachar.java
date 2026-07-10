import java.util.*;
public class seclargestfrequencyofachar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
HashMap<Character,Integer>map=new HashMap<>();
for(char ch:s.toCharArray()){
    map.put(ch,map.getOrDefault(ch,0)+1);
}
int max=0;
int secmax=0;
char secchar='v';
for(Map.Entry<Character,Integer>entry:map.entrySet()){
    int freq=entry.getValue();
    char ch=entry.getKey();
    if(freq>max){
        secmax=max;
        max=freq;
    }else if(freq>secmax&&freq<max){
        secmax=freq;
        secchar=ch;
    }
}
for(Map.Entry<Character,Integer>entry:map.entrySet()){
    if(entry.getValue()==secmax){
        secchar=entry.getKey();
    }
}
System.out.println("The second largest frequency character is :"+secchar);
    }
}