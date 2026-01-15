import java.util.Arrays;

public class Exersice10 {

    public static int[] minMax(int... values) {
        int min = values[0];
        int max = values[0];

        for (int v : values) {
            if (v < min) {
                min = v;
            }
            if (v > max) {
                max = v;
            }
        }

        return new int[]{max, min};
    }

    public static void main(String[] args) {
        int[] result = minMax(3, 7, 2, 9, 4);

        System.out.println(Arrays.toString(result));
    }
}
