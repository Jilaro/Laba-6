public class Exersice5 {

    public static long sumOfSquares(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) i * i;
        }
        return sum;
    }

    public static long sumOfSquaresByFormula(int n) {
        return (long) n * (n + 1) * (2 * n + 1) / 6;
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(sumOfSquares(n));
        System.out.println(sumOfSquaresByFormula(n));
    }
}
