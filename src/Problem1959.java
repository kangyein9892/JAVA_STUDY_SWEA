import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1959 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());
        StringTokenizer st;

        for(int t = 1; t <= test; t++ ) {
            st = new StringTokenizer(reader.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int A[] = new int [N];
            int B[] = new int [M];


            st = new StringTokenizer(reader.readLine(), " ");
            for (int i = 0; i < N; i++){
                A[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(reader.readLine(), " ");
            for (int i = 0; i < M; i++){
                B[i] = Integer.parseInt(st.nextToken());
            }

            // B배열의 사이즈를 무조건 크게 만든다
            if (N > M){
                int temp = N;
                N = M;
                M = temp;

                int[] tempArr = A;
                A = B;
                B = tempArr;
            }

            int max = 0;

            for (int i = 0; i < M - N + 1; i++) {
                int sum = 0;
                for (int j = 0; j < N; j++){
                    sum = sum + A[j] * B[i + j];
                }
                max = Math.max(max, sum);
            }

            System.out.println("#" + t + " " + max);
        }
    }
}
