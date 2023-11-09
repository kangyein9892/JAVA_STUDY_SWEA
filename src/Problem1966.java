import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1966 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());
        StringTokenizer st;

        for (int t = 1; t <= test; t++) {
            int n = Integer.parseInt(reader.readLine());
            int arr[] = new int[n];
            st = new StringTokenizer(reader.readLine(), " ");

            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i] = num;
            }

            Arrays.sort(arr);

            System.out.print("#" + t);

            for (int i = 0; i < n; i++){
                System.out.print(" " + arr[i]);
            }

            System.out.println();
        }
    }
}
