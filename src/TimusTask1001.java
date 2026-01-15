import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TimusTask1001 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Long> list = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens()) {
                list.add(Long.parseLong(st.nextToken()));
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            double result = Math.sqrt(list.get(i));
            System.out.printf("%.4f%n", result);
        }
    }
}
