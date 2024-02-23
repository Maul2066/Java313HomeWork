package HomeWorks.HomeWork26;
public class Cylinder extends Figure{

    public Cylinder(double radius, double height) {
        super(radius, height);
    }

    @Override
    public double throw_result() {
        return Math.PI * Radius * Radius * Height;
    }

    @Override
    public void Volume() {
        System.out.printf("Фигура: цилиндр  | Объем фигуры: %.2f%n",throw_result());
    }

}
