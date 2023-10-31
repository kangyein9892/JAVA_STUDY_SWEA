import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem2005 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());

        for (int t = 1; t <= test; t++){
            int n = Integer.parseInt(reader.readLine());

            System.out.println("#"+t);

            int [][] arr = new int [n][n];

            for (int i = 0; i < n; i++){
                for (int j = 0; j <= i; j++) {
                    if (i == j || j == 0) arr[i][j] = 1;
                    else {
                        arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                    }
                }
            }

            for (int i = 0; i < n; i++){
                for (int j = 0; j <= i; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

}
