package homework_nr_4part_1;

public class Circle {
    double radius ;

    public Circle(double radius) {
        this.radius = radius;
    }

    public  double calculateArea() {
        double result = radius * radius * 3.14;
        return result;
    }

    public static void main(String[] args) {

        Circle circle = new Circle(4);


        double area = circle.calculateArea();
        System.out.println("Area= " + area);


    }
}







