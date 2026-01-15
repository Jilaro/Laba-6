public class Exersice4 {

    public static long doubleFactorial(int n) {
        long result = 1;
        for (int i = n; i > 0; i -= 2) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(doubleFactorial(6));
        System.out.println(doubleFactorial(5));
    }
}
