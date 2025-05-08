package HashMap;

import java.util.HashMap;

public class Hash3 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Ansh");
        hm.put(2, "Abhi");
        hm.put(3, "Deva");

        HashMap<Integer, String> hm2 = new HashMap<>(hm);

        System.out.println("Mapping of hashmap hm are : " + hm);
        System.out.println("Mapping of hashmap hm2 are : " + hm2);
    }
}
