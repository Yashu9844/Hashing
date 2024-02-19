import java.util.HashMap;
import java.util.Set;

public class iteration {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India" , 150);
        map.put("China", 100);
        map.put("Bhutan" , 50);
        map.put("us",80);

        Set<String> Keys = map.keySet();
        System.out.println(Keys);
        for(String s : Keys ){
            System.out.println("Keys :"+ s + ", Value :" + map.get(s));
        }



    }
}