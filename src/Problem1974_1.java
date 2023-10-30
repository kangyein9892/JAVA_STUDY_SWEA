import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1974_1 {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int t=1; t <= test; t++) {
            int[][] sudoku = new int[10][10];
            boolean check = true;

            // 배열에 스도쿠 값 넣기
            for(int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine(), " ");

                for(int j = 0; j < 9; j++) {
                    sudoku[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 가로 검사
            for(int i = 0; i < 9; i++) {
                int[] arr = new int[10];

                for(int j = 0; j < 9; j++)
                    arr[sudoku[i][j]]++;

                for(int k = 1; k <= 9; k++) {
                    if(arr[k] == 0) {
                        check = false;
                        break;
                    }
                }
            }

            // 세로 검사
            for(int i = 0; i < 9; i++) {
                int[] arr = new int[10];

                for(int j = 0; j < 9; j++)
                    arr[sudoku[j][i]]++;

                for(int k = 1; k <= 9; k++) {
                    if(arr[k] == 0) {
                        check = false;
                        break;
                    }
                }
            }

            // 정사각형 검사

            for(int i=0; i<=6; i+=3) {
                for(int j=0; j<=6; j+=3) {
                    int[] arr = new int[10];

                    int a = i+3;
                    int b = j+3;

                    for(int x=i; x<a; x++) {
                        for(int y=j; y<b; y++) {
                            arr[sudoku[x][y]]++;
                            System.out.println("x: "+x +" y: "+ y);
                        }
                    }

                    for(int z=1; z<=9; z++) {
                        if(arr[z] == 0) {
                            check = false;
                            break;
                        }
                    }
                }
            }

            /*for (int l = 0; l < 9; l += 3){
                int[] arr = new int[10];

                for (int i =l; i < l+3; i++){
                    for (int j = 0; j < 3; j++){
                        arr[sudoku[i][j]]++;
                        System.out.println("i: "+i +" j: "+ j);
                    }
                }

                for (int m = 1; m <= 9; m++){
                    if(arr[m] == 0) {
                        check = false;
                        break;
                    }
                }
            }*/

            int result = check ? 1 : 0;

            System.out.println("#" + t + " " + result);
        }
    }
}

