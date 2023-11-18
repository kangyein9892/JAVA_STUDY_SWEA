import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1209 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int t = 1; t <= 10; t++) {
            int n = Integer.parseInt(reader.readLine());
            int max = 0;

            int[][] arr = new int[100][100];

            for(int i = 0; i < 100; i++){
                st = new StringTokenizer(reader.readLine(), " ");
                for(int j = 0; j < 100; j++){
                    arr[i][j]  = Integer.parseInt(st.nextToken());
                }
            }

            int sum3 = 0;
            int sum4 = 0;
            for(int i = 0; i < 100; i++){
                int sum1 = 0;
                int sum2 = 0;
                for (int j = 0; j < 100; j++){
                    sum1 += arr[i][j];
                    sum2 += arr[j][i];
                }
                max = Math.max(max, Math.max(sum1, sum2));

                sum3 += arr[i][i];
                sum4 += arr[i][99-i];
            }

            max = Math.max(max, Math.max(sum3, sum4));

            System.out.println("#" + t + " " + max);
        }
    }
}
