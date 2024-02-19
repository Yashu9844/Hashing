import java.util.LinkedHashMap;

public class LHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",50);
        lhm.put("China",100);
        lhm.put("pakistan",10);

        System.out.println(lhm);
    }
}
