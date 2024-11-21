package homework_nr_7part4;

public class Motorcycle  extends  Vehicle{
    double engineCapacity;
    boolean hasABS;

    public Motorcycle(String brand, String model, int year, double engineCapacity, boolean hasABS) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
        this.hasABS = hasABS;
    }

    public void displayInfo(){
         System.out.println("EngineCapacity: " + engineCapacity + "HasABS: " + hasABS);
     }
}
