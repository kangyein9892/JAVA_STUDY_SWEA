import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Problem1926_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine()); // 배열 길이
        String[] arr = new String[N];

        // 리스트 값 설정
        for (int i = 0; i < N; i++) {
            arr[i] = valid(String.valueOf((i + 1)));

            System.out.print(arr[i] + " ");
        }
    }

    // 3의 배수를 검사하는 함수
    private static String valid(String num){
        int cnt = 0;

        for (int i = 0; i < num.length(); i++) {;
            if(num.charAt(i) == '3' || num.charAt(i) == '6' ||  num.charAt(i) == '9'){
                cnt ++;
            }
        }

        if(cnt == 1){
            num = "-";
        }

        if(cnt == 2){
            num = "--";
        }
        if(cnt == 3) {
            num = "---";
        }

        return num;
    }
}
