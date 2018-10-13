import java.util.Arrays;
import java.util.Random;

public class Main {
    //    up to 2^size
    final static int powersize = 13;
    final static int size = (int) Math.pow(2, powersize);
    final static int testcases = 10;

    public static void main(String[] args) {
        long TimeSum = 0;
        Random R = new Random();
        int[] array = null;
        for (int i = 0; i < testcases; i++) {
            array = new int[size];
            Arrays.fill(array, R.nextInt());
            long start = System.nanoTime();
            Arrays.sort(array);
            long time = System.nanoTime() - start;
            TimeSum += time;

        }
        long averagetime = TimeSum / testcases;
        System.out.println(averagetime);

        // write your code here
    }
}
