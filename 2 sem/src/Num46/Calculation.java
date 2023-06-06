package Num46;

import java.util.HashMap;

public class Calculation {

    String data;
    HashMap<String, Integer> map = new HashMap<>();
    int otvet = 0;

    public int calculate(String userData){
        data = userData;

        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        for (int i = 0; i < data.length(); i++) {
            if (i != data.length() - 1) {
                if (map.get(data.substring(i, i + 1)) < map.get(data.substring(i + 1, i + 2))) {
                    otvet -= map.get(data.substring(i, i + 1));
                } else if (map.get(data.substring(i, i + 1)) >= map.get(data.substring(i + 1, i + 2))) {
                    otvet += map.get(data.substring(i, i + 1));
                }
            } else {
                otvet += map.get(data.substring(i));
            }
        }
        return otvet;
    }
}
