package homework_nr_7part4;

public class Car extends Vehicle {
    int numberOfDoors;
    boolean isElectric;

    public Car(String brand, String model, int year, int numberOfDoors, boolean isElectric) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
        this.isElectric = isElectric;
    }

    public void displayInfo(){
         System.out.println("NumberOfDoor: " + numberOfDoors + "isElectric: " + isElectric );
     }
}
