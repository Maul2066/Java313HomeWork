package HomeWorks.HomeWork26;

public class Pyramid extends Figure{
    public Pyramid(double height, double square) {
        super(height, height);
        this.Square = square;
    }

    @Override
    public double throw_result() {
        return (double) 1/3 * Square * Height;
    }

    @Override
    public void Volume() {
        System.out.printf("Фигура: Пирамида | Объем фигуры: %.2f%n",throw_result());
    }
}
