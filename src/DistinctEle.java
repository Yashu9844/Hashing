import java.util.HashSet;

public class DistinctEle {
    public static void main(String[] args) {
        int num[]={4,3,2,5,6,7,3,4,2,1};

        HashSet<Integer> set = new HashSet<>();
        for (Integer see : num){
            set.add(see);
        }
        System.out.println(set.size());
    }
}
