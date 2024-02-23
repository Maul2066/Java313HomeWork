package HomeWorks.HomeWork26;

public class Ball extends Figure {
    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double throw_result() {
            return (double) 4 / 3 * Math.PI * Radius * Radius * Radius;
    }
    @Override
    public void Volume() {
        System.out.printf("Фигура: шар      | Объем фигуры: %.2f%n", throw_result());
    }
}
