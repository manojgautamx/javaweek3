package workshop3;

public class questionTwoW3 {
    public static void main(String[] args) {
        double[] numbers = {5.5, 6.3, 7.8, 9.2, 4.7};

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        double average = sum / numbers.length;

        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    }
}
