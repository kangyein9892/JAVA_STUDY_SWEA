import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1284  {

    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());
        StringTokenizer st;

        for (int t = 1; t <= test; t++){
            st = new StringTokenizer(reader.readLine(), " ");
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            int a = p * w;
            int b = 0;

            if (w <= r) {
                b = q;
            } else {
                b = q  + (w-r) * s;
            }

            if (a < b) {
                System.out.println("#" + t + " " + a);
            } else {
                System.out.println("#" + t + " " + b);
            }
        }
    }
}
