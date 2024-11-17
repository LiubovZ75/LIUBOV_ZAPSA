package homework_nr_5;

public class HomeWorkNr5 {
    public static void main(String[] args) {

        int[] numbers = new int[101];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 100 - i;
        }
        for (int number : numbers) {
            System.out.println(number + " ");
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];

            }
        }
        System.out.println("SummaOfEven = " + sum);


        long multiplication = 1L;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                multiplication *= numbers[i];
            }
        }
        System.out.println("Multiplication= " + multiplication);


        int[] copyNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            copyNumbers[i] = numbers[i];
        }
        for (int num : copyNumbers) {
            System.out.println(num + " ");
        }
    }
}



