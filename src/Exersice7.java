import java.util.Arrays;

public class Exersice7 {

    public static int[] charCodes(char[] chars) {
        int[] codes = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            codes[i] = chars[i];
        }
        return codes;
    }

    public static void main(String[] args) {
        char[] symbols = {'A', 'b', '1', 'Я'};

        int[] result = charCodes(symbols);

        System.out.println(Arrays.toString(result));
    }
}
