import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1954 {
    public static void main(String args[]) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 개수 입력
        int test = Integer.parseInt(reader.readLine());


        // 방향벡터 (우,하,좌,상 순서) 우는 행(y)가 증가, 하는 열(x)가 증가, 좌는 행(y)가 감소, 상은 열(X)가 감소
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for(int t = 1; t <= test; t++) {
            int num = 1;
            int x = 0, y = 0; // x가 열 y가 행
            int direction = 0;

            int N = Integer.parseInt(reader.readLine());
            int [][] arr = new int[N][N];

            while (num <= N*N){
                arr[x][y] = num++;

                x += dx[direction];
                y += dy[direction];

                // 배열에 이미 숫자가 있거나, 범위를 초과했을 때
                if(y >= N || x >= N || y < 0 || x < 0 || arr[x][y] != 0){
                    x -= dx[direction];
                    y -= dy[direction];

                    direction = (direction + 1) % 4; // 방향 전환 (방향벡터)

                    x += dx[direction];
                    y += dy[direction];
                }
            }


            // 결과 출력
            System.out.println("#" + t);

            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++)
                    System.out.print(arr[i][j] + " ");

                System.out.println();
            }
        }
    }
}

