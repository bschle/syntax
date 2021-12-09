package account.teil2;

import java.util.Random;

public class RandomHelper {
    public static int[] max;

    public static double getRandomDouble(double min, double max) {
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }

    public static int getMax(int[] Account) {

        int max = Account[0];
        for (int i = 0; i < Account.length; i++) {
            if (Account[i] > max) {
                max = Account[i];
            }
        }
        return max;
    }

    public static int getMin(int[] Account) {

        int min = Account[0];
        for (int i = 0; i < Account.length; i++) {
            if (Account[i] < min) {
                min = Account[i];
                System.out.println(min);
            }
        }

        return min;
    }
}