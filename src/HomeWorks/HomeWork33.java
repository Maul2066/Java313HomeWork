package HomeWorks;

import java.util.LinkedList;
import java.util.ListIterator;

public class HomeWork33 {
    public static void main(String[] args) {
        Color color = new Color("Красный");
        Color color1 = new Color("Оранжевый");
        Color color2 = new Color("Желтый");
        Color color3 = new Color("Зеленый");
        Color color4 = new Color("Голубой");
        Color color5 = new Color("Синий");
        Color color6 = new Color("Фиолетовый");

        LinkedList<Color> colorLinkedList = new LinkedList<>();
        colorLinkedList.add(color);
        colorLinkedList.add(color1);
        colorLinkedList.add(color2);
        colorLinkedList.add(color3);
        colorLinkedList.add(color4);
        colorLinkedList.add(color5);
        colorLinkedList.add(color6);

        System.out.println("Список: " + colorLinkedList);
        System.out.println();
        System.out.println("Список итераторов в прямом направлении: ");
        ListIterator<Color> listIterator = colorLinkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.println("Индекс = " + listIterator.nextIndex() + ", Элемент = " + listIterator.next());
        }
        System.out.println();
        System.out.println("Список итераторов в обратном направлении: ");
        while (listIterator.hasPrevious()){
            System.out.println("Индекс = "+ listIterator.previousIndex() + ", Элемент = " + listIterator.previous());
        }
    }
}
class Color{
    String color;

    public Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
