import java.util.Arrays;
import java.util.Scanner;

public class TimusTask1025 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int[] need = new int[k];

        for (int i = 0; i < k; i++) {
            int groupSize = sc.nextInt();
            need[i] = groupSize / 2 + 1;
        }

        Arrays.sort(need);

        int groupsToWin = k / 2 + 1;
        int sum = 0;

        for (int i = 0; i < groupsToWin; i++) {
            sum += need[i];
        }

        System.out.println(sum);
    }
}
