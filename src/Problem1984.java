import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1984 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());
        StringTokenizer st;

        for (int t = 1; t <= test; t++) {
            int arr[] = new int[10];
            int sum = 0;
            // int avg = 0;
            st = new StringTokenizer(reader.readLine(), " ");

            for (int i = 0; i < 10; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            for (int i = 1; i < 9; i++){
                sum += arr[i];
            }

            double avg = sum / 8.0; // 8.0 주의하기!
            int result = (int) Math.round(avg);
            //String result = String.format("%.0f", avg);

            System.out.println("#" + t + " " + result);

        }
    }
}
