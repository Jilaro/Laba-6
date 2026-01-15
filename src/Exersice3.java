public class Exersice3 {

    public static int max(int... values) {
        int m = values[0];
        for (int v : values) {
            if (v > m) {
                m = v;
            }
        }
        return m;
    }

    public static int min(int... values) {
        int m = values[0];
        for (int v : values) {
            if (v < m) {
                m = v;
            }
        }
        return m;
    }

    public static double average(int... values) {
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        return (double) sum / values.length;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 4};

        System.out.println(max(numbers));
        System.out.println(min(numbers));
        System.out.println(average(numbers));
    }
}
