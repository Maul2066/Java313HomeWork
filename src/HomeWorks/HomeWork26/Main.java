package HomeWorks.HomeWork26;
public class Main {
    public static void main(String[] args) {
        
        Figure[] array = new Figure[3];
        array[0] = new Ball(4.5);
        array[1] = new Cylinder(2, 2);
        array[2] = new Pyramid(2000, 3);
        for (Figure figure : array) {
            figure.Volume();
        }
    }
}
