package HomeWorks.HomeWork27;
public class Rectangle implements Resize{
    int Width;
    int Height;

    public Rectangle(int WIDTH, int HEIGHT) {
        this.Width = WIDTH;
        this.Height = HEIGHT;
    }

    @Override
    public void resize_Width(int Width_) {
        Width = Width_;
    }

    @Override
    public void resize_Height(int Height_) {
        Height = Height_;
    }

    @Override
    public void Resize_Width_and_Height(int Width_, int Height_) {
        Width = Width_;
        Height = Height_;
    }

    void information(){
            System.out.printf("Width: %d, Height: %d%n", Width, Height);
    }
}
