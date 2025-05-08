package HashMap;

import java.util.HashMap;

public class HashUpdate {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1, "Ansh");
        hm.put(2, "Abhi");
        hm.put(3, "Deva");

        System.out.println("Initial Map : " + hm);
        System.out.println("<======================================>");

        hm.put(3, "Aditya");
        System.out.println("Updated Map : " + hm);
    }
}
