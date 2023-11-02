import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem1983 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());
        String[] grades = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
        StringTokenizer st;

        for(int t = 1; t <= test; t++ ) {
            st = new StringTokenizer(reader.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            Double[] scores = new Double[N];

            for (int i = 0; i < N; i++){
                st = new StringTokenizer(reader.readLine(), " ");
                int middle_scores = Integer.parseInt(st.nextToken());
                int final_scores = Integer.parseInt(st.nextToken());
                int task_scores = Integer.parseInt(st.nextToken());
                scores[i] = (middle_scores * 0.35) + (final_scores * 0.45) + (task_scores * 0.2);
            }

            double score = scores[K - 1];
            Arrays.sort(scores, Collections.reverseOrder());
            int index = 0;
            int count = 0;
            for (int i = 0; i < scores.length; i ++){
                if (scores[i] == score){
                    index = i;
                    count++;
                }
            }

            int grade = index / (N / 10);

            if(count == 1) {
                System.out.println("#" + t + " " + grades[grade]);
            }
        }
    }
}
