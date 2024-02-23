package HomeWorks;

public class HomeWork25 {
    public static void main(String[] args) {
        Figure[] array = new Figure[3];
        array[0] = new Figure(10,20);
        array[1] = new Rectangle(10,20);
        array[2] = new Triangle(10,20);
        array[0].Area();
        array[1].Area();
        array[2].Area();
    }
}
class Figure {

    int side1;
    int side2;

    public Figure(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    void Area (){
        System.out.println("Площадь фигуры не определена: " + (double) 0);
    }
}

class Rectangle extends Figure{

    public Rectangle(int side1, int side2) {
        super(side1, side2);
    }

    @Override
    void Area() {
        System.out.println("Площадь прямоугольника: " + (double) side1 * side2);
    }
}
class Triangle extends Figure{
    public Triangle(int side1, int side2) {
        super(side1, side2);
    }

    @Override
    void Area() {
        System.out.println("Площадь треугольника: " + (double) side1 * side2 / 2);
    }
}
