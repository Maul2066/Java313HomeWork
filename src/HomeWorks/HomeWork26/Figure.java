package HomeWorks.HomeWork26;
public abstract class Figure {
    double Square;
    double Radius;
    double Height;

    public Figure(double radius, double height) {
        Radius = radius;
        Height = height;
    }

    public Figure(double radius) {
        Radius = radius;
    }

    public abstract double throw_result();
    public abstract void Volume ();
}
