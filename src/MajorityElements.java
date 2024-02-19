import java.util.HashMap;
import java.util.Set;
import java.util.*;

public class MajorityElements {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1};

        HashMap<Integer,Integer> mp = new HashMap<>();


        for (int i=0;i< arr.length;i++){
            if (mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else {
                mp.put(arr[i],1);
            }
        }
//           or use use this in for loop mp.put(arr[i],mp.getOrDefualt(arr[i],defaultValue:0)+1
        Set<Integer> KeySet= mp.keySet();  //Small k
        for (Integer Key : KeySet){
            if (mp.get(Key) > arr.length/3){
                System.out.println("Yea it is this Key :  "+Key);
            }

        }

    }
}
