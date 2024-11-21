package homework_nr_7part4;

public class VehicleMain {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "Model S",2023,4,true);
        Motorcycle motorcycle = new Motorcycle("Vamaha", "YZF-R3",2021,321.0,true);
        car1.displayInfo();
        motorcycle.displayInfo();
   }

}
