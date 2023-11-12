import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1285 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());
        StringTokenizer st;

        for (int t = 1; t <= test; t++) {
            int people = Integer.parseInt(reader.readLine());
            int[] dis = new int[people];
            st = new StringTokenizer(reader.readLine(), " ");

            for (int i = 0; i < people; i++){
                dis[i] = Math.abs(Integer.parseInt(st.nextToken()));
            }

            Arrays.sort(dis);

            int count = 1;
            int min = dis[0];

            for (int i = 1; i < dis.length; i++) {
                if(min == dis[i]) {
                    count ++;
                }
            }

            System.out.println("#" + t + " " + min + " " + count);
        }
    }
}
