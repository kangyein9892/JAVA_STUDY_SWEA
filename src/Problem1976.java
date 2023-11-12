import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1976 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());
        StringTokenizer st;

        for (int t = 1; t <= test; t++) {
            st = new StringTokenizer(reader.readLine(), " ");
            int first_hour = Integer.parseInt(st.nextToken());
            int first_minute = Integer.parseInt(st.nextToken());
            int second_hour = Integer.parseInt(st.nextToken());
            int second_minute = Integer.parseInt(st.nextToken());
            int hour = 0;
            int minute = 0;

            if (first_minute + second_minute >= 60) {
                minute = first_minute + second_minute - 60;
                hour = first_hour + second_hour + 1;
                if (hour > 12){
                    hour -= 12;
                }
            } else {
                minute = first_minute + second_minute;
                hour = first_hour +second_hour;
                if (hour > 12){
                    hour -= 12;
                }
            }

            System.out.println("#" + t + " " + hour + " " + minute);
        }
    }
}
