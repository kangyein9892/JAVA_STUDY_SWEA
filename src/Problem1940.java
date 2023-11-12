import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1940 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());
        StringTokenizer st;

        for (int t = 1; t <= test; t++) {
            int time = Integer.parseInt(reader.readLine());
            int rc = 0; // 속도
            int dis = 0; // 거리

            for (int i = 0; i < time; i++){
                st = new StringTokenizer(reader.readLine(), " ");
                int command = Integer.parseInt(st.nextToken());

                if(command != 0){
                    int accel = Integer.parseInt(st.nextToken()); // 가속도
                    if (command == 1) {
                        rc += accel; // 가속
                    } else {
                        if(rc < accel) {
                            rc = 0;
                        } else {
                            rc -= accel;
                        }
                    }
                }

                dis += rc;
            }

            System.out.println("#" + t + " " + dis);
        }
    }
}
