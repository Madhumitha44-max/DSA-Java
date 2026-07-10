import java.util.*;
public class nextGreatest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Creating the first Array 
        int n1=sc.nextInt();
        int[] num1=new int[n1];
        for(int i=0;i<n1;i++){
            num1[i]=sc.nextInt();
        }

        //Creating the second Array
        int n2=sc.nextInt();
        int[] num2=new int[n2];
        for(int i=0;i<n2;i++){
            num2[i]=sc.nextInt();
        }

        //Collection Frameworks
        Stack<Integer>st=new Stack<>();
        HashMap<Integer,Integer>map=new HashMap<>();

        //Iterating through the 2nd array and performing operations on stack accordingly
        for(int i=num2.length-1;i>=0;i--){
           while(!st.isEmpty()&&st.peek()<=num2[i]){
            st.pop();
           }
           if(st.isEmpty()){
            map.put(num2[i],-1);
           }else{
            map.put(num2[i],st.peek());
           }
           st.push(num2[i]);
        }

        //Creating a connection between both the Arrays...
        int[] a=new int[num1.length];
        for(int i=0;i<n1;i++){
            a[i]=map.get(num1[i]);
        }

        //Printing the final array
        for(int i=0;i<n1;i++){
        System.out.print(a[i]+" ");
        }
    }
}
