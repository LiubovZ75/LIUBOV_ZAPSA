package homework_nr_8;

public abstract class Appliance {
    String brand;
    int power;

    public Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    public abstract void turnOn();

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Power: " + power);
        turnOn();


    }
}







