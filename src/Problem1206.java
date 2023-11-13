import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1206 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int t = 1; t <= 10; t++) {
            int n = Integer.parseInt(reader.readLine());
            int arr[] = new int[n];
            int cal[] = new int[4];
            int result = 0;
            st = new StringTokenizer(reader.readLine(), " ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 2; i < arr.length - 2; i++) {
                if (arr[i] > arr[i-2]  && arr [i] > arr[i-1] && arr[i] > arr[i+1] && arr[i] > arr[i+2]) {
                    cal[0] = arr[i-2];
                    cal[1] = arr[i-1];
                    cal[2] = arr[i+1];
                    cal[3] = arr[i+2];
                    Arrays.sort(cal);
                    result += arr[i] - cal[3];
                }
            }

            System.out.println("#" + t + " " + result);
        }
    }
}
