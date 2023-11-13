import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1244 {

    static int move, result;
    static int[] arr;
    static String str;
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(reader.readLine());
        StringTokenizer st;

        for (int t = 1; t <= test; t++) {
            st = new StringTokenizer(reader.readLine(), " ");
            String number = st.nextToken();
            move = Integer.parseInt(st.nextToken());
            result = 0;
            arr = new int[number.length()];

            for (int i = 0; i< arr.length; i++) {
                arr[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
            }

            if(arr.length < move) {	// swap 횟수가 자릿수보다 클 때
                move = arr.length;	// 자릿수만큼만 옮겨도 전부 옮길 수 있음
            }

            dfs(0,0);

            System.out.println("#" + t + " " +result);
        }
    }

    public static void dfs(int k, int cnt){
        int temp;
        if(cnt == move) {
            str = "";
            // str = Arrays.toString(arr);
            Arrays.stream(arr).forEach(x-> str += String.valueOf(x)); // 배열을 문자로 변환
            result = Math.max(result, Integer.parseInt(str)); // 문자를 다시 숫자로 변환하여 값 비교
            return;
        }

        for (int i = k; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    dfs(i, cnt + 1);

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

            }
        }
    }
}
