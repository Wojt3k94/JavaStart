public class Car {

    int year;
    String brand;
    String model;
    String color;
    String wheelsCOlor;
    String tiresColor;
    int doors;

    Car(int year, String brand, String model, String color){
        this(year, brand, model);
        this.color = color;
        System.out.println("Konstruktor 1");
    }

    Car(int year, String brand, String model){
        this.year = year;
        this.brand = brand;
        this.model = model;
        System.out.println("konstruktor 2");

    }
}
