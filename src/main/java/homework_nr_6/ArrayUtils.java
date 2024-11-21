package homework_nr_6;

public class ArrayUtils {
    public static void main(String[] args) {

        int[] numbers = {10, 3, 4, 15, 21};
        int max = findMax(numbers);
        System.out.println("Max number:" + max);
        int min = findMin(numbers);
        System.out.println("Min number: " + min);

    }

    public static int findMax(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        } else {
            int max = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            return max;
        }
    }

            public static int findMin ( int[] numbers){
                if (numbers.length == 0) {
                    return 0;
                } else {
                    int min = numbers[0];
                    for (int i = 1; i < numbers.length; i++) {
                        if (numbers[i] < min) {
                            min = numbers[i];
                        }
                    }
                    return min;

                }
            }
        }





