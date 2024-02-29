package HomeWorks;

public class HomeWork28 {
    public static void main(String[] args) {
        System.out.printf("Скорость %s составляет %d миль в час.%n%n", Transport.AIRPLANE.transport_name, Transport.AIRPLANE.miles);
        System.out.println("Скорость транспортных средств: ");
        for (Transport transport: Transport.values()) {
            System.out.println(transport.name() + " типичная скорость составляет " + transport.miles + " миль в час.");
        }
    }
}

enum Transport {
    CAR(65, "машины"),
    TRUCK(55, "грузовика"),
    AIRPLANE(600, "самолета"),
    TRAIN(70, "поезда"),
    BOAT(22, "лодки");

    final int miles;
    final String transport_name;

    Transport(int miles, String transportName) {
        this.miles = miles;
        transport_name = transportName;
    }
}