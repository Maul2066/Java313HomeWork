package HomeWorks.HomeWork22;

public class Car {
    private String Model_name;
    private int Year_of_issue;
    private String Manufacturer;
    private int Engine_power;
    private String Color;
    private int Price;

    public Car() {

    }

    public Car(String model_name, int year_of_issue, String manufacturer, int engine_power, String color, int price) {
        this.Model_name = model_name;
        this.Year_of_issue = year_of_issue;
        this.Manufacturer = manufacturer;
        this.Engine_power = engine_power;
        this.Color = color;
        this.Price = price;
    }

    public String getModel_name() {
        return this.Model_name;
    }

    public int getYear_of_issue() {
        return this.Year_of_issue;
    }

    public String getManufacturer() {
        return this.Manufacturer;
    }

    public int getEngine_power() {
        return this.Engine_power;
    }

    public String getColor() {
        return this.Color;
    }

    public int getPrice() {
        return this.Price;
    }

    public void setModel_name(String model_name) {
        Model_name = model_name;
    }

    public void setYear_of_issue(int year_of_issue) {
        Year_of_issue = year_of_issue;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public void setEngine_power(int engine_power) {
        Engine_power = engine_power;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setPrice(int price) {
           Price = price;
    }

    void Throw_Information(){
        System.out.println("********** Данные автомобиля **********");

        if (getModel_name() != null){
            System.out.println("Название модели: " + getModel_name());
        } else {
            System.out.println("Название модели: " + "Empty");
        }

        if (getYear_of_issue() >= 1886){
            System.out.println("Год выпуска: " + getYear_of_issue());
        } else {
            System.out.println("Год выпуска: " + "Empty");
        }

        if (getManufacturer() != null){
            System.out.println("Производитель: " + getManufacturer());

        } else {
            System.out.println("Производитель: " + "Empty");
        }

        if (getEngine_power() > 0){
            System.out.println("Мощность двигателя: " + getEngine_power() + " л.c");
        } else {
            System.out.println("Мощность двигателя: " + "Empty");
        }

        if (getColor() != null){
            System.out.println("Цвет машины: " + getColor());
        } else {
            System.out.println("Цвет машины: " + "Empty");
        }

        if (getPrice() > 0){
            System.out.println("Цена: " + getPrice());
        } else {
            System.out.println("Цена: " + "Empty");
        }

        System.out.println("=======================================");
    }
}
