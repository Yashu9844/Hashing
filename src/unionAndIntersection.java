import java.util.HashSet;

public class unionAndIntersection {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr3[]={6,3,9,2,9,4};
        HashSet<Integer> set=new HashSet<>();
        for (Integer see : arr1){
            set.add(see);
        }
        for (Integer see:arr3){
            set.add(see);
        }
        System.out.println("Union size :"+set.size());

        //Set clear karo intersaction keliye

        set.clear();

        for (Integer see : arr1){
            set.add(see);
        }

        int count=0;

        for (int i=0;i<arr3.length;i++){
            if (set.contains(arr3[i])) {
                count++;
                set.remove(arr3[i]);

            }
        }

        System.out.println("Intersection count is :"+ count);

    }
}
