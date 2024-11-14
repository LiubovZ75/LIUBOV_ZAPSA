package nomework_nr4_part2;

    public class TemperatureConverter {

        public static void main(String[] args) {
            TemperatureConverter converter = new TemperatureConverter();

            double celsius = 35;
            double fahrenheiit = 43;
            double resultFahrenheir1 =converter.toFahrenheit(35);
            System.out.println("35C to Fahrenheit: " + resultFahrenheir1 + "F");
            double resultFahrenheir2 =converter.toFahrenheit(55);
            System.out.println("55C to Fahrenheit: " + resultFahrenheir2 + "F");
            double resultCelsius1 = converter.toCelsius(68);
            System.out.println("68F toCelsius: " + resultCelsius1 + "C");
            double resultCelsius2 = converter.toCelsius(95);
            System.out.println("95F toCelsius: " + resultCelsius2 + "C");
        }



        public  double toFahrenheit(double celsius) {
            double result = celsius * 1.8 + 32;
            return result;
        }

        public  double toCelsius(double fahrenheit) {
            double result1 = (fahrenheit - 32) / 1.8;
            return result1;
        }

    }

























