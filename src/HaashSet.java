import java.util.HashSet;
import java.util.Iterator;

public class HaashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(2);//Not Added
        set.add(1);//Not Added
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        System.out.println();

        set.remove(4);
        set.remove(5);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        System.out.println();

//        set.clear();
//        System.out.println(set.size());
//        System.out.println(set.isEmpty());

     Iterator it = set.iterator();
     while (it.hasNext()){
         System.out.println(it.next());
     }



    }
}
