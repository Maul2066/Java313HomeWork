package HomeWorks;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HomeWork35 {
    public static void main(String[] args) {
        String[] array = new String[]{"red", "orange", "aqua", "pink", "gray", "blue", "white", "black", "yellow", "brown"};
        Color_1 color = new Color_1(array[0]);
        Color_1 color1 = new Color_1(array[1]);
        Color_1 color2 = new Color_1(array[2]);
        Color_1 color3 = new Color_1(array[3]);
        Color_1 color4 = new Color_1(array[4]);
        Color_1 color5 = new Color_1(array[5]);
        Color_1 color6 = new Color_1(array[6]);
        Color_1 color7 = new Color_1(array[7]);
        Color_1 color8 = new Color_1(array[8]);
        Color_1 color9 = new Color_1(array[9]);
        Map<String, Color_1> color1Map = new HashMap<>();
        color1Map.put(array[0], color);
        color1Map.put(array[1], color1);
        color1Map.put(array[2], color2);
        color1Map.put(array[3], color3);
        color1Map.put(array[4], color4);
        color1Map.put(array[5], color5);
        color1Map.put(array[6], color6);
        color1Map.put(array[7], color7);
        color1Map.put(array[8], color8);
        color1Map.put(array[9], color9);
        int i = 0;
        for (Map.Entry<String, Color_1> entry : color1Map.entrySet()) {
            i++;
            System.out.println(i + ") " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
class Color_1 {
    String name;
    public Color_1(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }
}