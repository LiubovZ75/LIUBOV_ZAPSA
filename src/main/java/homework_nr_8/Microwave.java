package homework_nr_8;

public class Microwave extends Appliance{
    boolean hasGril;

    public Microwave(String brand, int power, boolean hasGril) {
        super(brand, power);
        this.hasGril = hasGril;
    }

    @Override
    public void turnOn() {
        System.out.println("Microwave is now heating food.");

    }


}
