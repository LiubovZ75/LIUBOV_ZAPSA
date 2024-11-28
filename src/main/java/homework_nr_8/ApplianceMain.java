package homework_nr_8;

public class ApplianceMain {
    public static void main(String[] args) {
        Appliance m1 = new WashingMachine( "LG", 2000, 7.5);
        Appliance m2 = new Microwave("Samsung", 1200,true);
        Appliance m3 = new AirConditioner( "Daikin", 1500,12000, true);

        Appliance[] appliances = new Appliance[]{m1 , m2, m3};
        for (Appliance appliance : appliances){
            appliance.displayInfo();
            System.out.println();

            
        }
    }

}
