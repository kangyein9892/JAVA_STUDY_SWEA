import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1208 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int t = 1; t <= 10; t++) {
            int dump = Integer.parseInt(reader.readLine());
            int[] arr = new int[100];
            int count = 0;
            // int result = 0;

            st = new StringTokenizer(reader.readLine(), " ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            while(!(count == dump)) {
                Arrays.sort(arr);
                arr[0]++;
                arr[99]--;
                count ++;
            }

            /*for (int i = 0; i < dump; i++) {
                Arrays.sort(arr);
                arr[0]++;
                arr[99]--;
            }*/

            Arrays.sort(arr);
            int result = arr[99] - arr[0];

            System.out.println("#" + t + " " + result);
        }
    }
}
