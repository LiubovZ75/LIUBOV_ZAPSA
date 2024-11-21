package homework_nr_7part2;

public class Invoice {

    String model;
    String description;
    int number;
    double price;
    double sum;

    public Invoice(String model, String description, int number, double price) {
        this.model = model;
        this.description = description;
        this.number = number;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = (number > 0) ? number : 0 ;
    }

    public double getPrice() {
        return price = (price > 0) ? price : 0.0;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public double getAmount(){
     sum = number * price;
        return sum;

        }

    }

