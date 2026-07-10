import java.util.*;
public class combinationsum {
    public static List<List<Integer>> findingsum(int[] num,int target){
       List<List<Integer>>set=new ArrayList<>();
       backtracking(num,target,0,set,new ArrayList<>());
       return set;
    }
    public static void backtracking(int[] num,int target,int i,List<List<Integer>>set,List<Integer>list){

        //Terminating conditions
       if(target==0){
        set.add(new ArrayList<>(list));
        return;
       }
       if(target<0||i==num.length){
        return;
       }

       // Take the current element
       if(num[i]<=target){
        list.add(num[i]);
        backtracking(num,target-num[i],i,set,list);

        //Backtrack
        list.remove(list.size()-1);
       }

       //Skip the current element
       backtracking(num, target, i+1, set, list);
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int target=sc.nextInt();
        int n=sc.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
       System.out.println(findingsum(num,target));
    }
}
