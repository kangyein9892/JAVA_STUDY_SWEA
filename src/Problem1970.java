import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1970 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());

        for (int t = 1; t <= test; t++){
            int[] moneys = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
            int[] result = new int [moneys.length];
            int N = Integer.parseInt(reader.readLine());

            for (int i = 0; i < moneys.length; i++){
                result[i] = N / moneys[i];
                N %= moneys[i];
            }
            System.out.println("#" + t);

            for (int i = 0; i < result.length; i++){
                System.out.print(result[i] + " ");
            }

            System.out.println();
        }
    }
}
