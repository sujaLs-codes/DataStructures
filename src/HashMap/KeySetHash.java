package HashMap;

import java.util.HashMap;
import java.util.Set;

public class KeySetHash {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Adi", 26);
        hm.put("Arn", 21);
        hm.put("Ansh",20);
        hm.put("Abhi", 21);
        hm.put("Dev", 20);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String str : keys){
            System.out.println("Key = " + str +", Value = " + hm.get(str));
        }
    }
}
