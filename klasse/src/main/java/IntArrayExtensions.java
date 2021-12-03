import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class IntArrayExtensions {

    public static void main(String[] args) {
        int[] tenRandomNumber = getRandomNumbersInRange(10, 0, 9);
        System.out.println("Zufällige Zahlen: " + Arrays.toString(tenRandomNumber));
        System.out.println("Kleinster Wert: " + getMin(tenRandomNumber));
        System.out.println("Grösster Wert: " + getMax(tenRandomNumber));
        System.out.println("Durchschnitt: " + getAverage(tenRandomNumber));
        System.out.println("rückwärts: " + Arrays.toString(reverse(tenRandomNumber)));
        System.out.println("sortiert: " + Arrays.toString(sort(tenRandomNumber)));
        System.out.println("sortiert und rückwärts: " + Arrays.toString(reverse(sort(tenRandomNumber))));
        System.out.println("sortiert und wieder gemischt: " + Arrays.toString(mix(sort(tenRandomNumber))));
    }

    /**
     * Creates an array with random number.
     * @param size The size of the array.
     * @param min The smallest possible generated number.
     * @param max The biggest possible generated number.
     * @return the generated int array.
     */
    static int[] getRandomNumbersInRange(int size, int min, int max){
        Random random = new Random();
        return random.ints(size, min, max).toArray();
    }
    static OptionalInt getMax(int[] elements) {
        OptionalInt maximum = Arrays.stream(elements).max();
        return maximum; // TODO
    }
    static OptionalInt getMin(int[] elements) {
        OptionalInt minimum = Arrays.stream(elements).min();
        return minimum; // TODO
    }
    static double getAverage(int[] elements) {
        double sum = 0;
        for (int i = 0;i < elements.length; i++)
            sum += elements[i];
        double avarage = sum / elements.length;
        return avarage; // TODO
    }
    static int[] sort(int[] elements) {
        return null; // TODO
    }
    static int[] reverse(int[] elements) {
        return null; // TODO
    }
    static int[] mix(int[] elements) {
        return null; // TODO
    }
}
