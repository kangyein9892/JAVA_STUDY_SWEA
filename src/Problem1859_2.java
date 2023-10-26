import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1859_2 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(reader.readLine()); // 테스트 케이스

        // 테스트 케이스 값만큼 반복

        for (int i = 1; i <= t; i++) {

            int n = Integer.parseInt(reader.readLine());// 한 케이스의 날짜 수
            StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
            int array[] = new int[n]; // 날짜마다의 매매가 배열

            // 배열에 매매가 대입
            for (int j = 0; j < n; j++ ){
                array[j] = Integer.parseInt(st.nextToken());
            }

            long sum = 0; // 최대 이익값
            long max = 0; // 최대 매매값

            // 배열의 마지막부터 시작
            for (int k = array.length-1; k >= 0; k--) {
                // 최대 매매값이 배열값보다 클 때
                if(max > array[k]){
                    sum += max - array[k]; // 매매값에서 배열값 뺀만큼 이익값에 더해주기
                }
                // 최대 매매값이 배열값보다 작거나 같을 때
                else {
                    max = array[k]; // 최대 매매값을 배열값으로 대입
                }
            }

            System.out.println("#"+i+" "+sum); // 출력
        }
    }
}
