import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1946 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());
        StringTokenizer st;

        for (int t = 1; t <= test; t++){
            int n = Integer.parseInt(reader.readLine());
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(reader.readLine(), " ");
                String c = st.nextToken();
                int k = Integer.parseInt(st.nextToken());

                for(int j = 0; j < k; j ++) {
                    result.append(c);
                }
            }
            System.out.println("#" + t);

            for (int i = 1; i <= result.length(); i++){
                System.out.print(result.charAt(i - 1));
                if(i % 10 == 0) {
                    System.out.println();
                }
            }

            System.out.println();
        }
    }
}
