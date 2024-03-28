package HomeWorks;

import java.util.LinkedHashMap;

public class HomeWork36 {
    public static void main(String[] args) {
        LinkedHashMap<Generate, Generate> linkedHashMap = new LinkedHashMap<>();
        Generate generate = new Generate<>("X");
        Generate generate_1 = new Generate<>("Y");
        Generate generate_2 = new Generate<>("Z");
        Generate generate_3 = new Generate<>(1);
        Generate generate_4 = new Generate<>(2);
        Generate generate_5 = new Generate<>(3);
        linkedHashMap.put(generate, generate_3);
        linkedHashMap.put(generate_1, generate_4);
        linkedHashMap.put(generate_2, generate_5);
        System.out.println("Исходный Map: " + linkedHashMap);
        reverse(linkedHashMap);
    }
    public static void reverse (LinkedHashMap<Generate, Generate> map){
        Generate[] array_object_1 = new Generate[map.size()];
        Generate[] array_object_2 = new Generate[map.size()];
        array_object_1 = map.keySet().toArray(new Generate[]{});
        array_object_2 = map.values().toArray(new Generate[]{});
        for (int i = 0; i < map.size(); i++) {
            if (map.containsKey(array_object_1[i])){
                map.remove(array_object_1[i]);
                map.put(array_object_2[i], array_object_1[i]);
            }
        }
        System.out.println("Измененный Map: " + map);
    }
}
class Generate<T>{
    public T object;

    public Generate(T object) {
        this.object = object;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "" + object;
    }
}
