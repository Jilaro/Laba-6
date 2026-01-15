import java.util.Arrays;

public class Exersice9 {

    public static void reverse(char[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] symbols = {'a', 'b', 'c', 'd', 'e'};

        reverse(symbols);

        System.out.println(Arrays.toString(symbols));
    }
}
