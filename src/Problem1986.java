import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1986 {
    public static void main(String args[]) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine()); // 테스트 케이스 개수

        for (int t = 1; t <= test; t++) {
            int n = Integer.parseInt(reader.readLine());
            int sum = 0;
            for(int i = 1; i <= n; i++){
                if (i % 2 == 1) {
                    sum += i;
                } else {
                    sum -= i;
                }
            }
            System.out.println("#" + t + " " + sum);
        }
    }
}
