import java.util.HashSet;
import java.util.Iterator;
public class hashing{
    public static void main(String[] args) {

        //Creating
        HashSet<Integer> set=new HashSet<>();
        Iterator it=set.iterator();

        //Inserting
        set.add(1);
        set.add(67);
        set.add(34);
        set.add(98);

        //searching
        if(set.contains(1)){
            System.out.println("Number is found");
        }
        if(!set.contains(56)){
            System.out.println("Number is not found");
        }

        //Deleting
        set.remove(98);
        if(!set.contains(98)){
            System.out.println("Number has been removed");
        }

        //size
        System.out.println("The numbers in the hashset are : "+set.size());

        //print all the numbers
        System.out.println(set);

        //Iterator
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
}