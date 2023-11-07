import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1948 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());
        StringTokenizer st;
        int dates[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 시작 월 총 날짜 - 입력된 시작 날짜 + 중간 월의 총 날짜 + 입력된 마지막 날짜 +1

        for (int t = 1; t <= test; t++){
            st = new StringTokenizer(reader.readLine(), " ");
            int result = 0;
            int month1 = Integer.parseInt(st.nextToken());
            int date1 = Integer.parseInt(st.nextToken());
            int month2 = Integer.parseInt(st.nextToken());
            int date2 = Integer.parseInt(st.nextToken());

            for (int i = month1; i < month2; i++) {
                result += dates[i - 1];
            }

            result = result - date1 + date2 + 1;

            System.out.println("#" + t + " " + result);

        }
    }
}
