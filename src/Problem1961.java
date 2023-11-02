import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1961 {

    public static int[][] Rotation(int[][] arr) {
        int[][] result = new int [arr.length][arr.length];

        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr.length; j++){
                result[i][j] = arr[arr.length - 1 - j][i];
            }
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine()); // 테스트 케이스 개수
        StringTokenizer st;

        for (int t = 1; t <= test; t++) {
            int N = Integer.parseInt(reader.readLine()); // N * N 행렬
            int[][] arr = new int[N][N];


            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(reader.readLine(), " ");
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] arr_90 = Rotation(arr);
            int[][] arr_180 = Rotation(arr_90);
            int[][] arr_270 = Rotation(arr_180);

            System.out.println("#" + t);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(arr_90[i][j]);
                }
                System.out.print(" ");

                for (int j = 0; j < N; j++) {
                    System.out.print(arr_180[i][j]);
                }
                System.out.print(" ");

                for (int j = 0; j < N; j++) {
                    System.out.print(arr_270[i][j]);
                }
                System.out.println();

            }
        }
    }
}
