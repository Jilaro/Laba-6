import java.util.Arrays;

public class Exersice6 {

    public static int[] takeFirst(int[] array, int count) {
        if (count >= array.length) {
            return Arrays.copyOf(array, array.length);
        }
        return Arrays.copyOf(array, count);
    }

    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};

        int[] a = takeFirst(source, 3);
        int[] b = takeFirst(source, 10);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
