package HashMap;

import java.util.HashMap;

public class HashExample1 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("Adi", 26);
        hm.put("Arn", 21);
        hm.put("Ansh",20);
        hm.put("Abhi", 21);
        hm.put("Dev", 20);

        System.out.println(hm);

        //Get - 0(1)
        int population = hm.get("Adi");
        System.out.println(population);

        System.out.println(hm.get("Sujal"));

        //Contains Key = 0(1) for checking the existence
        System.out.println(hm.containsKey("Abhi"));
        System.out.println(hm.containsKey("Kunal"));

        //Remove Operation
        System.out.println(hm.remove("Dev"));
        System.out.println(hm);

        //Size
        System.out.println(hm.size());

        //Empty
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
