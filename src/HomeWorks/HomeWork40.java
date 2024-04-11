package HomeWorks;

public class HomeWork40 {
    public static void main(String[] args) {
        Thread thread = new Thread(new TrafficLight_Settings());
        thread.run();
    }
}
enum TrafficLight_Colors {
    Green("GREEN"),
    Yellow("YELLOW"),
    Red("RED");

    String color;

    TrafficLight_Colors(String color) {
        this.color = color;
    }

}
class TrafficLight_Settings implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(10000);
                System.out.println(TrafficLight_Colors.Red.color);
                Thread.sleep(5500);
                System.out.println(TrafficLight_Colors.Yellow.color);
                Thread.sleep(8000);
                System.out.println(TrafficLight_Colors.Green.color);
            } catch (InterruptedException exception){
                System.out.println(exception);
            }
        }
    }
}