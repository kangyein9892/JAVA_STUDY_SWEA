import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1979 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test  = Integer.parseInt(reader.readLine());
        StringTokenizer st;

        for (int t = 1; t <= test; t++) {
            st = new StringTokenizer(reader.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            // 배열에 담기
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(reader.readLine(), " ");
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int result = 0;

            // 가로 탐색
            for (int i = 0; i < N; i++) {
                int count = 0;

                for (int j = 0; j < N; j++) {
                    if (arr[i][j] == 1){
                        while (j < N && arr[i][j] == 1){
                            count++;
                            j++;
                        }

                        if (count == K){
                            result++;
                        }

                        count = 0;
                    }
                }
            }

            // 세로 탐색
            for (int j = 0; j < N; j++) {
                int count = 0;

                for (int i = 0; i < N; i++) {
                    if (arr[i][j] == 1){
                        while (i < N && arr[i][j] == 1){
                            count++;
                            i++;
                        }

                        if (count == K){
                            result++;
                        }

                        count = 0;
                    }
                }
            }

            System.out.println("#" + t + " " + result);
        }
    }
}

