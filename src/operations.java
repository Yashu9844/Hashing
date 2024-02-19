import java.util.HashMap;

public class operations {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India" , 150);
        map.put("China", 100);
        map.put("Bhutan" , 50);
        map.put("us",80);

        System.out.println(map);//UnOrder

        System.out.println(map.get("India"));

        System.out.println(map.containsKey("India"));

        map.remove("Bhutan");

        System.out.println(map);//bhutan deleted
        System.out.println();


        map.clear(); //clear karo

        System.out.println("Yes You dont have any Key Its all clear"+ map.isEmpty());


    }
}
