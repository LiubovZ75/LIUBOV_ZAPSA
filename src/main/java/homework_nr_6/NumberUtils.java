package homework_nr_6;

public class NumberUtils {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void findPrimesInArray(int[] numbers) {
        System.out.println("Простые числа в массиве: ");
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.println(number + " ");
            }
        }
        System.out.println();
    }
}
