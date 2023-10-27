import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2001_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine()); // 테스트 케이스 개수
        StringTokenizer st;

        for (int t = 1; t <= test; t++) {
            st = new StringTokenizer(reader.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());  // 배열 사이즈
            int M = Integer.parseInt(st.nextToken());  // 파리채 크기

            // 배열에 담기
            int[][] numList = new int[N][N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(reader.readLine(), " ");
                for (int j = 0; j < N; j++) {
                    numList[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 파리의 최대 합 구하기
            int max = 0;
            for (int i = 0; i <= N - M; i++) {
                for (int j = 0; j <= N - M; j++) {
                    int sum = 0;

                    for (int k = 0; k < M; k++) {
                        for (int l = 0; l < M; l++) {
                            sum = sum + numList[i + k][j + l];
                        }
                    }

                    if(sum > max){
                        max = sum;
                    }
                }
            }

            System.out.println("#" + t + " " + max);
        }
    }

}
