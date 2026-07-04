import java.util.*;
public class subsets {
    public static List<List<Integer>> subset(int[] num){
        List<List<Integer>>set=new ArrayList<>();
        backtracking(num,0,set,new ArrayList<>());
        return set;
    }
    public static void backtracking(int[] num,int i,List<List<Integer>>set,List<Integer>list){

        //Terminating condition
        if(i==num.length){
            set.add(new ArrayList<>(list));
            return;
        }

        //Adding the elements into the list
        list.add(num[i]);
        backtracking(num, i+1, set, list);

        //Backtracking
        list.remove(list.size()-1);

        //Exclude current Element
        backtracking(num,i+1,set,list);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.println(subset(num));
    }
}
