public class Exersice8 {

    public static double average(int[] array) {
        int sum = 0;
        for (int v : array) {
            sum += v;
        }
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        int[] values = {2, 4, 6, 8};

        System.out.println(average(values));
    }
}
